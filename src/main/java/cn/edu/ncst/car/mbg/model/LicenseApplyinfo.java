package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LicenseApplyinfo implements Serializable {
    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "车牌号")
    private Integer plateNo;

    @ApiModelProperty(value = "车牌类型")
    private String plateType;

    @ApiModelProperty(value = "通行证类型")
    private String passLicenseType;

    @ApiModelProperty(value = "起止位置")
    private String applyPosit;

    @ApiModelProperty(value = "申请路线")
    private String applyRoute;

    @ApiModelProperty(value = "起止日期")
    private Date applyDate;

    @ApiModelProperty(value = "司机姓名")
    private String name;

    @ApiModelProperty(value = "身份证号码")
    private Integer idcardNo;

    @ApiModelProperty(value = "申请日期")
    private Date applyCreatetime;

    @ApiModelProperty(value = "后台管理处理日期")
    private Date dealTime;

    @ApiModelProperty(value = "审核反馈")
    private String comment;

    @ApiModelProperty(value = "1-已处理，0-未处理")
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

    public Integer getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(Integer plateNo) {
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

    public String getApplyPosit() {
        return applyPosit;
    }

    public void setApplyPosit(String applyPosit) {
        this.applyPosit = applyPosit;
    }

    public String getApplyRoute() {
        return applyRoute;
    }

    public void setApplyRoute(String applyRoute) {
        this.applyRoute = applyRoute;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(Integer idcardNo) {
        this.idcardNo = idcardNo;
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
        sb.append(", plateNo=").append(plateNo);
        sb.append(", plateType=").append(plateType);
        sb.append(", passLicenseType=").append(passLicenseType);
        sb.append(", applyPosit=").append(applyPosit);
        sb.append(", applyRoute=").append(applyRoute);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", name=").append(name);
        sb.append(", idcardNo=").append(idcardNo);
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