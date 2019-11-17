package cn.edu.ncst.car.controller.user;


import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.mbg.model.MessageInform;
import cn.edu.ncst.car.service.SystemInformService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/inform")
@RestController
@Api(description = "系统通知",tags = "SystemInformController")
public class SystemInformController {

    @Autowired
    SystemInformService systemInformService;

    /**
     * 获取所有的通知消息
     * @return
     */
    @ApiOperation("查看当前用户的所有的通知消息")
    @RequestMapping(method = RequestMethod.GET)
    public List<MessageInform> showtInform(){

        List<MessageInform> messageInforms = systemInformService.listInform();
        return messageInforms;
    }

    /**
     * 查看某个通知消息
     * @return
     */
    @ApiOperation("查看某条通知消息")
    @RequestMapping(method = RequestMethod.POST)
    public MessageInform getDetails(int id){

        MessageInform messageInform = systemInformService.updateInform(id);
        return messageInform;
    }
    @ApiOperation("删除某条通知消息")
    @RequestMapping(method = RequestMethod.DELETE)
    public CommonResult deleteInform(int id){

        try{
            systemInformService.deleteInform(id);
            return CommonResult.success("删除成功");
        }catch (Exception e){
            return CommonResult.failed("删除失败");
        }


    }

}
