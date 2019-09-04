package com.wzf.modules.system.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JeecgProjectNatureIncome implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "项目性质")
    private String nature;

    @ApiModelProperty(value = "保险经纪佣金费")
    private BigDecimal insuranceFee;

    @ApiModelProperty(value = "风险咨询费")
    private BigDecimal riskConsultingFee;

    @ApiModelProperty(value = "承保公估评估费")
    private BigDecimal evaluationFee;

    @ApiModelProperty(value = "保险公估费")
    private BigDecimal insuranceEvaluationFee;

    @ApiModelProperty(value = "投标咨询费")
    private BigDecimal biddingConsultingFee;

    @ApiModelProperty(value = "内控咨询费")
    private BigDecimal interolConsultingFee;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public BigDecimal getRiskConsultingFee() {
        return riskConsultingFee;
    }

    public void setRiskConsultingFee(BigDecimal riskConsultingFee) {
        this.riskConsultingFee = riskConsultingFee;
    }

    public BigDecimal getEvaluationFee() {
        return evaluationFee;
    }

    public void setEvaluationFee(BigDecimal evaluationFee) {
        this.evaluationFee = evaluationFee;
    }

    public BigDecimal getInsuranceEvaluationFee() {
        return insuranceEvaluationFee;
    }

    public void setInsuranceEvaluationFee(BigDecimal insuranceEvaluationFee) {
        this.insuranceEvaluationFee = insuranceEvaluationFee;
    }

    public BigDecimal getBiddingConsultingFee() {
        return biddingConsultingFee;
    }

    public void setBiddingConsultingFee(BigDecimal biddingConsultingFee) {
        this.biddingConsultingFee = biddingConsultingFee;
    }

    public BigDecimal getInterolConsultingFee() {
        return interolConsultingFee;
    }

    public void setInterolConsultingFee(BigDecimal interolConsultingFee) {
        this.interolConsultingFee = interolConsultingFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nature=").append(nature);
        sb.append(", insuranceFee=").append(insuranceFee);
        sb.append(", riskConsultingFee=").append(riskConsultingFee);
        sb.append(", evaluationFee=").append(evaluationFee);
        sb.append(", insuranceEvaluationFee=").append(insuranceEvaluationFee);
        sb.append(", biddingConsultingFee=").append(biddingConsultingFee);
        sb.append(", interolConsultingFee=").append(interolConsultingFee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}