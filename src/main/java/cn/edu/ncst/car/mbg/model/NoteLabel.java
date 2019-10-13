package cn.edu.ncst.car.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class NoteLabel implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "后台管理员的id")
    private Integer userId;

    private String label1;

    private String label2;

    private String label3;

    private String label4;

    private String label5;

    private String label6;

    private String label7;

    private String label8;

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

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public String getLabel5() {
        return label5;
    }

    public void setLabel5(String label5) {
        this.label5 = label5;
    }

    public String getLabel6() {
        return label6;
    }

    public void setLabel6(String label6) {
        this.label6 = label6;
    }

    public String getLabel7() {
        return label7;
    }

    public void setLabel7(String label7) {
        this.label7 = label7;
    }

    public String getLabel8() {
        return label8;
    }

    public void setLabel8(String label8) {
        this.label8 = label8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", label1=").append(label1);
        sb.append(", label2=").append(label2);
        sb.append(", label3=").append(label3);
        sb.append(", label4=").append(label4);
        sb.append(", label5=").append(label5);
        sb.append(", label6=").append(label6);
        sb.append(", label7=").append(label7);
        sb.append(", label8=").append(label8);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}