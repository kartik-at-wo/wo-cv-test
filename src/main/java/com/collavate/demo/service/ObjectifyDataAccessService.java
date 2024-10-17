package com.collavate.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collavate.demo.entity.User;
import com.collavate.demo.repository.DataStoreRepository;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import com.googlecode.objectify.ObjectifyService;

@Service
public class ObjectifyDataAccessService {
	
	@Autowired
	private Datastore datastore;

	@Autowired
	private DataStoreRepository dataStoreRepository;
	
	public User saveUser(User user) {
		//ObjectifyService.ofy().save().entity(user).now();
		/*
		 * Key taskKey = datastore.newKeyFactory().setKind("user").newKey("userdata");
		 * Entity task = Entity.newBuilder(taskKey) .set("name", "john") .set("email",
		 * "johncarter@gmai.com") .build(); datastore.put(task);
		 */
		return dataStoreRepository.save(user);
	}
	
}
