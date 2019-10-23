package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LicenseImageCompany implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "驾驶证正面照")
    private String licenseFront;

    @ApiModelProperty(value = "驾驶证背面照")
    private String licenseBack;

    @ApiModelProperty(value = "机动驾驶证正面")
    private String velicenseFront;

    @ApiModelProperty(value = "机动驾驶证背面")
    private String velicenseBack;

    @ApiModelProperty(value = "车辆正面照（有车牌）")
    private String carFront;

    @ApiModelProperty(value = "车辆背面照")
    private String carBack;

    @ApiModelProperty(value = "合同照片")
    private String contract;

    @ApiModelProperty(value = "甲方营业执照")
    private String licenseA;

    @ApiModelProperty(value = "乙方营业执照")
    private String licenseB;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicenseFront() {
        return licenseFront;
    }

    public void setLicenseFront(String licenseFront) {
        this.licenseFront = licenseFront;
    }

    public String getLicenseBack() {
        return licenseBack;
    }

    public void setLicenseBack(String licenseBack) {
        this.licenseBack = licenseBack;
    }

    public String getVelicenseFront() {
        return velicenseFront;
    }

    public void setVelicenseFront(String velicenseFront) {
        this.velicenseFront = velicenseFront;
    }

    public String getVelicenseBack() {
        return velicenseBack;
    }

    public void setVelicenseBack(String velicenseBack) {
        this.velicenseBack = velicenseBack;
    }

    public String getCarFront() {
        return carFront;
    }

    public void setCarFront(String carFront) {
        this.carFront = carFront;
    }

    public String getCarBack() {
        return carBack;
    }

    public void setCarBack(String carBack) {
        this.carBack = carBack;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getLicenseA() {
        return licenseA;
    }

    public void setLicenseA(String licenseA) {
        this.licenseA = licenseA;
    }

    public String getLicenseB() {
        return licenseB;
    }

    public void setLicenseB(String licenseB) {
        this.licenseB = licenseB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", licenseFront=").append(licenseFront);
        sb.append(", licenseBack=").append(licenseBack);
        sb.append(", velicenseFront=").append(velicenseFront);
        sb.append(", velicenseBack=").append(velicenseBack);
        sb.append(", carFront=").append(carFront);
        sb.append(", carBack=").append(carBack);
        sb.append(", contract=").append(contract);
        sb.append(", licenseA=").append(licenseA);
        sb.append(", licenseB=").append(licenseB);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}