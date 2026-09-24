package com.ayush.dtos;

public class StudentDTO {
	
	private String name;
	private Integer age;
	private Character gender;  // M F O
	private String college;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, Integer age, Character gender, String college) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.college = college;
	}

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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", college=" + college + "]";
	}
}
