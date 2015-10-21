package cn.instree.junit.dao;

import java.util.ArrayList;
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
		user.setUsername("'why'");
		userdao.save(user);
		
		
//		List<String> arraylist = new ArrayList<String>();
//		arraylist.add("201510202354282860000");
//		arraylist.add("201510202356579470000");
//		
//		userdao.removeOfBatch(arraylist);
		
	}
	
}
