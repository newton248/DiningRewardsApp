package com.github.nwt248.rewards;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;

import com.github.nwt248.common.Percentage;
import com.github.nwt248.rewards.Restaurant;
import com.github.nwt248.rewards.RestaurantRepository;

/**
 * A dummy restaurant repository implementation. Has a single restaurant "Apple Bees" with a 8% benefit availability
 * percentage that's always available.
 * 
 * Stubs facilitate unit testing. An object needing a RestaurantRepository can work with this stub and not have to bring
 * in expensive and/or complex dependencies such as a Database. Simple unit tests can then verify object behavior by
 * considering the state of this stub.
 */
public class StubRestaurantRepository implements RestaurantRepository {

	private Map<String, Restaurant> restaurantsByMerchantNumber = new HashMap<String, Restaurant>();

	public StubRestaurantRepository() {
		Restaurant restaurant = new Restaurant("1234567890", "Apple Bees");
		restaurant.setBenefitPercentage(Percentage.valueOf("8%"));
		restaurantsByMerchantNumber.put(restaurant.getNumber(), restaurant);
	}

	public Restaurant findByMerchantNumber(String merchantNumber) {
		Restaurant restaurant = (Restaurant) restaurantsByMerchantNumber.get(merchantNumber);
		if (restaurant == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return restaurant;
	}
}