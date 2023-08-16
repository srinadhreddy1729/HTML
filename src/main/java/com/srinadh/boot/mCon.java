package com.srinadh.boot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class mCon {
	@Autowired
	info in;
	public info getIn() {
		return in;
	}
	public void setIn(info in) {
		this.in = in;
	}
	@GetMapping("/add")
	public String add()
	{
		student s=new student();
		s.setId(2);
		s.setName("kish");
		Date jj=new Date();
		long m=jj.getTime();
		java.sql.Date mm=new java.sql.Date(m);
		s.setDate(mm);
		
		in.save(s);
		
		return "home";
	}
	

}
