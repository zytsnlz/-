package cn.edu.ncst.car.controller.admin;


import cn.edu.ncst.car.common.api.CommonPage;
import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.service.PageInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "UserApplyController",description = "用户认证申请审核管理")
@RequestMapping("/admin")
public class UserApplyController {

    @Autowired
    private PageInfoService pageInfoService ;

    /**
     * 获取所有的用户申请记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("获取所有用户申请")
    @RequestMapping(value = "/apply",method = RequestMethod.GET)
    public CommonResult<CommonPage> getAllUserApply(@RequestParam int pageNum, @RequestParam int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = pageInfoService.userApplyPageInfo(pageNum,pageSize);
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
    public CommonResult<CommonPage> getUserApplyByName( @RequestParam int pageNum, @RequestParam int pageSize,
                                                       @RequestParam String name){

        PageInfo<AccountIdentifyinfo> pageInfo = pageInfoService.byNameApplyPageInfo(pageNum, pageSize, name);
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
    public CommonResult<CommonPage> getPersonApply(@RequestParam int pageNum,@RequestParam int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = pageInfoService.personApplyPageInfo(pageNum,pageSize);
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
    public CommonResult<CommonPage> getCompanyApply(@RequestParam int pageNum,@RequestParam int pageSize){

        PageInfo<AccountIdentifyinfo> pageInfo = pageInfoService.componyApplyPageInfo(pageNum,pageSize);
        CommonPage<AccountIdentifyinfo> commonPage = new CommonPage<>(pageInfo);
        return CommonResult.success(commonPage);

    }



}
