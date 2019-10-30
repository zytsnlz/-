package cn.edu.ncst.car.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 工作量统计筛选条件
 */
public class WorkCount {

    @ApiModelProperty("管理员的id")
    private Integer adminId;

    @ApiModelProperty("管理员的名字")
    private String adminName;

    @ApiModelProperty("查找的起始时间")
    private Date startTime;

    @ApiModelProperty("查找的终止时间")
    private Date endTime;

    @ApiModelProperty("处理的用户申请记录的类型，0-用户认证申请，1-通行证申请")
    private Integer recordType;
}
