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
import org.campus.partner.pojo.po.mysql.tables.records.SubscribeRecord;
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
public class Subscribe extends TableImpl<SubscribeRecord> {

    private static final long serialVersionUID = -1636788526;

    /**
     * The reference instance of <code>campus_partner.subscribe</code>
     */
    public static final Subscribe SUBSCRIBE = new Subscribe();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubscribeRecord> getRecordType() {
        return SubscribeRecord.class;
    }

    /**
     * The column <code>campus_partner.subscribe.id</code>. 自增主键id
     */
    public final TableField<SubscribeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "自增主键id");

    /**
     * The column <code>campus_partner.subscribe.object_id</code>. 全局唯一id
     */
    public final TableField<SubscribeRecord, byte[]> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.VARBINARY.length(255).nullable(false), this, "全局唯一id");

    /**
     * The column <code>campus_partner.subscribe.user_id</code>. 发布结伴信息的用户 ID
     */
    public final TableField<SubscribeRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "发布结伴信息的用户 ID");

    /**
     * The column <code>campus_partner.subscribe.user_phone</code>. 订阅消息的用户的电话，用户消息推送
     */
    public final TableField<SubscribeRecord, String> USER_PHONE = createField("user_phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "订阅消息的用户的电话，用户消息推送");

    /**
     * The column <code>campus_partner.subscribe.content</code>. 订阅的结伴消息的主要内容
     */
    public final TableField<SubscribeRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "订阅的结伴消息的主要内容");

    /**
     * The column <code>campus_partner.subscribe.start_location</code>. 订阅的结伴消息的起点（用于出行结伴)
     */
    public final TableField<SubscribeRecord, String> START_LOCATION = createField("start_location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "订阅的结伴消息的起点（用于出行结伴)");

    /**
     * The column <code>campus_partner.subscribe.end_location</code>. 订阅的结伴消息的地点
     */
    public final TableField<SubscribeRecord, String> END_LOCATION = createField("end_location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "订阅的结伴消息的地点");

    /**
     * The column <code>campus_partner.subscribe.subscribe_tag</code>. 订阅的结伴消息类型 ID，0：运动，1：旅行， 2：出行，3：学习
     */
    public final TableField<SubscribeRecord, Integer> SUBSCRIBE_TAG = createField("subscribe_tag", org.jooq.impl.SQLDataType.INTEGER, this, "订阅的结伴消息类型 ID，0：运动，1：旅行， 2：出行，3：学习");

    /**
     * The column <code>campus_partner.subscribe.subscribe_end_datetime</code>. 订阅消息对于的截止日期
     */
    public final TableField<SubscribeRecord, Date> SUBSCRIBE_END_DATETIME = createField("subscribe_end_datetime", org.jooq.impl.SQLDataType.DATE, this, "订阅消息对于的截止日期");

    /**
     * The column <code>campus_partner.subscribe.created_datetime</code>. 记录创建时间
     */
    public final TableField<SubscribeRecord, Date> CREATED_DATETIME = createField("created_datetime", org.jooq.impl.SQLDataType.DATE, this, "记录创建时间");

    /**
     * The column <code>campus_partner.subscribe.modified_datetime</code>. 记录更新时间
     */
    public final TableField<SubscribeRecord, Date> MODIFIED_DATETIME = createField("modified_datetime", org.jooq.impl.SQLDataType.DATE, this, "记录更新时间");

    /**
     * Create a <code>campus_partner.subscribe</code> table reference
     */
    public Subscribe() {
        this("subscribe", null);
    }

    /**
     * Create an aliased <code>campus_partner.subscribe</code> table reference
     */
    public Subscribe(String alias) {
        this(alias, SUBSCRIBE);
    }

    private Subscribe(String alias, Table<SubscribeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Subscribe(String alias, Table<SubscribeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubscribeRecord, Long> getIdentity() {
        return Keys.IDENTITY_SUBSCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubscribeRecord> getPrimaryKey() {
        return Keys.KEY_SUBSCRIBE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubscribeRecord>> getKeys() {
        return Arrays.<UniqueKey<SubscribeRecord>>asList(Keys.KEY_SUBSCRIBE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Subscribe as(String alias) {
        return new Subscribe(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Subscribe rename(String name) {
        return new Subscribe(name, null);
    }
}
