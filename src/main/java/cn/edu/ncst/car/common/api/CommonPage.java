package cn.edu.ncst.car.common.api;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页数据封装类
 * Created by macro on 2019/4/19.
 */
public class CommonPage<T> {

    private Integer pageNum;
    private Integer pageSize;
    @ApiModelProperty("总页数")
    private Integer totalPage;
    @ApiModelProperty("总记录数")
    private Long total;
    private List<T> list;



    public CommonPage(PageInfo<T> pageInfo) {

        this.setTotalPage(pageInfo.getPages());
        this.setPageNum(pageInfo.getPageNum());
        this.setPageSize(pageInfo.getPageSize());
        this.setTotal(pageInfo.getTotal());
        this.setList(pageInfo.getList());
    }


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


}
