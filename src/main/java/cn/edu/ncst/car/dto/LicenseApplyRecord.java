package cn.edu.ncst.car.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 用户通行证申请审核记录
 */
public class LicenseApplyRecord {



    private Integer userId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "通行证类型")
    private String passLicenseType;

    @ApiModelProperty(value = "起点位置")
    private String startPosition;

    @ApiModelProperty(value = "终点位置")
    private String endPosition;

    @ApiModelProperty(value = "申请路线")
    private String applyRoute;

    @ApiModelProperty(value = "1-审核通过，0-未审核，2-审核未通过")
    private Integer status;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPassLicenseType() {
        return passLicenseType;
    }

    public void setPassLicenseType(String passLicenseType) {
        this.passLicenseType = passLicenseType;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }

    public String getApplyRoute() {
        return applyRoute;
    }

    public void setApplyRoute(String applyRoute) {
        this.applyRoute = applyRoute;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LicenseApplyRecord{" +
                "userId=" + userId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", passLicenseType='" + passLicenseType + '\'' +
                ", startPosition='" + startPosition + '\'' +
                ", endPosition='" + endPosition + '\'' +
                ", applyRoute='" + applyRoute + '\'' +
                ", status=" + status +
                '}';
    }
}
