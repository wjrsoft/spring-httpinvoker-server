package com.service.impl;


import java.util.ArrayList;
import java.util.List;
import com.entity.Student;
import com.entity.User;
import com.service.StudentService;
public class StudentServiceImpl implements StudentService{
	@Override
	public List<Student> getStudent() {
		List<Student> slist = new ArrayList<>();
		Student student1 = new Student();
		Student student2 = new Student();
		
		User user1 = new User("wangheihei", 24, "wangheihei@163.com");
		User user2 = new User("wangheihei2", 25, "wangheihei2@163.com");
		
		student1.setUser(user1);
		student2.setUser(user2);
		
	    slist.add(student1);
	    slist.add(student2);
		return slist;
	}
}
