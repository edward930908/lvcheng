package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGuide<M extends BaseGuide<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setGuideNo(java.lang.Integer guideNo) {
		set("guide_no", guideNo);
	}

	public java.lang.Integer getGuideNo() {
		return get("guide_no");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setClubId(java.lang.String clubId) {
		set("club_id", clubId);
	}

	public java.lang.String getClubId() {
		return get("club_id");
	}

	public void setDuration(java.lang.String duration) {
		set("duration", duration);
	}

	public java.lang.String getDuration() {
		return get("duration");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}

	public void setEnabled(java.lang.String enabled) {
		set("enabled", enabled);
	}

	public java.lang.String getEnabled() {
		return get("enabled");
	}

	public void setVerified(java.lang.String verified) {
		set("verified", verified);
	}

	public java.lang.String getVerified() {
		return get("verified");
	}

	public void setIsDelete(java.lang.String isDelete) {
		set("is_delete", isDelete);
	}

	public java.lang.String getIsDelete() {
		return get("is_delete");
	}

	public void setCommitUser(java.lang.String commitUser) {
		set("commit_user", commitUser);
	}

	public java.lang.String getCommitUser() {
		return get("commit_user");
	}

	public void setNight(java.lang.String night) {
		set("night", night);
	}

	public java.lang.String getNight() {
		return get("night");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

}
