package com.github.nwt248.rewards;

/**
 * A summary of a confirmed reward transaction describing a contribution made to an account that was distributed among
 * the account's beneficiaries.
 */
public class RewardConfirmationImpl implements RewardConfirmation {

  private String confirmationNumber;

  private AccountContribution accountContribution;

  /**
   * Creates a new reward confirmation.
   * @param confirmationNumber the unique confirmation number
   * @param accountContribution a summary of the account contribution that was made
   */
  public RewardConfirmationImpl(String confirmationNumber, AccountContribution accountContribution) {
    this.confirmationNumber = confirmationNumber;
    this.accountContribution = accountContribution;
  }

  /* (non-Javadoc)
 * @see com.github.nwt248.rewards.RewardConfirmation#getConfirmationNumber()
 */
  @Override
public String getConfirmationNumber() {
    return confirmationNumber;
  }

  /* (non-Javadoc)
 * @see com.github.nwt248.rewards.RewardConfirmation#getAccountContribution()
 */
  @Override
public AccountContribution getAccountContribution() {
    return accountContribution;
  }

  public String toString() {
    return confirmationNumber;
  }
}