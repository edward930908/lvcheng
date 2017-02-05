package com.lvoutcity.model;

import java.util.List;

import com.lvoutcity.model.base.BaseArea;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Area extends BaseArea<Area> {
	public static final Area dao = new Area();
	public Area getArea(int cityId){
		return Area.dao.findFirst("select t1.name as city,t2.name as province from "
				+ "  t_area as t1 left join t_area as t2 on t1.parent_id=t2.id  where t1.id="+cityId);
	}
	
	/**
	 * 获取所有城市 
	 * @param 
	 * @return
	 */
	public List<Area> getAllCity(int pageSize,int pagination ){
		return Area.dao.find("select t1.name as city,t2.name as province from "
				+ "  t_area as t1 left join t_area as t2 on t1.parent_id=t2.id  limit "+ pagination+","+pageSize);
	}
	public Area queryCity(String cityName){
	   return  Area.dao.findFirst("select * from t_area where name = '"+cityName+"'");
	}
	
	public void setCity(java.lang.String city) {
		set("city", city);
	}

	public java.lang.String getCity() {
		return get("city");
	}
	public void setProvince(java.lang.String province) {
		set("province", province);
	}

	public java.lang.String getProvince() {
		return get("province");
	}
}
