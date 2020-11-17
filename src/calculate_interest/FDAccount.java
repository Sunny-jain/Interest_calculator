package calculate_interest;

public class FDAccount extends Account{
	private int noOfDays;
	private int ageOfACHolder;
	private double amount;
	
	
	public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
		this.amount = amount;
	}


	double calculateInterest() {
		
		if(ageOfACHolder<=0 && ageOfACHolder>125)
		{
			return -1;
		}
		if(amount<10000000)
		{
			if(ageOfACHolder>50)
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					return amount*5.00;
				}
				else if(noOfDays>14 && noOfDays<=29)
				{
					return amount*5.25;
				}
				else if(noOfDays>29 && noOfDays<=45)
				{
					return amount*6.00;
				}
				else if(noOfDays>45 && noOfDays<=60)
				{
					return amount*7.50;
				}
				else if(noOfDays>60 && noOfDays<=184)
				{
					return amount*8.00;
				}
				else
				{
					return amount*8.50;
				}
			}
			else
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					return amount*4.50;
				}
				else if(noOfDays>14 && noOfDays<=29)
				{
					return amount*4.75;
				}
				else if(noOfDays>29 && noOfDays<=45)
				{
					return amount*5.50;
				}
				else if(noOfDays>45 && noOfDays<=60)
				{
					return amount*7.00;
				}
				else if(noOfDays>60 && noOfDays<=184)
				{
					return amount*7.50;
				}
				else
				{
					return amount*8.00;
				}
			}
		}
		else
		{
			if(noOfDays>=7 && noOfDays<=14)
			{
				return amount*6.50;
			}
			else if(noOfDays>14 && noOfDays<=29)
			{
				return amount*6.75;
			}
			else if(noOfDays>29 && noOfDays<=45)
			{
				return amount*6.75;
			}
			else if(noOfDays>45 && noOfDays<=60)
			{
				return amount*8.00;
			}
			else if(noOfDays>60 && noOfDays<=184)
			{
				return amount*8.50;
			}
			else
			{
				return amount*10.00;
			}
		}
	}

}
