package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import org.springframework.data.annotation.Id;

public class User {

	 @Id
	    private Integer id;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public User() {
    }

    public User(String name, String dept) {

        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
