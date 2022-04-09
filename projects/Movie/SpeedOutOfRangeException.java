package p1;

public class SpeedOutOfRangeException extends Exception
{	
	
	SpeedOutOfRangeException(String errMsg)
	{
		super(errMsg);
		//it will give a call to constructor from Exception class
		//Exception(String message)
		//Constructs a new exception with the specified detail message.
	}
}
