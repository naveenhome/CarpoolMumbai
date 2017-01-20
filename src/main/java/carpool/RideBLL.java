package carpool;

public class RideBLL {
	
	public String SaveRide(Ride ride)
	{
		if(ride.empName.equals(" "))
		{
			return "Posting was unsuccessful.";
		}
		else
		{
		return "Posting was successful.";
		}
	}

}
