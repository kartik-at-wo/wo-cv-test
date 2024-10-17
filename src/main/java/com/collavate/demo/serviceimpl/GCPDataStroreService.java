package com.collavate.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.collavate.demo.pojo.User;
//import com.google.code.ssm.api.CacheName;
//import com.google.code.ssm.api.ReadThroughAssignCache;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

import net.spy.memcached.MemcachedClient;

@Service
public class GCPDataStroreService {
	
	//@Autowired
   // private MemcachedClient memcachedClient;
	
	private static String MEMCACHE_KEY = "datastorecv";
	

	public User saveUserWithObjectify(User user) {
	    ObjectifyService.ofy().save().entity(user).now();
		return user;
	}
	
	// @CacheName("datastorecache")
	// @ReadThroughAssignCache(namespace="datastorecache", assignedKey="all")
	//@Cacheable(value = "datastorecache", key = "all")
	public List<User> findAllUserWithObjectify() throws Exception {
		 System.out.println("METHOD CALLED");
		 
		 Objectify ofy = ObjectifyService.ofy();
	     List<User>  list = ofy.load().type(User.class).list();
	     
	     System.out.println("VALUE FROM DATASTORE");
	     return list;
		 
		 /*
	     Object ss=  getCacheValue(MEMCACHE_KEY);
	     if(ss ==null) {
	    	 Objectify ofy = ObjectifyService.ofy();
		     List<User>  list = ofy.load().type(User.class).list();
		     
		     setCacheValue(MEMCACHE_KEY, list);
		     
		     System.out.println("VALUE FROM DATASTORE");
		     return list;
	     }else {
	    	 
	    	 System.out.println("VALUE FROM CACHE");
	    	 return (List<User>) ss;
	     }
	     
	     */
	}
	
/*	public void setCacheValue(String key, Object value) throws Exception {
        memcachedClient.set(key, 36000, value);
    }

    public Object getCacheValue(String key) throws Exception {
        return memcachedClient.get(key);
    }

    public void deleteCacheValue(String key) throws Exception {
        memcachedClient.delete(key);
    } */
}
