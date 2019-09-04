package com.wzf.modules.system.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JeecgMonthlyGrowthAnalysis implements Serializable {
    private Integer id;

    private String year;

    @ApiModelProperty(value = "月份")
    private String month;

    @ApiModelProperty(value = "佣金/主营收入")
    private BigDecimal mainIncome;

    @ApiModelProperty(value = "其他收入")
    private BigDecimal otherIncome;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getMainIncome() {
        return mainIncome;
    }

    public void setMainIncome(BigDecimal mainIncome) {
        this.mainIncome = mainIncome;
    }

    public BigDecimal getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(BigDecimal otherIncome) {
        this.otherIncome = otherIncome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", mainIncome=").append(mainIncome);
        sb.append(", otherIncome=").append(otherIncome);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}