package cn.edu.ncst.car.common.api;

/**
 * 枚举了系统返回给用户的通知消息
 */
public enum InformEnum {

    ACCOUNT_SUCCESS("用户认证审核通过"),
    ACCOUNT_FAILED("用户认证审核未通过"),
    LICENSE_SUCCESS("通行证申请审核通过"),
    LICENSE_FAILED("通行证申请审核未通过")
    ;

    private String message;

    public String getMessage() {
        return message;
    }

    InformEnum(String message) {
         this.message=message;
    }

}
