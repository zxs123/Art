package cn.instree.domain;

import cn.instree.core.anno.base.PrimaryKey;
import cn.instree.core.anno.base.Table;
import cn.instree.core.anno.base.TableColumn;

@Table("user")
public class User {
	
	@PrimaryKey
    private String userId;
	@TableColumn
    private String email;
	@TableColumn
    private String sina;
	@TableColumn
    private String wexin;
	@TableColumn
    private String telephone;
	@TableColumn
    private String password;
	@TableColumn
    private String sex;
	@TableColumn
    private String url;
	@TableColumn
    private String birthday;
	@TableColumn
    private int accountType;
	@TableColumn
    private String userName;
	@TableColumn
    private int visits;
	@TableColumn
    private int works;
	@TableColumn
    private int fans;
	@TableColumn
    private int focus;
	@TableColumn
    private String userImage;
	@TableColumn
    private String signature;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSina() {
		return sina;
	}
	public void setSina(String sina) {
		this.sina = sina;
	}
	public String getWexin() {
		return wexin;
	}
	public void setWexin(String wexin) {
		this.wexin = wexin;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(Integer visits) {
		this.visits = visits;
	}
	public int getWorks() {
		return works;
	}
	public void setWorks(Integer works) {
		this.works = works;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(Integer fans) {
		this.fans = fans;
	}
	public int getFocus() {
		return focus;
	}
	public void setFocus(Integer focus) {
		this.focus = focus;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
}