package com.srinadh.boot;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class student {
	@Id
	private int id;
	private String name;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date i) {
		this.date = i;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
