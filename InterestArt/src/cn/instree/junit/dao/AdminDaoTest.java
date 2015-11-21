package cn.instree.junit.dao;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.instree.dao.AdminDao;
import cn.instree.domain.Admin;

public class AdminDaoTest {

	@Test
	public void testSaveAdmin() {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config/applicationContext.xml"});
		AdminDao userdao = (AdminDao)ctx.getBean("AdminDao");
		Admin user = new Admin();
		user.setAdminName("'why'");
		user.setAdminId("123");
		userdao.save(user);
		
		
//		List<String> arraylist = new ArrayList<String>();
//		arraylist.add("201510202354282860000");
//		arraylist.add("201510202356579470000");
//		
//		userdao.removeOfBatch(arraylist);
		
	}
	
	@Test
	public void testInsertAndGetId() {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config/applicationContext.xml"});
		AdminDao userdao = (AdminDao)ctx.getBean("AdminDao");
		Admin user = new Admin();
		user.setAdminName("'why'");
		user.setAdminId("123");
		System.out.println(userdao.insertAndGetId(user));
		
	}
	
}
