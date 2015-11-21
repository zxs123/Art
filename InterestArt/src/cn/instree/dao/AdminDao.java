package cn.instree.dao;

import cn.instree.core.base.IBaseDao;
import cn.instree.domain.Admin;

public interface AdminDao extends IBaseDao<Admin,Integer>{
	
	public int insertAndGetId(Admin admin);
	
}
