package hyman.gson.analysis;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 7852517261434517123L;
	
	private String name;
	private Integer age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
