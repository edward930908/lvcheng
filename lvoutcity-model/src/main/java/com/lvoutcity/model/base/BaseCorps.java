<<<<<<< .mine
package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCorps<M extends BaseCorps<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("original_price", originalPrice);
	}

	public java.math.BigDecimal getOriginalPrice() {
		return get("original_price");
	}

	public void setNowThePrice(java.math.BigDecimal nowThePrice) {
		set("now_the_price", nowThePrice);
	}

	public java.math.BigDecimal getNowThePrice() {
		return get("now_the_price");
	}

	public void setChildPrice(java.math.BigDecimal childPrice) {
		set("child_price", childPrice);
	}

	public java.math.BigDecimal getChildPrice() {
		return get("child_price");
	}

	public void setMissionTime(java.util.Date missionTime) {
		set("mission_time", missionTime);
	}

	public java.util.Date getMissionTime() {
		return get("mission_time");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return get("status");
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

	public void setRouteId(java.lang.String routeId) {
		set("route_id", routeId);
	}

	public java.lang.String getRouteId() {
		return get("route_id");
	}

	public void setSignUpBegin(java.lang.Integer signUpBegin) {
		set("sign_up_begin", signUpBegin);
	}

	public java.lang.Integer getSignUpBegin() {
		return get("sign_up_begin");
	}

	public void setSignUpEnd(java.lang.Integer signUpEnd) {
		set("sign_up_end", signUpEnd);
	}

	public java.lang.Integer getSignUpEnd() {
		return get("sign_up_end");
	}

	public void setRefuseReason(java.lang.String refuseReason) {
		set("refuse_reason", refuseReason);
	}

	public java.lang.String getRefuseReason() {
		return get("refuse_reason");
	}

	public void setVerifyUser(java.lang.String verifyUser) {
		set("verify_user", verifyUser);
	}

	public java.lang.String getVerifyUser() {
		return get("verify_user");
	}

	public void setMissionEnd(java.util.Date missionEnd) {
		set("mission_end", missionEnd);
	}

	public java.util.Date getMissionEnd() {
		return get("mission_end");
	}

}
=======
package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCorps<M extends BaseCorps<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("original_price", originalPrice);
	}

	public java.math.BigDecimal getOriginalPrice() {
		return get("original_price");
	}

	public void setNowThePrice(java.math.BigDecimal nowThePrice) {
		set("now_the_price", nowThePrice);
	}

	public java.math.BigDecimal getNowThePrice() {
		return get("now_the_price");
	}

	public void setChildPrice(java.math.BigDecimal childPrice) {
		set("child_price", childPrice);
	}

	public java.math.BigDecimal getChildPrice() {
		return get("child_price");
	}

	public void setMissionTime(java.util.Date missionTime) {
		set("mission_time", missionTime);
	}

	public java.util.Date getMissionTime() {
		return get("mission_time");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return get("status");
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

	public void setRouteId(java.lang.String routeId) {
		set("route_id", routeId);
	}

	public java.lang.String getRouteId() {
		return get("route_id");
	}

	public void setSignUpBegin(java.lang.Integer signUpBegin) {
		set("sign_up_begin", signUpBegin);
	}

	public java.lang.Integer getSignUpBegin() {
		return get("sign_up_begin");
	}

	public void setSignUpEnd(java.lang.Integer signUpEnd) {
		set("sign_up_end", signUpEnd);
	}

	public java.lang.Integer getSignUpEnd() {
		return get("sign_up_end");
	}

	public void setRefuseReason(java.lang.String refuseReason) {
		set("refuse_reason", refuseReason);
	}

	public java.lang.String getRefuseReason() {
		return get("refuse_reason");
	}

	public void setVerifyUser(java.lang.String verifyUser) {
		set("verify_user", verifyUser);
	}

	public java.lang.String getVerifyUser() {
		return get("verify_user");
	}

	public void setMissionEnd(java.util.Date missionEnd) {
		set("mission_end", missionEnd);
	}

	public java.util.Date getMissionEnd() {
		return get("mission_end");
	}

	public void setStock(java.lang.Integer stock) {
		set("stock", stock);
	}

	public java.lang.Integer getStock() {
		return get("stock");
	}

}
>>>>>>> .r2112
