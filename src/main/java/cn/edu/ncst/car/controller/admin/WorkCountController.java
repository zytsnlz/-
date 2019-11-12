package cn.edu.ncst.car.controller.admin;


import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.dto.CountAllCondition;
import cn.edu.ncst.car.dto.CountCondition;
import cn.edu.ncst.car.dto.CountResult;
import cn.edu.ncst.car.service.WorkCountService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(description = "工作量的统计",tags = "WorkCountController")
@RestController
@RequestMapping("/admin")
public class WorkCountController {

    @Autowired
    WorkCountService workCountService;

    @ApiOperation("统计某一位管理员的工作量")
    @RequestMapping(value = "/count",method = RequestMethod.POST)
    public CommonResult<Integer> WorkCountOne(@RequestBody CountCondition countCondition){

        int count = workCountService.countOne(countCondition);
        if(count==-1){
            return CommonResult.validateFailed("不存在该管理员");
        }
        return CommonResult.success(count);

    }

    @ApiOperation("统计所有管理员的工作量")
    @RequestMapping(value = "/countAll",method = RequestMethod.POST)
    public List<CountResult> WorkCountAll(@RequestBody CountAllCondition countAllCondition){

           List<CountResult> countResultList = workCountService.countAll(countAllCondition);
           return countResultList;

    }

}
