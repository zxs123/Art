package cn.instree.domain;

import cn.instree.core.anno.base.PrimaryKey;
import cn.instree.core.anno.base.Table;
import cn.instree.core.anno.base.TableColumn;

@Table("admin")
public class Admin {
	@PrimaryKey(generator="native")
    private int id;
	@TableColumn
    private String adminId;
	@TableColumn
    private String adminName;
	@TableColumn
    private String telephone;
	@TableColumn
    private String sex;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}