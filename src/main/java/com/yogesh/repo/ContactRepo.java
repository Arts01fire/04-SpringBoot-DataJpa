package com.yogesh.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.yogesh.entity.Contact;

public interface ContactRepo extends CrudRepository<Contact,Serializable>{

}
