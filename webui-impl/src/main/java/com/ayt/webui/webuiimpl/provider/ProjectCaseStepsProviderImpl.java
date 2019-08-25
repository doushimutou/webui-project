package com.ayt.webui.webuiimpl.provider;

import com.ayt.webui.webuiapi.ProjectCaseStepsProvider;
import com.ayt.webui.webuimapper.entity.ProjectCaseSteps;
import com.ayt.webui.webuimapper.entity.ProjectCaseStepsExample;
import com.ayt.webui.webuimapper.mapper.ProjectCaseStepsMapper;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 * Author ayt  on
 */
@Service
public class ProjectCaseStepsProviderImpl implements ProjectCaseStepsProvider {
    @Resource
    ProjectCaseStepsMapper projectCaseStepsMapper;

    @Override
    public List<ProjectCaseSteps> getProjectCaseSteps(Integer caseId) {
        ProjectCaseStepsExample projectCaseStepsExample = new ProjectCaseStepsExample();
        projectCaseStepsExample.createCriteria().andCaseIdEqualTo(caseId);
        return projectCaseStepsMapper.selectByExample(projectCaseStepsExample);

    }
}
