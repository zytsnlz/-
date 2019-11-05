package cn.edu.ncst.car.controller.admin;

import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import cn.edu.ncst.car.service.AdminLicenseApplyService;
import cn.edu.ncst.car.service.LicensePageInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/admin")
@Api(description = "查看用户的通行证申请",tags = "LicenseApplyController")
public class LicenseApplyController {

    @Autowired
    LicensePageInfoService licensePageInfoService;

    @Autowired
    AdminLicenseApplyService adminLicenseApplyService;

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("获取所有的通行证申请")
    @RequestMapping(value = "/license",method = RequestMethod.GET)
    public CommonResult<CommonPage> getAllLicenseApply(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "8") int pageSize){

        PageInfo<MainLicenseApplyInfo> pageInfo = licensePageInfoService.licenseApplyPageInfo(pageNum,pageSize);
        CommonPage<MainLicenseApplyInfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }

    /**
     * 根据通信证申请信息的状态码筛选通行证申请
     * @param pageNum
     * @param pageSize
     * @param status
     * @return
     */
    @ApiOperation("根据status筛选位未处理的申请(0)、已通过的申请(1)、未通过的申请(2)")
    @RequestMapping(value = "/license",method = RequestMethod.PUT)
    public CommonResult<CommonPage> selectLicenseByStatus(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize,@ApiParam(required = true) int status){

        PageInfo<MainLicenseApplyInfo> pageInfo = licensePageInfoService.byStatusPageInfo(pageNum,pageSize,status);
        CommonPage<MainLicenseApplyInfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);
    }

    /**
     * 根据车牌号查找通行证申请记录
     * @param pageNum
     * @param pageSize
     * @param plateNo
     * @return
     */
    @ApiOperation("根据车牌号查找通行证申请记录")
    @RequestMapping(value = "/license",method = RequestMethod.POST)
    public CommonResult<CommonPage> selectLicenseByPlateNo(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize,@ApiParam(required = true) String plateNo){

        PageInfo<MainLicenseApplyInfo> pageInfo = licensePageInfoService.byPlateNoPageInfo(pageNum,pageSize,plateNo);
        CommonPage<MainLicenseApplyInfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);
    }

    /**
     * 查看所有的个人用户通行证申请记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("查看所有的个人用户通行证记录")
    @RequestMapping(value = "/license/user",method = RequestMethod.GET)
    public CommonResult<CommonPage> selectPersonLicense(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize){

        PageInfo<MainLicenseApplyInfo> pageInfo = licensePageInfoService.personLicensePageInfo(pageNum,pageSize);
        CommonPage<MainLicenseApplyInfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }

    /**
     * 查看所有的企业用户通行证申请记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("查看所有的企业用户通行证申请记录")
    @RequestMapping(value = "/license/company",method = RequestMethod.GET)
    public CommonResult<CommonPage> selectCompanyLicense(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize){

        PageInfo<MainLicenseApplyInfo> pageInfo = licensePageInfoService.companyLicensePageInfo(pageNum,pageSize);
        CommonPage<MainLicenseApplyInfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);
    }

    /**
     * 查看某一条通行证申请记录
     * @param id
     * @return
     */
    @ApiOperation("查看某一条通行证申请记录")
    @RequestMapping(value = "/license/{id}",method = RequestMethod.GET)
    public Map<String,Object> selectOneApplyLicense(@PathVariable @ApiParam(required = true) Integer id){
        Map<String,Object> map = adminLicenseApplyService.selectOneApplyInfoById(id);
        return map;
    }


}
