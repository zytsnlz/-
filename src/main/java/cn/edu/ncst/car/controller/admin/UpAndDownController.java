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
     * 查看上一条未处理的用户通行证申请记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/lastUnLicense",method = RequestMethod.POST)
    @ApiOperation(value = "查看上一条未处理的通行证申请记录")
    public Map<String,Object> selectPreviousUnLicenseApply(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.SelectPreviousLicenseApply(id);
        return map;

    }

    /**
     * 查看下一条未处理的用户通行证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看下一条未处理的通行证申请记录")
    @RequestMapping(value = "/nextUnLicense",method = RequestMethod.POST)
    public Map<String,Object> selectNextUnLicenseApply(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.SelectNextLicenseApply(id);
        return map;

    }

    /**
     * 查看上一条未处理的用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看上一条未处理的用户认证申请记录")
    @RequestMapping(value = "/lastUnApply",method = RequestMethod.POST)
    public AccountIdentifyinfo selectPreviousUnApplyInfo(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.SelectPreviousApplyInfo(id);
        return accountIdentifyinfo;
    }

    /**
     * 查看下一条未处理的用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看下一条未处理的用户认证申请记录")
    @RequestMapping(value = "/nextUnApply",method = RequestMethod.POST)
    public AccountIdentifyinfo selectNextUnApplyInfo(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.SelectNextApplyInfo(id);
        return accountIdentifyinfo;
    }

    /**
     * 查看上一条用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看上一条用户认证申请记录")
    @RequestMapping(value = "/lastApply",method = RequestMethod.GET)
    public AccountIdentifyinfo selectLastApplyInfo(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.previousAccountIdentifyinfo(id);
        return accountIdentifyinfo;
    }

    /**
     * 查看下一条用户认证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看下一条用户认证申请记录")
    @RequestMapping(value = "/nextApply",method = RequestMethod.GET)
    public AccountIdentifyinfo selectNextApplyInfo(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){
        AccountIdentifyinfo accountIdentifyinfo = upAndDownService.nextAccountIdentifyinfo(id);
        return accountIdentifyinfo;
    }

    /**
     * 查看上一条用户通行证申请记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/lastLicense",method = RequestMethod.GET)
    @ApiOperation(value = "查看上一条用户通行证申请记录")
    public Map<String,Object> selectLastLicenseApply(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.previousLicenseApply(id);
        return map;

    }

    /**
     * 查看下一条用户通行证申请记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/nextLicense",method = RequestMethod.GET)
    @ApiOperation(value = "查看下一条用户通行证申请记录")
    public Map<String,Object> selectNextLicenseApply(@RequestParam(required = true) @ApiParam(value = "当前处理的申请记录的id") int id){

        Map<String,Object> map = upAndDownService.nextLicenseApply(id);
        return map;

    }




}
