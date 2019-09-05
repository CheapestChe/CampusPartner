package org.campus.partner.conf.cons;

/**
 * 
 * 接口路径相关静态变量.
 * </p>
 *
 * @author xuLiang
 * @since 1.0.0
 */
public class RestJsonPath {
    /**
     * 版本号
     */
    public static final String V1 = "/v1";
    public static final String V2 = "/v2";
    public static final String V3 = "/v3";
    /**
     * 根路径
     */
    public static final String ROOT = "/api" + V1 + "/resources";
    /**
     * 用户资源地址
     */
    public static final String USERS = ROOT + "/users";
    /**
     * 指定用户资源地址
     */
    public static final String USER = USERS + "/{" + RestParam.PV_USER_ID + "}";
    /**
     * 用户登录路径
     */
    public static final String WECHAT_LOGIN = USER + "/login";
    /**
     * 用户教务处认证路径
     */
    public static final String ACCOUNT_AUTH = USER + "/account-auth";
    /**
     * 用户一卡通认证路径
     */
    public static final String CARD_AUTH = USER + "/card-auth";
    /**
     * 房间资源地址
     */
    public static final String COMPANION_ROOMS = ROOT + "/companion-rooms";
    /**
     * 指定房间资源地址
     */
    public static final String COMPANION_ROOM = COMPANION_ROOMS + "/{" + RestParam.PV_COMPANION_ROOM_ID + "}";
    /**
     * 用户加入房间请求路径
     */
    public static final String JOIN_COMPANION_ROOM = COMPANION_ROOM + "/add" + "/{" + RestParam.PV_USER_ID + "}";
    /**
     * 关闭指定房间路径
     */
    public static final String CLOSE_COMPANION_ROOM = COMPANION_ROOM + "/close";

}
