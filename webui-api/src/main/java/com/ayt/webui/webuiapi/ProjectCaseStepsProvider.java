package com.ayt.webui.webuiapi;

import com.ayt.webui.webuimapper.entity.ProjectCaseSteps;

import java.util.List;

/**
 * Created by ayt on ${DTAE}
 * just try
 */
public interface ProjectCaseStepsProvider {
    /**
     * 通过用例ID获取用例具体的步骤
     *
     * @param caseId
     * @return
     */
    List<ProjectCaseSteps> getProjectCaseSteps(Integer caseId);
}
