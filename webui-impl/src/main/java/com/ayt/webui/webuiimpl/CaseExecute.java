package com.ayt.webui.webuiimpl;

import com.alibaba.fastjson.JSON;
import com.ayt.webui.webuiapi.ProjectCaseProvider;
import com.ayt.webui.webuiapi.ProjectCaseStepsProvider;
import com.ayt.webui.webuimapper.entity.ProjectCaseSteps;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.testng.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;


/**
 * Description
 * Author ayt  on
 */
@Component
@EnableScheduling
public class CaseExecute {

    private static Logger logger = LoggerFactory.getLogger(CaseExecute.class);
    @Resource
    ProjectCaseProvider projectCaseProvider;
    @Resource
    ProjectCaseStepsProvider projectCaseStepsProvider;

    @Scheduled(cron = "0 0/2 * * * ? ")
    public void doExecute() throws InterruptedException {

        logger.info("执行时间是："+ new Date());
        WebDriver webDriver = WebDriverInitialization.setWebDriver();
        List<ProjectCaseSteps> projectCaseStepsList = projectCaseStepsProvider.getProjectCaseSteps(1);
        logger.info("步骤是："+ JSON.toJSONString(projectCaseStepsList));
        caseExcution(webDriver, projectCaseStepsList);
    }

    public static void caseExcution(WebDriver webDriver, List<ProjectCaseSteps> steps) throws InterruptedException {
        for (ProjectCaseSteps step : steps) {
            //元素路径
            String path = step.getStepPath();
            //操作
            String opration = step.getStepOperation();
            //参数值
            String stepParams = step.getStepParameters();
            //动作
            String action = step.getAction();
            //预期结果
            String result = step.getExpectedResult();
            //执行的结果
            String doResult = "";
            //TODO 运行后比较
            ExecuteStep.runStep(webDriver, path, opration, stepParams, doResult);
            doAction(action);
            checkResult(doResult, result);
        }
    }

    public static void doAction(String action) throws InterruptedException {
        sleep(1000);
    }

    public static void checkResult(String actual, String except) {
        try {
            Assert.assertEquals(actual, except, "数据不一致");
        } catch (AssertionError error) {
            error.getMessage();
        }

    }


}
