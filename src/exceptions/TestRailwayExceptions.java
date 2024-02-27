package exceptions;

public class TestRailwayExceptions {
	public static void main(String[] args) {
		
        String travel_date = "21/12/2012";
        TicketBooker ticketBooker = new TicketBooker();
       // ticketBooker.testMethod();
			try {
				ticketBooker.bookTicket(17031, travel_date, 5, 2);
			} catch (ServiceCancelledException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SeatsNotAvailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//This line can create an exception
		
		
		
	}

}
class RailwayException extends Exception
{
    int trainNo;
    String errorMessage;
    
    RailwayException(int trainNo, String errorMessage)
    {
        this.trainNo = trainNo;
        this.errorMessage = errorMessage;
    }

    String getErrorMessage()
    {
        return errorMessage;
    }
}
class ServiceCancelledException extends RailwayException
{
    String date;

    ServiceCancelledException(int trainNo, String date)
    {
        super(trainNo, "The service of train " + trainNo + " is cancelled on " + date);
        this.date = date;
    }
}
class SeatsNotAvailableException extends RailwayException
{
    String date;

    SeatsNotAvailableException(int trainNo, String date)
    {
        super(trainNo, "There are no seats available for the train " + trainNo + " on " + date);
        this.date = date;
    }
}
class TicketBooker
{

	public void bookTicket(int trainNo, String date, int adults, int children)
			throws  ServiceCancelledException, SeatsNotAvailableException  
			//throws needs to the placed after the method signature to indicate the caller of the method what exceptions a method can throw
			 {
        if(isServiceCancelled(trainNo, date))
        {
            throw new ServiceCancelledException(trainNo, date); // LINE B//throw helps in throwing a new exception or re-throwing a caught exception.
        }
        if(areSeatsAvailable(trainNo, date, adults, children))
        {
            confirmBooking(trainNo, date, adults, children);
        }
        else
        {
            throw new SeatsNotAvailableException(trainNo, date); // LINE C
        }


	}

	private void confirmBooking(int trainNo, String date, int adults, int children) {
		// TODO Auto-generated method stub
		//any code to actually book the tickets
		
	}

	private boolean areSeatsAvailable(int trainNo, String date, int adults, int children) {
		// TODO Auto-generated method stub
		//// we are connecting some database and get information on how many seats are available
		return false;
	}

	private boolean isServiceCancelled(int trainNo, String date) {
		// TODO Auto-generated method stub
		// we are connecting some database
		return true;
	}
	
	public void testMethod() {
		System.out.println("In test method");
	}
}

