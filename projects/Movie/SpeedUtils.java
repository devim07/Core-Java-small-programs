package p1;

public class SpeedUtils 
{
	public static final int MAX_SPEED;
	public static final int MIN_SPEED;
	static
	{
		MAX_SPEED=80;
		MIN_SPEED=20;
	}
	
	public static void validateSpeed(int speed)
	{
		try
		{
			if(speed>MAX_SPEED)
				throw new SpeedOutOfRangeException("SPEED IS TOO FAST");
			else
				if(speed<MIN_SPEED)
					throw new SpeedOutOfRangeException("SPEED IS TOO SLOW");
				else
					System.out.println("Speed is within range");
				
		}
		catch(SpeedOutOfRangeException e)
		{
			System.out.println(e);
		}
	}
}
