package com.github.nwt248.rewards;

public interface RewardConfirmation {

	/**
	   * Returns the confirmation number of the reward transaction. Can be used later to lookup the transaction record.
	   */
	String getConfirmationNumber();

	/**
	   * Returns a summary of the monetary contribution that was made to an account.
	   * @return the account contribution (the details of this reward)
	   */
	AccountContribution getAccountContribution();

}