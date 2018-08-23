package com.github.nwt248.rewards;

import java.util.Random;

import com.github.nwt248.rewards.AccountContribution;
import com.github.nwt248.rewards.Dining;
import com.github.nwt248.rewards.RewardConfirmationImpl;
import com.github.nwt248.rewards.RewardRepository;

/**
 * A dummy reward repository implementation.
 */
public class StubRewardRepository implements RewardRepository {

  public RewardConfirmation confirmReward(AccountContribution contribution, Dining dining) {
    return new RewardConfirmationImpl(confirmationNumber(), contribution);
  }

  private String confirmationNumber() {
    return new Random().toString();
  }
}