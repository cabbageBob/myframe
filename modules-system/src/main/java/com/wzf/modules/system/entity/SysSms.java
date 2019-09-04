package com.wzf.modules.system.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysSms implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "消息标题")
    private String esTitle;

    @ApiModelProperty(value = "发送方式：1短信 2邮件 3微信")
    private String esType;

    @ApiModelProperty(value = "接收人")
    private String esReceiver;

    @ApiModelProperty(value = "发送所需参数Json格式")
    private String esParam;

    @ApiModelProperty(value = "推送时间")
    private Date esSendTime;

    @ApiModelProperty(value = "推送状态 0未推送 1推送成功 2推送失败 -1失败不再发送")
    private String esSendStatus;

    @ApiModelProperty(value = "发送次数 超过5次不再发送")
    private Integer esSendNum;

    @ApiModelProperty(value = "推送失败原因")
    private String esResult;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人登录名称")
    private String createBy;

    @ApiModelProperty(value = "创建日期")
    private Date createTime;

    @ApiModelProperty(value = "更新人登录名称")
    private String updateBy;

    @ApiModelProperty(value = "更新日期")
    private Date updateTime;

    @ApiModelProperty(value = "推送内容")
    private String esContent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEsTitle() {
        return esTitle;
    }

    public void setEsTitle(String esTitle) {
        this.esTitle = esTitle;
    }

    public String getEsType() {
        return esType;
    }

    public void setEsType(String esType) {
        this.esType = esType;
    }

    public String getEsReceiver() {
        return esReceiver;
    }

    public void setEsReceiver(String esReceiver) {
        this.esReceiver = esReceiver;
    }

    public String getEsParam() {
        return esParam;
    }

    public void setEsParam(String esParam) {
        this.esParam = esParam;
    }

    public Date getEsSendTime() {
        return esSendTime;
    }

    public void setEsSendTime(Date esSendTime) {
        this.esSendTime = esSendTime;
    }

    public String getEsSendStatus() {
        return esSendStatus;
    }

    public void setEsSendStatus(String esSendStatus) {
        this.esSendStatus = esSendStatus;
    }

    public Integer getEsSendNum() {
        return esSendNum;
    }

    public void setEsSendNum(Integer esSendNum) {
        this.esSendNum = esSendNum;
    }

    public String getEsResult() {
        return esResult;
    }

    public void setEsResult(String esResult) {
        this.esResult = esResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEsContent() {
        return esContent;
    }

    public void setEsContent(String esContent) {
        this.esContent = esContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", esTitle=").append(esTitle);
        sb.append(", esType=").append(esType);
        sb.append(", esReceiver=").append(esReceiver);
        sb.append(", esParam=").append(esParam);
        sb.append(", esSendTime=").append(esSendTime);
        sb.append(", esSendStatus=").append(esSendStatus);
        sb.append(", esSendNum=").append(esSendNum);
        sb.append(", esResult=").append(esResult);
        sb.append(", remark=").append(remark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", esContent=").append(esContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}