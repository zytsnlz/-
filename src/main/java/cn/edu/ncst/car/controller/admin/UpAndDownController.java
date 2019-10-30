package cn.edu.ncst.car.controller.admin;


import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.UpAndDownService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(tags = "UpAndDownController",description = "查看上一条或是下一条未处理的记录")
@RestController
@RequestMapping("/admin")
public class UpAndDownController {

    @Autowired
    UpAndDownService upAndDownService;

    /**
     * 查看当前所处理的记录的上一条未处理的用户通行证申请
     * 此处的上一条和下一条仅是查看未处理的记录，应在未处理的记录审核中用此来查看上一条或下一条
     * 若是在全部的申请中审核查看，直接调用查看一条记录的方法，参数为当前处理的记录的id加1或是减1，
     * 从而实现查看上一条或是下一条记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/lastLicense",method = RequestMethod.POST)
    @ApiOperation(value = "查看上一条未处理的通行证申请记录")
    public Map<String,Object> selectPreviousLicenseApply(@RequestParam @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.SelectPreviousLicenseApply(id);
        return map;

    }

    /**
     * 查看下一条未处理的用户通行证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看下一条未处理的通行证申请记录")
    @RequestMapping(value = "/nextLicense",method = RequestMethod.POST)
    public Map<String,Object> selectNextLicenseApply(@RequestParam @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.SelectNextLicenseApply(id);
        return map;

    }

    /**
     * 查看上一条未处理的用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看上一条未处理的用户认证申请记录")
    @RequestMapping(value = "/lastApply",method = RequestMethod.POST)
    public AccountIdentifyinfo selectPreviousApplyInfo(@RequestParam @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.SelectPreviousApplyInfo(id);
        return accountIdentifyinfo;
    }

    /**
     * 查看下一条未处理的用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看下一条未处理的用户认证申请记录")
    @RequestMapping(value = "/nextApply",method = RequestMethod.POST)
    public AccountIdentifyinfo selectNextApplyInfo(@RequestParam @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.SelectNextApplyInfo(id);
        return accountIdentifyinfo;
    }



}
