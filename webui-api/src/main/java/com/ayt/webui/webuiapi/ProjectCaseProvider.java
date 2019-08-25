package com.ayt.webui.webuiapi;

import com.ayt.webui.webuimapper.entity.ProjectCase;

/**
 * 项目用例管理
 * Created by ayt
 * just try
 */
public interface ProjectCaseProvider {
    /**
     * 通过caseId获取case
     * @param caseId
     * @return
     */
    ProjectCase getProjectCase(Integer caseId);
}
