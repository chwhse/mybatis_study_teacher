package kr.or.dgit.mybatis_study_teacher.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Date dob;

	public Student() {}

	public Student(int studId, String name, String email, Date dob) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s", studId, name, email, dob);
	}

}
