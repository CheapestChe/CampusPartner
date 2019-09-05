/*
 * This file is generated by jOOQ.
*/
package org.campus.partner.pojo.po.mysql.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


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
public class CompanionRoom implements Serializable {

    private static final long serialVersionUID = 373988690;

    private Long    id;
    private byte[]  objectId;
    private Integer status;
    private Integer contactType;
    private String  comment;
    private Date    postTime;
    private String  ownerId;
    private String  ownerPhone;
    private String  content;
    private String  startLocation;
    private String  endLocation;
    private Integer tag;
    private Date    createdDatetime;
    private Date    modifiedDatetime;
    private Integer maxMemberNum;
    private Integer memberNum;

    public CompanionRoom() {}

    public CompanionRoom(CompanionRoom value) {
        this.id = value.id;
        this.objectId = value.objectId;
        this.status = value.status;
        this.contactType = value.contactType;
        this.comment = value.comment;
        this.postTime = value.postTime;
        this.ownerId = value.ownerId;
        this.ownerPhone = value.ownerPhone;
        this.content = value.content;
        this.startLocation = value.startLocation;
        this.endLocation = value.endLocation;
        this.tag = value.tag;
        this.createdDatetime = value.createdDatetime;
        this.modifiedDatetime = value.modifiedDatetime;
        this.maxMemberNum = value.maxMemberNum;
        this.memberNum = value.memberNum;
    }

    public CompanionRoom(
        Long    id,
        byte[]  objectId,
        Integer status,
        Integer contactType,
        String  comment,
        Date    postTime,
        String  ownerId,
        String  ownerPhone,
        String  content,
        String  startLocation,
        String  endLocation,
        Integer tag,
        Date    createdDatetime,
        Date    modifiedDatetime,
        Integer maxMemberNum,
        Integer memberNum
    ) {
        this.id = id;
        this.objectId = objectId;
        this.status = status;
        this.contactType = contactType;
        this.comment = comment;
        this.postTime = postTime;
        this.ownerId = ownerId;
        this.ownerPhone = ownerPhone;
        this.content = content;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.tag = tag;
        this.createdDatetime = createdDatetime;
        this.modifiedDatetime = modifiedDatetime;
        this.maxMemberNum = maxMemberNum;
        this.memberNum = memberNum;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getObjectId() {
        return this.objectId;
    }

    public void setObjectId(byte... objectId) {
        this.objectId = objectId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getContactType() {
        return this.contactType;
    }

    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getPostTime() {
        return this.postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerPhone() {
        return this.ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStartLocation() {
        return this.startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return this.endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Integer getTag() {
        return this.tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Date getCreatedDatetime() {
        return this.createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getModifiedDatetime() {
        return this.modifiedDatetime;
    }

    public void setModifiedDatetime(Date modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    public Integer getMaxMemberNum() {
        return this.maxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        this.maxMemberNum = maxMemberNum;
    }

    public Integer getMemberNum() {
        return this.memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanionRoom (");

        sb.append(id);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(status);
        sb.append(", ").append(contactType);
        sb.append(", ").append(comment);
        sb.append(", ").append(postTime);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(ownerPhone);
        sb.append(", ").append(content);
        sb.append(", ").append(startLocation);
        sb.append(", ").append(endLocation);
        sb.append(", ").append(tag);
        sb.append(", ").append(createdDatetime);
        sb.append(", ").append(modifiedDatetime);
        sb.append(", ").append(maxMemberNum);
        sb.append(", ").append(memberNum);

        sb.append(")");
        return sb.toString();
    }
}