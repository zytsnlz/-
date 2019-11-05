package cn.edu.ncst.car.controller.admin;


import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.AdminUserApplyService;
import cn.edu.ncst.car.service.UserPageInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "UserApplyController",description = "查看用户认证申请")
@RequestMapping("/admin")
public class UserApplyController {

    @Autowired
    private UserPageInfoService userPageInfoService;

    @Autowired
    private AdminUserApplyService applyService;

    /**
     * 获取所有的用户申请记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("获取所有用户申请")
    @RequestMapping(value = "/apply",method = RequestMethod.GET)
    public CommonResult<CommonPage> getAllUserApply(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "8") int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.userApplyPageInfo(pageNum,pageSize);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);
    }

    /**
     * 根据姓名搜索获取用户申请记录
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    @ApiOperation("根据用户姓名查找申请记录")
    @RequestMapping(value = "/apply",method = RequestMethod.POST)
    public CommonResult<CommonPage> getUserApplyByName( @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "8") int pageSize,
                                                       @RequestParam @ApiParam(required = true) String name){

        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.byNameApplyPageInfo(pageNum, pageSize, name);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }

    /**
     * 获取所有的个人用户申请
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("获取所有个人用户申请")
    @RequestMapping(value = "/apply/user",method = RequestMethod.GET)
    public CommonResult<CommonPage> getPersonApply(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.personApplyPageInfo(pageNum,pageSize);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }

    /**
     * 获取所有的企业用户申请
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("查看所有企业用户申请")
    @RequestMapping(value = "/apply/company",method = RequestMethod.GET)
    public CommonResult<CommonPage> getCompanyApply(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "8") int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.componyApplyPageInfo(pageNum,pageSize);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }
    @ApiOperation("查看某个用户的具体申请")
    @RequestMapping(value = "/apply/{id}",method = RequestMethod.GET)
    public CommonResult<AccountIdentifyinfo> getOneApplyInfoById(@PathVariable(name = "id") @ApiParam(required = true) Integer id ){

        AccountIdentifyinfo identifyinfo = applyService.selectOneApplyInfoById(id);
        return CommonResult.success(identifyinfo);
    }
    @ApiOperation("根据status筛选位未处理的申请(0)、已通过的申请(1)、未通过的申请(2)")
    @RequestMapping(value = "/apply/filter",method = RequestMethod.GET)
    public CommonResult<CommonPage> getApplyInfoByStatus(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "8") int pageSize,
                                                                @RequestParam @ApiParam(required = true) int status){
        PageInfo<AccountIdentifyinfo> pageInfo = userPageInfoService.byStatusApplyPageInfo(pageNum,pageSize,status);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);


    }

}
