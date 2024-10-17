package com.collavate.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import com.google.code.ssm.CacheFactory;
import com.google.code.ssm.config.AbstractSSMConfiguration;
import com.google.code.ssm.config.DefaultAddressProvider;
import com.google.code.ssm.providers.xmemcached.XMemcachedConfiguration;
import com.google.code.ssm.providers.CacheConfiguration;
import com.google.code.ssm.providers.xmemcached.MemcacheClientFactoryImpl;
import net.rubyeye.xmemcached.auth.AuthInfo;
import net.rubyeye.xmemcached.utils.AddrUtil;*/
import net.spy.memcached.MemcachedClient;

//@Configuration
//@EnableCaching
public class MemCachierConfig {// extends AbstractSSMConfiguration {

	/*  @Bean
	  @Override
	  public CacheFactory defaultMemcachedClient() {
	  /*  String serverString = System.getenv("MEMCACHIER_SERVERS").replace(",", " ");
	    List<InetSocketAddress> servers = AddrUtil.getAddresses(serverString);
	    AuthInfo authInfo = AuthInfo.plain(System.getenv("MEMCACHIER_USERNAME"),
	                                       System.getenv("MEMCACHIER_PASSWORD"));
	    Map<InetSocketAddress, AuthInfo> authInfoMap =
	      new HashMap<InetSocketAddress, AuthInfo>();
	    for(InetSocketAddress server : servers) {
	      authInfoMap.put(server, authInfo);
	    }

	    final XMemcachedConfiguration conf = new XMemcachedConfiguration();
	    conf.setUseBinaryProtocol(true);
	    conf.setAuthInfoMap(authInfoMap);*/

	/*    DefaultAddressProvider addressProvider = new DefaultAddressProvider();
        addressProvider.setAddress("127.0.0.1:11211");
        
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setConsistentHashing(true);
        
        List<String> cacheAliases = new ArrayList<String>();
        cacheAliases.add("datastorecache");
        
	    final CacheFactory cf = new CacheFactory();
	    cf.setCacheClientFactory(new MemcacheClientFactoryImpl());
	    //cf.setAddressProvider(new DefaultAddressProvider(serverString));
	    cf.setAddressProvider(addressProvider);
	    cf.setConfiguration(cacheConfiguration);
	    cf.setCacheName("datastorecache");
	    cf.setCacheAliases(cacheAliases);
	    return cf;
	  }
	  */
/*	  
	@Bean
	public MemcachedClient memcachedClient() throws Exception {
		String memcachedServer = "10.54.128.3";
		int memcachedPort = 11211;

		MemcachedClient client = new MemcachedClient(new InetSocketAddress(memcachedServer, memcachedPort));
		return client;
		
	} */
}
