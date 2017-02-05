package com.lvoutcity.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.lvoutcity.core.util.LvoutcityUtils;
import com.lvoutcity.core.util.SQuery;
import com.lvoutcity.model.base.BaseUserMember;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class UserMember extends BaseUserMember<UserMember> {
	public static final UserMember dao = new UserMember();

	public UserMember findByPhoneNumber(String phoneNumber) {
		return UserMember.dao.findFirst(
				"select * from t_user inner join t_user_member on t_user.id = t_user_member.user_id where  phone_number=?",
				phoneNumber);
	}
	/**
	 * @decription  判断用户是否存在
	 * @param userId
	 * @return
	 */
	public UserMember judgeByUserId(String userId) {
		return UserMember.dao.findFirst(
				"select * from t_user inner join t_user_member on t_user.id = t_user_member.user_id where  t_user.id =?",
				userId);
	}
	
	
	public UserMember findByKeyWord(String keyword){
		return UserMember.dao.findFirst(
				"select * from t_user as user inner join t_user_member as um on user.id = um.user_id "
				+ " where  user.phone_number='"+keyword+"' or user.nick_name like '%"+keyword+"%'");
	}
	
	public UserMember findByUserId(String userId){
		return UserMember.dao.findFirst("select * from t_user_member where user_id =?",userId);
	}
	
	public UserMember findByLvNo(int lvNo){
		return UserMember.dao.findFirst("select * from t_user inner join t_user_member on t_user.id = t_user_member.user_id "
				+ " where t_user.user_no="+lvNo );
	}
	public List<UserMember> findByMOHU(String phoneNumber) {
		return UserMember.dao.find("select member.city_id,member.user_id,member.avatar,member.personal_sign"
				+ " from t_user as user inner join t_user_member as member on user.id = member.user_id where  user.phone_number like '%"+phoneNumber+"%'"
						+ "limit 20"
				);
	}
	public List<UserMember> findByLvNoMOHU(int lvNo){
		return UserMember.dao.find("select * from t_user inner join t_user_member on t_user.id = t_user_member.user_id "
				+ " where t_user.user_no like '%"+lvNo +"%' limit 20");
	}
	
	public int findRegisterNumByDate(String beginDate,String endDate){
		
		return UserMember.dao.find("select * from t_user as user inner join t_user_member "
		 		+ " on user.id = t_user_member.user_id  where user.create_time between '"+beginDate 
		 		+ "' and  '"+endDate+"'").size();
	}
	
	public void setNum(int num){
		set("num",num);
	}
	public int getNum(){
		return get("num");
	}
	
	/**
	 * 
	 * @Title: queryUserLevel 
	 * @Description: 查询推荐人
	 * @param @param level
	 * @param @param userId
	 * @param @param page
	 * @param @param pageSize
	 * @param @return    设定文件 
	 * @return Page<Record>    返回类型 
	 * @create_time 2016 2016年7月5日 下午10:01:46
	 * @create_user James w.s
	 * @throws
	 */
	public Page<Record> queryUserLevel(String level,User user,Integer page,Integer pageSize){
		SQuery sql = SQuery.create(" select u.*,date_format(u.create_time,'%Y-%m-%d %H:%m:%s') as create_time ,m.status ");
		sql.append(" from t_user_member m  ");
		sql.append(" left join t_user u  on u.id = m.user_id ");
		sql.append(" where 1=1 and m.status = 1 ");
		if("1".equals(level)){
			sql.append(" and m.referee_level_1 = '"+user.getId()+"'");
		}
		if("2".equals(level)){
			sql.append(" and m.referee_level_2 = '"+user.getId()+"'");
		}
		if("3".equals(level)){
			sql.append(" and m.referee_level_3 = '"+user.getId()+"'");
		}
		if(LvoutcityUtils.isNotNull(user.getPhoneNumber())){
			sql.append(" and u.phone_number = '"+user.getPhoneNumber()+"' ");
		}
		if(LvoutcityUtils.isNotNull(user.getRealName())){
			sql.append(" and u.real_name = '"+user.getRealName()+"' ");
		}
		sql.append(" order by m.create_time desc ");
		return Db.paginate(page, pageSize, sql.isSql(), sql.isFrom());
	}
	
	
}
