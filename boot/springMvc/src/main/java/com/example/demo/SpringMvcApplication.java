package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context=(ApplicationContext) SpringApplication.run(SpringMvcApplication.class, args);
		UserRepo rep=((BeanFactory) context).getBean(UserRepo.class);
		User u=new User();
		u.setId(928);
		u.setName("sanjna shahid");
		User user=rep.save(u);
		System.out.println(user);
	}

}
/*
	spring boot-> module of spring
				  speeds up dev
              	  easy to create standalone apps
              	  convention over config s/w style
              	  decreases efforts of devs by auto configs (with use of annotations)
	[hibernate is implentation of jpa]
	jpa-> java persistence api
		  (persistent yani permanent store krna)
		  ORM[obj relational mapping] tool
		  ORM is like intermediator(beech ka aadmi) b/w DB nd java
		  sql khud se handle krta orm,nai toh we hv to write the queries
		  can perform CRUD via this
*/