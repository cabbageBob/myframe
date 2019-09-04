package com.wzf.common.constant;

public interface CommonConstant {

    /**
     * 正常状态
     */
    Integer STATUS_NURMOL = 0;

    /**
     * 禁用状态
     */
    Integer STATUS_DISABLE = -1;

    /**
     * 删除标志
     */
    Integer DEL_FLAG_1 = 1;

    /**
     * 未删除
     */
    Integer DEL_FLAG_0 = 0;

    /**
     * 系统日志类型：登录
     */
    int LOG_TYPE_1= 1;

    /**
     * 系统日志类型：操作
     */
    int LOG_TYPE_2= 2;

    /**
     * 服务器错误500
     */
    Integer SERVER_ERROR_500 = 500;

    /**
     * 访问成功200
     */
    Integer OK = 200;

    /**
     * 访问权限验证未通过
     */
    Integer NO_AUTH = 510;

    /**
     * 登录用户拥有角色缓存KEY前缀
     */
    String LOGIN_USER_CACHERULES_ROLE = "loginUser_cacheRules::Roles_";

    /**
     * 登录用户拥有权限缓存KEY前缀
     */
    String LOGIN_USER_CACHERULES_PERMISSION  = "loginUser_cacheRules::Permissions_";

    String PREFIX_USER_TOKEN  = "PREFIX_USER_TOKEN_";

    String X_ACCESS_TOKEN = "X-Access-Token";

    /**
     *  0：一级菜单
     */
    Integer MENU_TYPE_0  = 0;
    /**
     *  1：子菜单
     */
    Integer MENU_TYPE_1  = 1;
    /**
     *  2：按钮权限
     */
    Integer MENU_TYPE_2  = 2;

    /**
     * 短信模板方式  0 .登录模板、1.注册模板、2.忘记密码模板
     */
    String SMS_TPL_TYPE_0  = "0";
    String SMS_TPL_TYPE_1  = "1";
    String SMS_TPL_TYPE_2  = "2";

    /**
     * 状态(0无效1有效)
     */
    String STATUS_0 = "0";
    String STATUS_1 = "1";

    /**
     * 是否配置菜单的数据权限 1是0否
     */
    Integer RULE_FLAG_0 = 0;
    Integer RULE_FLAG_1 = 1;

    /**
     * 是否用户已被冻结 1(解冻)正常 2冻结
     */
    Integer USER_UNFREEZE = 1;
    Integer USER_FREEZE = 2;

    /**字典翻译文本后缀*/
    String DICT_TEXT_SUFFIX = "_dictText";
}
