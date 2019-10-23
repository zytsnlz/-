package cn.edu.ncst.car.service;


import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;


public interface PageInfoService {

    /**
     * 用户认证申请信息分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<AccountIdentifyinfo> userApplyPageInfo(int pageNum, int pageSize);

    /**
     * 个人用户申请信息分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<AccountIdentifyinfo> personApplyPageInfo(int pageNum,int pageSize);

    /**
     * 企业用户申请信息分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<AccountIdentifyinfo> componyApplyPageInfo(int pageNum,int pageSize);

    /**
     * 根据用户名查询得到所有申请信息分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<AccountIdentifyinfo> byNameApplyPageInfo(int pageNum,int pageSize,String name);
}
