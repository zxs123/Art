package cn.instree.junit.dao;

import java.util.List;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.instree.dao.UserDao;
import cn.instree.domain.User;

public class UserDaoTest {
	@Test
	public void testSaveUser() {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config/applicationContext.xml"});
		UserDao userdao = (UserDao)ctx.getBean("UserDao");
		User user = new User();
		user.setUserName("'why'");
		userdao.save(user);		
		List<User> list = userdao.findAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getUserId());
		}
	}
	
}
