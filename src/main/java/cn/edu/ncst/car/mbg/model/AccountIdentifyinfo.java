package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AccountIdentifyinfo implements Serializable {
    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "真实姓名")
    private String name;

    @ApiModelProperty(value = "电话号码")
    private String telephone;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "身份证正面图片")
    private String idCardImage1;

    @ApiModelProperty(value = "身份证反面图片")
    private String idCardImage2;

    @ApiModelProperty(value = "账号认证申请时间")
    private Date applyCreatetime;

    @ApiModelProperty(value = "后台管理处理时间")
    private Date dealTime;

    @ApiModelProperty(value = "1-企业用户，0-个人用户")
    private Integer userType;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司营业执照编号")
    private String licenseNo;

    @ApiModelProperty(value = "营业执照照片")
    private String licenseImage;

    @ApiModelProperty(value = "单位申请书（盖公章）图片")
    private String authImage;

    @ApiModelProperty(value = "审核反馈")
    private String comment;

    @ApiModelProperty(value = "1-认证通过，0-认证未通过")
    private Integer status;

    @ApiModelProperty(value = "处理该条申请记录的管理员")
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardImage1() {
        return idCardImage1;
    }

    public void setIdCardImage1(String idCardImage1) {
        this.idCardImage1 = idCardImage1;
    }

    public String getIdCardImage2() {
        return idCardImage2;
    }

    public void setIdCardImage2(String idCardImage2) {
        this.idCardImage2 = idCardImage2;
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }

    public String getAuthImage() {
        return authImage;
    }

    public void setAuthImage(String authImage) {
        this.authImage = authImage;
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
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", idCard=").append(idCard);
        sb.append(", idCardImage1=").append(idCardImage1);
        sb.append(", idCardImage2=").append(idCardImage2);
        sb.append(", applyCreatetime=").append(applyCreatetime);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", userType=").append(userType);
        sb.append(", companyName=").append(companyName);
        sb.append(", licenseNo=").append(licenseNo);
        sb.append(", licenseImage=").append(licenseImage);
        sb.append(", authImage=").append(authImage);
        sb.append(", comment=").append(comment);
        sb.append(", status=").append(status);
        sb.append(", handlerId=").append(handlerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}