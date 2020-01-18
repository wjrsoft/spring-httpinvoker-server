package com.service.client;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.entity.Student;
import com.entity.User;
import com.service.StudentService;
import com.service.UserService;
 
public class Test {
   public static void main(String[] args) {
       ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:client-application-context.xml");
       UserService service = (UserService)ac.getBean("userService");
       User u = service.getUserbyName("wwh");
       System.out.println(u);
       StudentService studentService = ac.getBean("studentService", StudentService.class);
       List<Student> slist = studentService.getStudent();
       for(Student s: slist) {
    	   System.out.println(s);
       }
   }
}