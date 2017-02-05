package com.lvoutcity.model;

import java.util.List;

import com.lvoutcity.core.util.LvoutcityUtils;
import com.lvoutcity.model.base.BaseChatGroupUser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ChatGroupUser extends BaseChatGroupUser<ChatGroupUser> {
	public static final ChatGroupUser dao = new ChatGroupUser();
	
	public ChatGroupUser(){

	}
	
	public ChatGroupUser(User u, ChatGroup cg){
		this.setId(LvoutcityUtils.getUUID());
		this.setGroupId(cg.getId());
		this.setNickName(u.getNickName());
		this.setUserId(u.getId());
	}
	
	public List<ChatGroupUser> getGroups(String userId){//通过userid查询群组
		return ChatGroupUser.dao.find("select * from t_chat_group_user where user_id ='" +userId+"'");
	}
	
	/**
	 * 获取所有群（除了当前群）
	 * @param groupId
	 * @param userId
	 * @return
	 */
	public String getGroupsNotContainNowGuroup(String groupId,String userId){
		
		List<ChatGroupUser> chatGroupUserList = ChatGroupUser.dao.find("select * from t_chat_group_user where user_id ='" +userId+"' and"
				+ " group_id <> '"+groupId+"'");
		
		String groupIds ="";
		if(chatGroupUserList.size()>0){
			for(int i=0;i<chatGroupUserList.size();i++){
				
				groupIds+=",'"+chatGroupUserList.get(i).getGroupId()+"'";
			}
			
		}
		return groupIds.isEmpty()?null:groupIds.substring(1);
	}
	
	public List<ChatGroupUser> getGroupUser(String groupId){
		return ChatGroupUser.dao.find("select * from t_chat_group_user where group_id ='"+groupId +"' order by create_time;");
	}
	
	public List<ChatGroupUser> getGroupUserByGroupIdAndUserId(String groupId,String userId){
		return ChatGroupUser.dao.find("select * from t_chat_group_user where group_id ='"+groupId +"' and user_id <> '"+userId+"' order by create_time;");
	}
	
	/**
	 * 获取我在本群中的昵称
	 */
	public String getMyNickName(String userId,String groupId){
		return ChatGroupUser.dao.findFirst("select nick_name from t_chat_group_user where user_id='"+userId +"'" +" and group_id ='"+groupId+"'").getNickName();
	}
	
	public ChatGroupUser findByUserIdInGroup(String userId,String groupId){
		return ChatGroupUser.dao.findFirst("select * from t_chat_group_user where user_id='"+userId +"'" +" and group_id ='"+groupId+"'");
	}
	public static void main(String[] args) {
	String a=	new ChatGroupUser().getGroupsNotContainNowGuroup("0ac3cdcabe0241bdaf62bb2a4db206e3","c7e45ba29da942b684c3f80e0c534e96");
	System.out.println(a);
	}
}
