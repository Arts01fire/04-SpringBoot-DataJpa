package com.yogesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yogesh.entity.Contact;
import com.yogesh.repo.ContactRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	
	ContactRepo repo=context.getBean(ContactRepo.class);
	
	Contact c=new Contact();
	c.setContactId(153);
	c.setContactName("Sanjeet Singh");
	c.setContactNumber(8978677);
	repo.save(c);
	context.close();
	
	}

}
