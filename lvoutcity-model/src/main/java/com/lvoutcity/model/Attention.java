package com.lvoutcity.model;

import java.util.List;

import com.lvoutcity.model.base.BaseAttention;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Attention extends BaseAttention<Attention> {
	public static final Attention dao = new Attention();
	
	
	
	public List<Attention> findByUserId(String userId,String type){
	return	Attention.dao.find("select * from t_attention where user_id='"+ userId +"' and type ="+type);
	}
	
	public Attention findAttention(String sql){
		return Attention.dao.findFirst("select * from t_attention"+sql);
	}
   
	
	public  Attention findByRouteNo(int routeNo,String userId){
		return Attention.dao.findFirst("select * from t_attention where route_no="+routeNo +" and user_id='"+userId+"'" );
	}
}
