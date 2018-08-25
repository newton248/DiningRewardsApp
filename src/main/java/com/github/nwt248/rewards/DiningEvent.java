package com.github.nwt248.rewards;

import com.github.nwt248.common.MonetaryAmount;
import com.github.nwt248.common.SimpleDate;

public interface DiningEvent {

	/**
	   * Returns the amount of this dining--the total amount of the bill that was charged to the credit card.
	   */
	MonetaryAmount getAmount();

	/**
	   * Returns the number of the credit card used to pay for this dining. For this dining to be eligible for reward,
	   * this credit card number should be associated with a valid account in the reward network.
	   */
	String getCreditCardNumber();

	/**
	   * Returns the merchant number of the restaurant where this dining occurred. For this dining to be eligible for
	   * reward, this merchant number should be associated with a valid restaurant in the reward network.
	   */
	String getMerchantNumber();

	/**
	   * Returns the date this dining occurred on.
	   */
	SimpleDate getDate();

}