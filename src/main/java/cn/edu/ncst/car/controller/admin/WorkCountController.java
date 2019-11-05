package cn.edu.ncst.car.controller.admin;


import cn.edu.ncst.car.dto.CountCondition;
import cn.edu.ncst.car.service.WorkCountService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "工作量的统计",tags = "WorkCountController")
@RestController
@RequestMapping("/admin")
public class WorkCountController {

    @Autowired
    WorkCountService workCountService;

    @ApiOperation("统计某一位管理员的工作量")
    @RequestMapping(value = "/count",method = RequestMethod.POST)
    public int WorkCountOne(@RequestBody CountCondition countCondition){

        int count = workCountService.countOne(countCondition);
        return count;

    }

}
