package org.campus.partner.util.enums;

/**
 * 
 * 结伴状态枚举
 *
 *
 * @author xuLiang
 * @since 1.0.0
 */
public enum PostStatus {

    UNKNOWN(-1, "未知"),
    UNDONE(0, "未完成"),
    DONE(1, "已完成");

    private Integer code;

    private String description;

    private PostStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * 根据枚举code获取枚举类型.
     *
     * @param code
     *            枚举整型code
     * @return 枚举具体类型
     * @author xl
     * @since 1.0.0
     */
    public static PostStatus getVerificationStatus(Integer code) {
        for (PostStatus level : values()) {
            if (code != null && level.getCode() == code) {
                return level;
            }
        }
        return PostStatus.UNKNOWN;
    }

    /**
     * 根据枚举状态名获取枚举类型.
     *
     * @param name
     *            枚举状态名
     * @return 枚举具体类型
     * @author xl
     * @since 1.0.0
     */
    public static PostStatus getVerificationStatus(String name) {
        for (PostStatus level : values()) {
            if (level.name()
                    .equalsIgnoreCase(name)) {
                return level;
            }
        }
        return PostStatus.UNKNOWN;
    }
}
