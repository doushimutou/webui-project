package com.ayt.webui.webuimapper.mapper;

import com.ayt.webui.webuimapper.entity.ProjectCaseParams;
import com.ayt.webui.webuimapper.entity.ProjectCaseParamsExample;
import java.util.List;

public interface ProjectCaseParamsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer paramsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    int insert(ProjectCaseParams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    int insertSelective(ProjectCaseParams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    List<ProjectCaseParams> selectByExample(ProjectCaseParamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    ProjectCaseParams selectByPrimaryKey(Integer paramsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectCaseParams record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_case_params
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectCaseParams record);
}