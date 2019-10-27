package cn.edu.ncst.car.dto;

import cn.edu.ncst.car.mbg.model.LicenseImageCompany;
import cn.edu.ncst.car.mbg.model.LicenseImagePerson;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class EntireLicenseApplyInfo {

    @ApiModelProperty(value = "单位通行证申请需要的证件图片信息")
    private LicenseImageCompany licenseImageCompany;

    @ApiModelProperty(value = "个人通行证所需要的证件图片信息")
    private LicenseImagePerson licenseImagePerson;

    private Integer id;

    private Integer userId;

    private Integer imageCompanyId;

    private Integer imagePersonId;

    @ApiModelProperty(value = "车牌号")
    private String plateNo;

    @ApiModelProperty(value = "车牌类型")
    private String plateType;

    @ApiModelProperty(value = "通行证类型")
    private String passLicenseType;

    @ApiModelProperty(value = "起点位置")
    private String startPosition;

    @ApiModelProperty(value = "终点位置")
    private String endPosition;

    @ApiModelProperty(value = "申请路线")
    private String applyRoute;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "开始日期")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "司机姓名")
    private String driverName;

    @ApiModelProperty(value = "身份证号码")
    private String driverIdcardNo;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "申请日期")
    private Date applyCreatetime;

    @ApiModelProperty(value = "后台管理处理日期")
    private Date dealTime;

    @ApiModelProperty(value = "审核反馈")
    private String comment;

    @ApiModelProperty(value = "1-审核通过，0-未审核，2-审核未通过")
    private Integer status;

    @ApiModelProperty(value = "处理该申请记录的后台管理员")
    private Integer handlerId;

    public LicenseImageCompany getLicenseImageCompany() {
        return licenseImageCompany;
    }

    public void setLicenseImageCompany(LicenseImageCompany licenseImageCompany) {
        this.licenseImageCompany = licenseImageCompany;
    }

    public LicenseImagePerson getLicenseImagePerson() {
        return licenseImagePerson;
    }

    public void setLicenseImagePerson(LicenseImagePerson licenseImagePerson) {
        this.licenseImagePerson = licenseImagePerson;
    }

    private static final long serialVersionUID = 1L;

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

    public Integer getImageCompanyId() {
        return imageCompanyId;
    }

    public void setImageCompanyId(Integer imageCompanyId) {
        this.imageCompanyId = imageCompanyId;
    }

    public Integer getImagePersonId() {
        return imagePersonId;
    }

    public void setImagePersonId(Integer imagePersonId) {
        this.imagePersonId = imagePersonId;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverIdcardNo() {
        return driverIdcardNo;
    }

    public void setDriverIdcardNo(String driverIdcardNo) {
        this.driverIdcardNo = driverIdcardNo;
    }

    public Date getApplyCreatetime() {
        return applyCreatetime;
    }

    public void setApplyCreatetime(Date applyCreatetime) {
        this.applyCreatetime = applyCreatetime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    @Override
    public String toString() {
        return "EntireLicenseApplyInfo{" +
                "licenseImageCompany=" + licenseImageCompany +
                ", licenseImagePerson=" + licenseImagePerson +
                ", id=" + id +
                ", userId=" + userId +
                ", imageConpanyId=" + imageCompanyId +
                ", imagePersonId=" + imagePersonId +
                ", plateNo='" + plateNo + '\'' +
                ", plateType='" + plateType + '\'' +
                ", passLicenseType='" + passLicenseType + '\'' +
                ", startPosition='" + startPosition + '\'' +
                ", endPosition='" + endPosition + '\'' +
                ", applyRoute='" + applyRoute + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", driverName='" + driverName + '\'' +
                ", driverIdcardNo='" + driverIdcardNo + '\'' +
                ", applyCreatetime=" + applyCreatetime +
                ", dealTime=" + dealTime +
                ", comment='" + comment + '\'' +
                ", status=" + status +
                ", handlerId=" + handlerId +
                '}';
    }
}
