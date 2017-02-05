package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTouristInfo<M extends BaseTouristInfo<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setTouristNo(java.lang.Integer touristNo) {
		set("tourist_no", touristNo);
	}

	public java.lang.Integer getTouristNo() {
		return get("tourist_no");
	}

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}

	public void setOrderId(java.lang.String orderId) {
		set("order_id", orderId);
	}

	public java.lang.String getOrderId() {
		return get("order_id");
	}

	public void setCorpsId(java.lang.String corpsId) {
		set("corps_id", corpsId);
	}

	public java.lang.String getCorpsId() {
		return get("corps_id");
	}

	public void setRealName(java.lang.String realName) {
		set("real_name", realName);
	}

	public java.lang.String getRealName() {
		return get("real_name");
	}

	public void setIdNumber(java.lang.String idNumber) {
		set("id_number", idNumber);
	}

	public java.lang.String getIdNumber() {
		return get("id_number");
	}

	public void setTypeOfCertificate(java.lang.String typeOfCertificate) {
		set("type_of_certificate", typeOfCertificate);
	}

	public java.lang.String getTypeOfCertificate() {
		return get("type_of_certificate");
	}

	public void setTouristType(java.lang.String touristType) {
		set("tourist_type", touristType);
	}

	public java.lang.String getTouristType() {
		return get("tourist_type");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setFee(java.math.BigDecimal fee) {
		set("fee", fee);
	}

	public java.math.BigDecimal getFee() {
		return get("fee");
	}

	public void setCreateUser(java.lang.String createUser) {
		set("create_user", createUser);
	}

	public java.lang.String getCreateUser() {
		return get("create_user");
	}

	public void setIsDelete(java.lang.String isDelete) {
		set("is_delete", isDelete);
	}

	public java.lang.String getIsDelete() {
		return get("is_delete");
	}

}
