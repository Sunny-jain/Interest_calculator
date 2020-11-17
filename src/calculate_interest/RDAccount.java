package calculate_interest;

public class RDAccount extends Account{
	int noOfMonths;
	int ageOfACHolder;
	double amount;

	public RDAccount(double amount, int noOfMonths, int ageOfACHolder) {
		this.noOfMonths = noOfMonths;
		this.ageOfACHolder = ageOfACHolder;
		this.amount = amount;
	}
	double calculateInterest() {
		if(ageOfACHolder<0 && ageOfACHolder>125)
		{
			return -1;
		}
		if(amount<=0)
		{
			return -1;
		}
		else
		{
			if(ageOfACHolder<=55)
			{
				if(noOfMonths == 6)
				{
					return 7.50*amount;
				}
				else if(noOfMonths == 9)
				{
					return 7.75*amount;
				}
				else if(noOfMonths == 12)
				{
					return 8.00*amount;
				}
				else if(noOfMonths == 15)
				{
					return 8.25*amount;
				}
				else if(noOfMonths == 18)
				{
					return 8.50*amount;
				}
				else if(noOfMonths == 21)
				{
					return 8.75*amount;
				}
				else
				{
					return -2;
				}
			}
			else
			{
				if(noOfMonths == 6)
				{
					return 8.00*amount;
				}
				else if(noOfMonths == 9)
				{
					return 8.25*amount;
				}
				else if(noOfMonths == 12)
				{
					return 8.50*amount;
				}
				else if(noOfMonths == 15)
				{
					return 8.75*amount;
				}
				else if(noOfMonths == 18)
				{
					return 9.00*amount;
				}
				else if(noOfMonths == 21)
				{
					return 9.25*amount;
				}
				else
				{
					return -2;
				}
			}
		}
	}
}
