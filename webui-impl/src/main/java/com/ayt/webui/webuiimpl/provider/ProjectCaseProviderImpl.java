package com.ayt.webui.webuiimpl.provider;

import com.ayt.webui.webuiapi.ProjectCaseProvider;
import com.ayt.webui.webuimapper.entity.ProjectCase;
import com.ayt.webui.webuimapper.entity.ProjectCaseExample;
import com.ayt.webui.webuimapper.mapper.ProjectCaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description
 * Author ayt  on
 */
@Service
public class ProjectCaseProviderImpl implements ProjectCaseProvider {

    @Autowired
    ProjectCaseMapper projectCaseMapper;



    @Override
    public ProjectCase getProjectCase(Integer caseId) {
        ProjectCaseExample example = new ProjectCaseExample();
        example.createCriteria().andCaseIdEqualTo(caseId);
        return projectCaseMapper.selectByExample(example).get(0);
    }
}
