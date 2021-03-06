package com.java.gmall.index.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangli
 * @since 2020/1/23 19:37
 */
@Configuration
public class RedissonConfig {


	@Bean
	public RedissonClient redissonClient() {
		// 默认连接地址 127.0.0.1:6379
//		 RedissonClient client = Redisson.create();
//		 return client;

		// redis不在本机
		Config config = new Config();
//		config.useSentinelServers().setMasterName().addSentinelAddress();
//		config.useMasterSlaveServers().setMasterAddress().setSlaveAddresses();
//		config.useClusterServers().addNodeAddress()
		config.useSingleServer().setAddress("redis://localhost:6379");
		return Redisson.create(config);
	}
}
