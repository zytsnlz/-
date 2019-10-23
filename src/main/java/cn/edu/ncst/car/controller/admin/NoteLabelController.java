package cn.edu.ncst.car.controller.admin;

import cn.edu.ncst.car.common.api.CommonResult;
import cn.edu.ncst.car.mbg.model.NoteLabel;
import cn.edu.ncst.car.service.NoteLabelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(description = "标签管理")
@RequestMapping("/admin")
public class NoteLabelController {
    @Autowired
    NoteLabelService noteLabelService;
    /**
     * 通过管理员的id获得所有的自定义标签
     * 如果没有设置任何标签则返回空
     * @param id 管理员id
     * @return 标签列表
     */
    @ApiOperation(value = "获取标签")
    @GetMapping("/NoteLabel/{id}")
    public CommonResult<List<String>> getNoteLabelByUser(@PathVariable String id){
        int UserId = Integer.parseInt(id);
        List<String> noteLabels = noteLabelService.getNoteLabelsByUserId(id);
        return  CommonResult.success(noteLabels);
    }

    /**
     * 添加标签
     * @param id 管理员id
     * @param message 标签内容
     * @return 操作成功或者失败
     */
    @ApiOperation(value = "添加标签")
    @PostMapping("/NoteLabel")
    public CommonResult addNoteLabelById(@RequestParam String id, @RequestParam String message){
        NoteLabel noteLabel = new NoteLabel();
        noteLabel.setUserId(Integer.parseInt(id));
        noteLabel.setLabel(message);
        try{
            noteLabelService.addNoteLabel(noteLabel);
        } catch (Exception e){
            e.printStackTrace();
            return CommonResult.failed("操作失败,请检测管理员是否存在");
        }
        return CommonResult.success("添加成功");
    }

    @ApiOperation(value = "删除标签")
    @DeleteMapping("/NoteLabel")
    public CommonResult deleteNoteLabel(@RequestParam String userId, @RequestParam String message){
        try{
            noteLabelService.deleteNoteLabel(message, userId);
        } catch (Exception e){
            e.printStackTrace();
            return CommonResult.failed("删除失败");
        }
        return CommonResult.success("删除成功");
    }
}
