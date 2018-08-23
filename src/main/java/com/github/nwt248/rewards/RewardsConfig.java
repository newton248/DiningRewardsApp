package com.github.nwt248.rewards;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * xTODO-07: Add the annotation to cause component scanning.
 * Set the base package to pick up all of the classes we have annotated so far.
 * Save all changes, Re-run the RewardNetworkTests.  It should now pass.
 */
@Configuration
@ComponentScan({"com.github.nwt248.rewards"})
public class RewardsConfig {

	DataSource dataSource;
		
	public RewardNetwork rewardNetwork(){
		return new RewardNetworkImpl(
			accountRepository(), 
			restaurantRepository(), 
			rewardRepository());
	}
	
	public AccountRepository accountRepository(){
		JdbcAccountRepository repository = new JdbcAccountRepository();
		repository.setDataSource(dataSource);
		return repository;
	}
	
	public RestaurantRepository restaurantRepository(){
		JdbcRestaurantRepository repository = new JdbcRestaurantRepository(dataSource);
		return repository;
	}
	
	public RewardRepository rewardRepository(){
		JdbcRewardRepository repository = new JdbcRewardRepository();
		repository.setDataSource(dataSource);
		return repository;
	}
	
	//	xTODO-02: Remove all of the @Bean methods above.  Remove the @Autowired field.
    //	Try executing the RewardNetworkTests test class. It should fail. Why?
	
}
