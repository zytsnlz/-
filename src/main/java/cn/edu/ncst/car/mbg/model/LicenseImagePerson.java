package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LicenseImagePerson implements Serializable {
    private Integer id;

    private Integer applyinfoId;

    @ApiModelProperty(value = "驾驶证正面照")
    private byte[] licenseFront;

    @ApiModelProperty(value = "驾驶证背面照")
    private byte[] licenseBack;

    @ApiModelProperty(value = "机动驾驶证正面")
    private byte[] velicenseFront;

    @ApiModelProperty(value = "机动驾驶证背面")
    private byte[] velicenseBack;

    @ApiModelProperty(value = "车辆正面照（有车牌）")
    private byte[] carFront;

    @ApiModelProperty(value = "车辆背面照")
    private byte[] carBack;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyinfoId() {
        return applyinfoId;
    }

    public void setApplyinfoId(Integer applyinfoId) {
        this.applyinfoId = applyinfoId;
    }

    public byte[] getLicenseFront() {
        return licenseFront;
    }

    public void setLicenseFront(byte[] licenseFront) {
        this.licenseFront = licenseFront;
    }

    public byte[] getLicenseBack() {
        return licenseBack;
    }

    public void setLicenseBack(byte[] licenseBack) {
        this.licenseBack = licenseBack;
    }

    public byte[] getVelicenseFront() {
        return velicenseFront;
    }

    public void setVelicenseFront(byte[] velicenseFront) {
        this.velicenseFront = velicenseFront;
    }

    public byte[] getVelicenseBack() {
        return velicenseBack;
    }

    public void setVelicenseBack(byte[] velicenseBack) {
        this.velicenseBack = velicenseBack;
    }

    public byte[] getCarFront() {
        return carFront;
    }

    public void setCarFront(byte[] carFront) {
        this.carFront = carFront;
    }

    public byte[] getCarBack() {
        return carBack;
    }

    public void setCarBack(byte[] carBack) {
        this.carBack = carBack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applyinfoId=").append(applyinfoId);
        sb.append(", licenseFront=").append(licenseFront);
        sb.append(", licenseBack=").append(licenseBack);
        sb.append(", velicenseFront=").append(velicenseFront);
        sb.append(", velicenseBack=").append(velicenseBack);
        sb.append(", carFront=").append(carFront);
        sb.append(", carBack=").append(carBack);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}