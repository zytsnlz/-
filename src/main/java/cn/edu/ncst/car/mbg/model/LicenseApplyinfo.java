package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LicenseApplyinfo implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer imageCompanyId;

    private Integer imagePersonId;

    @ApiModelProperty(value = "车牌号")
    private String plateNo;

    @ApiModelProperty(value = "车牌类型")
    private String plateType;

    @ApiModelProperty(value = "通行证类型")
    private Integer passLicenseType;

    @ApiModelProperty(value = "起点位置")
    private String startPosition;

    @ApiModelProperty(value = "终点位置")
    private String endPosition;

    @ApiModelProperty(value = "申请路线")
    private String applyRoute;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "司机姓名")
    private String driverName;

    @ApiModelProperty(value = "身份证号码")
    private String driverIdcardNo;

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

    public Integer getPassLicenseType() {
        return passLicenseType;
    }

    public void setPassLicenseType(Integer passLicenseType) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", imageCompanyId=").append(imageCompanyId);
        sb.append(", imagePersonId=").append(imagePersonId);
        sb.append(", plateNo=").append(plateNo);
        sb.append(", plateType=").append(plateType);
        sb.append(", passLicenseType=").append(passLicenseType);
        sb.append(", startPosition=").append(startPosition);
        sb.append(", endPosition=").append(endPosition);
        sb.append(", applyRoute=").append(applyRoute);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", driverName=").append(driverName);
        sb.append(", driverIdcardNo=").append(driverIdcardNo);
        sb.append(", applyCreatetime=").append(applyCreatetime);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", comment=").append(comment);
        sb.append(", status=").append(status);
        sb.append(", handlerId=").append(handlerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}