package com.ayt.webui.webuimapper.entity;

import java.util.Date;

public class ProjectCaseSteps {
    /**
     * 步骤ID step_id
     */
    private Integer stepId;

    /**
     * 用例ID case_id
     */
    private Integer caseId;

    /**
     * 项目ID project_id
     */
    private Integer projectId;

    /**
     * 步骤序号 step_serial_number
     */
    private Integer stepSerialNumber;

    /**
     * 包路径|定位路径 step_path
     */
    private String stepPath;

    /**
     * 方法名|操作 step_operation
     */
    private String stepOperation;

    /**
     * 参数 step_parameters
     */
    private String stepParameters;

    /**
     * 步骤动作 action
     */
    private String action;

    /**
     * 预期结果 expected_result
     */
    private String expectedResult;

    /**
     * 默认类型 0 HTTP接口 1 Web UI 2 API驱动  3移动端 step_type
     */
    private Integer stepType;

    /**
     * 扩展字段，可用于备注、存储HTTP模板等 extend
     */
    private String extend;

    /**
     * 创建者 create_by
     */
    private String createBy;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 更新者 update_by
     */
    private String updateBy;

    /**
     * 更新时间 update_time
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_id
     *
     * @return the value of project_case_steps.step_id
     *
     * @mbg.generated
     */
    public Integer getStepId() {
        return stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_id
     *
     * @param stepId the value for project_case_steps.step_id
     *
     * @mbg.generated
     */
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.case_id
     *
     * @return the value of project_case_steps.case_id
     *
     * @mbg.generated
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.case_id
     *
     * @param caseId the value for project_case_steps.case_id
     *
     * @mbg.generated
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.project_id
     *
     * @return the value of project_case_steps.project_id
     *
     * @mbg.generated
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.project_id
     *
     * @param projectId the value for project_case_steps.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_serial_number
     *
     * @return the value of project_case_steps.step_serial_number
     *
     * @mbg.generated
     */
    public Integer getStepSerialNumber() {
        return stepSerialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_serial_number
     *
     * @param stepSerialNumber the value for project_case_steps.step_serial_number
     *
     * @mbg.generated
     */
    public void setStepSerialNumber(Integer stepSerialNumber) {
        this.stepSerialNumber = stepSerialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_path
     *
     * @return the value of project_case_steps.step_path
     *
     * @mbg.generated
     */
    public String getStepPath() {
        return stepPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_path
     *
     * @param stepPath the value for project_case_steps.step_path
     *
     * @mbg.generated
     */
    public void setStepPath(String stepPath) {
        this.stepPath = stepPath == null ? null : stepPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_operation
     *
     * @return the value of project_case_steps.step_operation
     *
     * @mbg.generated
     */
    public String getStepOperation() {
        return stepOperation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_operation
     *
     * @param stepOperation the value for project_case_steps.step_operation
     *
     * @mbg.generated
     */
    public void setStepOperation(String stepOperation) {
        this.stepOperation = stepOperation == null ? null : stepOperation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_parameters
     *
     * @return the value of project_case_steps.step_parameters
     *
     * @mbg.generated
     */
    public String getStepParameters() {
        return stepParameters;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_parameters
     *
     * @param stepParameters the value for project_case_steps.step_parameters
     *
     * @mbg.generated
     */
    public void setStepParameters(String stepParameters) {
        this.stepParameters = stepParameters == null ? null : stepParameters.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.action
     *
     * @return the value of project_case_steps.action
     *
     * @mbg.generated
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.action
     *
     * @param action the value for project_case_steps.action
     *
     * @mbg.generated
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.expected_result
     *
     * @return the value of project_case_steps.expected_result
     *
     * @mbg.generated
     */
    public String getExpectedResult() {
        return expectedResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.expected_result
     *
     * @param expectedResult the value for project_case_steps.expected_result
     *
     * @mbg.generated
     */
    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult == null ? null : expectedResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.step_type
     *
     * @return the value of project_case_steps.step_type
     *
     * @mbg.generated
     */
    public Integer getStepType() {
        return stepType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.step_type
     *
     * @param stepType the value for project_case_steps.step_type
     *
     * @mbg.generated
     */
    public void setStepType(Integer stepType) {
        this.stepType = stepType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.extend
     *
     * @return the value of project_case_steps.extend
     *
     * @mbg.generated
     */
    public String getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.extend
     *
     * @param extend the value for project_case_steps.extend
     *
     * @mbg.generated
     */
    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.create_by
     *
     * @return the value of project_case_steps.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.create_by
     *
     * @param createBy the value for project_case_steps.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.create_time
     *
     * @return the value of project_case_steps.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.create_time
     *
     * @param createTime the value for project_case_steps.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.update_by
     *
     * @return the value of project_case_steps.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.update_by
     *
     * @param updateBy the value for project_case_steps.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_case_steps.update_time
     *
     * @return the value of project_case_steps.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_case_steps.update_time
     *
     * @param updateTime the value for project_case_steps.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}