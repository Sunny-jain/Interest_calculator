package calculate_interest;

public class SBAccount extends Account{
	double amount;
	int typeOfAccount;
	
	public SBAccount(double amount, int typeOfAccount) {
		this.amount = amount;
		this.typeOfAccount = typeOfAccount;
	}

	double calculateInterest() {
		if(typeOfAccount == 0)
		{
			return amount*4;
		}
		else
		{
			return amount*6;
		}
	}

}
