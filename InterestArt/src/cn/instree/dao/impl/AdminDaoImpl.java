package cn.instree.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import cn.instree.core.base.BaseDao;
import cn.instree.dao.AdminDao;
import cn.instree.domain.Admin;

@Repository("AdminDao")
public class AdminDaoImpl extends BaseDao<Admin,Integer> implements AdminDao{

	@Resource(name = "sessionTemplate")
    protected SqlSessionTemplate sqlSessionTemplate;
	
	//保存之后获取主键
	public int insertAndGetId(Admin admin) {
		
		sqlSessionTemplate.insert("insertAndGetId", admin);
		return admin.getId();
		
	}
	
	
	
}
