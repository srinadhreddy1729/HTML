package com.srinadh.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class info {
	@Autowired
	Reposity repo;
	public Reposity getRepo() {
		return repo;
	}
	public void setRepo(Reposity repo) {
		this.repo = repo;
	}
	public List<student> save(student stu)
	
	{
		student jj=repo.save(stu);
		return jj;
	}

}
