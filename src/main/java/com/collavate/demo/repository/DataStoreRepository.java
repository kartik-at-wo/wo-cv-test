package com.collavate.demo.repository;

import org.springframework.stereotype.Repository;

import com.collavate.demo.entity.User;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

@Repository
public interface DataStoreRepository extends DatastoreRepository<User, Long> {

}
