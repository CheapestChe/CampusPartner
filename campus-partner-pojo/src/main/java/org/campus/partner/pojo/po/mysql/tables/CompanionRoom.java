/*
 * This file is generated by jOOQ.
*/
package org.campus.partner.pojo.po.mysql.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.campus.partner.pojo.po.mysql.CampusPartner;
import org.campus.partner.pojo.po.mysql.Keys;
import org.campus.partner.pojo.po.mysql.tables.records.CompanionRoomRecord;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanionRoom extends TableImpl<CompanionRoomRecord> {

    private static final long serialVersionUID = 1940352853;

    /**
     * The reference instance of <code>campus_partner.companion_room</code>
     */
    public static final CompanionRoom COMPANION_ROOM = new CompanionRoom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanionRoomRecord> getRecordType() {
        return CompanionRoomRecord.class;
    }

    /**
     * The column <code>campus_partner.companion_room.id</code>. 自增主键id
     */
    public final TableField<CompanionRoomRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "自增主键id");

    /**
     * The column <code>campus_partner.companion_room.object_id</code>. 全局唯一id
     */
    public final TableField<CompanionRoomRecord, byte[]> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARBINARY.length(255).nullable(false), this, "全局唯一id");

    /**
     * The column <code>campus_partner.companion_room.status</code>. 房间状态：0-关闭，1-开放
     */
    public final TableField<CompanionRoomRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "房间状态：0-关闭，1-开放");

    /**
     * The column <code>campus_partner.companion_room.contact_type</code>. 进入房间需要留下的联系方式，0：QQ，1：微信，2：电话
     */
    public final TableField<CompanionRoomRecord, Integer> CONTACT_TYPE = createField("contact_type", org.jooq.impl.SQLDataType.INTEGER, this, "进入房间需要留下的联系方式，0：QQ，1：微信，2：电话");

    /**
     * The column <code>campus_partner.companion_room.comment</code>. 结伴备注信息
     */
    public final TableField<CompanionRoomRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "结伴备注信息");

    /**
     * The column <code>campus_partner.companion_room.post_time</code>. 结伴的时间
     */
    public final TableField<CompanionRoomRecord, Date> POST_TIME = createField("post_time", org.jooq.impl.SQLDataType.DATE, this, "结伴的时间");

    /**
     * The column <code>campus_partner.companion_room.owner_id</code>. 房主 ID
     */
    public final TableField<CompanionRoomRecord, String> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "房主 ID");

    /**
     * The column <code>campus_partner.companion_room.owner_phone</code>. 房主电话
     */
    public final TableField<CompanionRoomRecord, String> OWNER_PHONE = createField("owner_phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "房主电话");

    /**
     * The column <code>campus_partner.companion_room.content</code>. 房间信息
     */
    public final TableField<CompanionRoomRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "房间信息");

    /**
     * The column <code>campus_partner.companion_room.start_location</code>. 结伴的起点（用于出现结伴)
     */
    public final TableField<CompanionRoomRecord, String> START_LOCATION = createField("start_location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "结伴的起点（用于出现结伴)");

    /**
     * The column <code>campus_partner.companion_room.end_location</code>. 结伴的地点
     */
    public final TableField<CompanionRoomRecord, String> END_LOCATION = createField("end_location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "结伴的地点");

    /**
     * The column <code>campus_partner.companion_room.tag</code>. 结伴类型 ID，0：运动，1：旅行， 2：出行，3：学习
     */
    public final TableField<CompanionRoomRecord, Integer> TAG = createField("tag", org.jooq.impl.SQLDataType.INTEGER, this, "结伴类型 ID，0：运动，1：旅行， 2：出行，3：学习");

    /**
     * The column <code>campus_partner.companion_room.created_datetime</code>. 记录创建时间
     */
    public final TableField<CompanionRoomRecord, Date> CREATED_DATETIME = createField("created_datetime", org.jooq.impl.SQLDataType.DATE, this, "记录创建时间");

    /**
     * The column <code>campus_partner.companion_room.modified_datetime</code>. 记录更新时间
     */
    public final TableField<CompanionRoomRecord, Date> MODIFIED_DATETIME = createField("modified_datetime", org.jooq.impl.SQLDataType.DATE, this, "记录更新时间");

    /**
     * The column <code>campus_partner.companion_room.max_member_num</code>. 房间最大人数
     */
    public final TableField<CompanionRoomRecord, Integer> MAX_MEMBER_NUM = createField("max_member_num", org.jooq.impl.SQLDataType.INTEGER, this, "房间最大人数");

    /**
     * The column <code>campus_partner.companion_room.member_num</code>. 当前房间人数
     */
    public final TableField<CompanionRoomRecord, Integer> MEMBER_NUM = createField("member_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "当前房间人数");

    /**
     * Create a <code>campus_partner.companion_room</code> table reference
     */
    public CompanionRoom() {
        this("companion_room", null);
    }

    /**
     * Create an aliased <code>campus_partner.companion_room</code> table reference
     */
    public CompanionRoom(String alias) {
        this(alias, COMPANION_ROOM);
    }

    private CompanionRoom(String alias, Table<CompanionRoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanionRoom(String alias, Table<CompanionRoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CampusPartner.CAMPUS_PARTNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CompanionRoomRecord, Long> getIdentity() {
        return Keys.IDENTITY_COMPANION_ROOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompanionRoomRecord> getPrimaryKey() {
        return Keys.KEY_COMPANION_ROOM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompanionRoomRecord>> getKeys() {
        return Arrays.<UniqueKey<CompanionRoomRecord>>asList(Keys.KEY_COMPANION_ROOM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanionRoom as(String alias) {
        return new CompanionRoom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanionRoom rename(String name) {
        return new CompanionRoom(name, null);
    }
}