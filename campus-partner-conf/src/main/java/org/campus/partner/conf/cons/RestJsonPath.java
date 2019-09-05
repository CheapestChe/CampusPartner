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

    public static final String V1 = "/v1";
    public static final String V2 = "/v2";
    public static final String V3 = "/v3";

    public static final String ROOT = "/api" + V1 + "/resources";

    public static final String USERS = ROOT + "/users";
    public static final String USER = USERS + "/{" + RestParam.PV_USER_ID + "}";

    public static final String WECHAT_LOGIN = USER + "/login";

    public static final String ACCOUNT_AUTH = USER + "/account-auth";
    public static final String CARD_AUTH = USER + "/card-auth";

    public static final String COMPANION_ROOMS = ROOT + "/companion-rooms";
    public static final String COMPANION_ROOM = COMPANION_ROOMS + "/{" + RestParam.PV_COMPANION_ROOM_ID + "}";
    public static final String JOIN_COMPANION_ROOM = COMPANION_ROOM + "/add" + "/{" + RestParam.PV_USER_ID + "}";
    public static final String CLOSE_COMPANION_ROOM = COMPANION_ROOM + "/close";

}
