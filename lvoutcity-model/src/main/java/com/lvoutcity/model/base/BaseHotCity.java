package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseHotCity<M extends BaseHotCity<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setHCode(java.lang.Integer hCode) {
		set("h_code", hCode);
	}

	public java.lang.Integer getHCode() {
		return get("h_code");
	}

	public void setHName(java.lang.String hName) {
		set("h_name", hName);
	}

	public java.lang.String getHName() {
		return get("h_name");
	}

	public void setIsHot(java.lang.String isHot) {
		set("is_hot", isHot);
	}

	public java.lang.String getIsHot() {
		return get("is_hot");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setCreateUser(java.lang.String createUser) {
		set("create_user", createUser);
	}

	public java.lang.String getCreateUser() {
		return get("create_user");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setUpdateUser(java.lang.String updateUser) {
		set("update_user", updateUser);
	}

	public java.lang.String getUpdateUser() {
		return get("update_user");
	}

	public void setIsDelete(java.lang.String isDelete) {
		set("is_delete", isDelete);
	}

	public java.lang.String getIsDelete() {
		return get("is_delete");
	}

}
