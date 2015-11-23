package cn.instree.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.instree.core.base.BaseService;
import cn.instree.core.base.IBaseDao;
import cn.instree.domain.User;
import cn.instree.service.UserService;

@Service("UserService")
public class UserServiceImpl extends BaseService<User,String> implements UserService{
	@Override
	@Resource(name = "UserDao")
	public void setBaseDao(IBaseDao<User,String> dao) {
		super.setBaseDao(dao);
	}
	
	
	
}
