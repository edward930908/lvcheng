package com.lvoutcity.model;

import com.jfinal.plugin.activerecord.Db;
import com.lvoutcity.model.base.BaseCorpsLeader;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class CorpsLeader extends BaseCorpsLeader<CorpsLeader> {
	public static final CorpsLeader dao = new CorpsLeader();
	
	public void deleteByCorpId(String id){
		Db.update("delete from t_corps_leader where corps_id = '"+id+"'");
	}
}
