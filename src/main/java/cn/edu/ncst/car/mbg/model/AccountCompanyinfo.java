package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AccountCompanyinfo implements Serializable {
    private Integer id;

    private Integer identifyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司营业执照编号")
    private Integer licenseNo;

    @ApiModelProperty(value = "营业执照照片")
    private byte[] licenseImage;

    @ApiModelProperty(value = "单位申请书（盖公章）图片")
    private byte[] authImage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentifyId() {
        return identifyId;
    }

    public void setIdentifyId(Integer identifyId) {
        this.identifyId = identifyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(Integer licenseNo) {
        this.licenseNo = licenseNo;
    }

    public byte[] getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(byte[] licenseImage) {
        this.licenseImage = licenseImage;
    }

    public byte[] getAuthImage() {
        return authImage;
    }

    public void setAuthImage(byte[] authImage) {
        this.authImage = authImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", identifyId=").append(identifyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", licenseNo=").append(licenseNo);
        sb.append(", licenseImage=").append(licenseImage);
        sb.append(", authImage=").append(authImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}