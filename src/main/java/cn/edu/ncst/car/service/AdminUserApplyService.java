package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import io.swagger.models.auth.In;

import java.util.List;

public interface AdminUserApplyService {


    /**
     * 查询所有的用户申请
     * @return
     */
    List<AccountIdentifyinfo> selectAll( );

    /**
     * 根据用户姓名查询该用户的实名认证申请信息
     * @param name
     * @return
     */
    List<AccountIdentifyinfo> selectByName(String name);

    /**
     * 根据状态码筛选位未处理的申请(0)、已通过的申请(1)、未通过的申请(2)
     * @param status
     * @return
     */
    List<AccountIdentifyinfo> selectByStatus(Integer status);

    /**
     * 查询所有所有个人用户认证申请
     * @return
     */
    List<AccountIdentifyinfo> selectPersonApply();

    /**
     * 查询所有企业用户认证申请
     * @return
     */
    List<AccountIdentifyinfo> selectCompanyApply();

    /**
     * 根据account_identify表的id查看某个用户详细的认证申请信息
     * @return
     */
    AccountIdentifyinfo selectOneApplyInfoById(Integer id);

    /**
     * 管理员审核某用户认证申请
     */
    void updateUserStatus(Integer id,Integer status,String comment,String token);

}
