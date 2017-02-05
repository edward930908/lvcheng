package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAttractions<M extends BaseAttractions<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setLongitude(java.lang.String longitude) {
		set("longitude", longitude);
	}

	public java.lang.String getLongitude() {
		return get("longitude");
	}

	public void setLatitude(java.lang.String latitude) {
		set("latitude", latitude);
	}

	public java.lang.String getLatitude() {
		return get("latitude");
	}

	public void setPrice(java.lang.Integer price) {
		set("price", price);
	}

	public java.lang.Integer getPrice() {
		return get("price");
	}

	public void setClubId(java.lang.String clubId) {
		set("club_id", clubId);
	}

	public java.lang.String getClubId() {
		return get("club_id");
	}

	public void setProvince(java.lang.String province) {
		set("province", province);
	}

	public java.lang.String getProvince() {
		return get("province");
	}

	public void setOrderNo(java.lang.Integer orderNo) {
		set("order_no", orderNo);
	}

	public java.lang.Integer getOrderNo() {
		return get("order_no");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setCity(java.lang.String city) {
		set("city", city);
	}

	public java.lang.String getCity() {
		return get("city");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setEnabled(java.lang.String enabled) {
		set("enabled", enabled);
	}

	public java.lang.String getEnabled() {
		return get("enabled");
	}

	public void setAllowPush(java.lang.String allowPush) {
		set("allow_push", allowPush);
	}

	public java.lang.String getAllowPush() {
		return get("allow_push");
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

	public void setDistance(java.lang.Integer distance) {
		set("distance", distance);
	}

	public java.lang.Integer getDistance() {
		return get("distance");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

}
