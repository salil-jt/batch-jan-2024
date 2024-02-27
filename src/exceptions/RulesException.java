package exceptions;

public class RulesException {
public static void main(String[] args) throws Exception {
	
	
	try
	{
	    // Raise a new Exception
	    if(true) throw new Exception();

	}
	catch(Exception b1)
	{
	    // Rethrow the caught exception after doing any required handling
	    throw b1;
	}


}
}
