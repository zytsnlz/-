package cn.edu.ncst.car.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 自定义返回的用户通行证申请记录
 */
public class MainLicenseApplyInfo implements Serializable {

    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "用户类型，1-企业用户，0-个人用户")
    private Integer user_type;

    @ApiModelProperty(value = "通行证类型")
    private String passLicenseType;

    @ApiModelProperty(value = "车牌号")
    private String plateNo;

    @ApiModelProperty(value = "车牌类型")
    private String plateType;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "申请日期")
    private Date applyCreatetime;

    @ApiModelProperty(value = "申请路线")
    private String applyRoute;

    @ApiModelProperty(value = "起点位置")
    private String startPosition;

    @ApiModelProperty(value = "终点位置")
    private String endPosition;

    @ApiModelProperty(value = "1-审核通过，0-未审核，2-审核未通过")
    private Integer status;

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassLicenseType() {
        return passLicenseType;
    }

    public void setPassLicenseType(String passLicenseType) {
        this.passLicenseType = passLicenseType;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
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

    public Date getApplyCreatetime() {
        return applyCreatetime;
    }

    public void setApplyCreatetime(Date applyCreatetime) {
        this.applyCreatetime = applyCreatetime;
    }

    public String getApplyRoute() {
        return applyRoute;
    }

    public void setApplyRoute(String applyRoute) {
        this.applyRoute = applyRoute;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MainLicenseApplyInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", user_type=" + user_type +
                ", passLicenseType='" + passLicenseType + '\'' +
                ", plateNo='" + plateNo + '\'' +
                ", plateType='" + plateType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", applyCreatetime=" + applyCreatetime +
                ", applyRoute='" + applyRoute + '\'' +
                ", startPosition='" + startPosition + '\'' +
                ", endPosition='" + endPosition + '\'' +
                ", status=" + status +
                '}';
    }
}
