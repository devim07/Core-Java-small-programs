package Movie;
import java.util.*;
import Movie.Movie;
import Movie.Theater;


public class Main{
	static String movieList[] = {"1. Harry Potter", "2. Batman", "3. GodFather"};
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		Movie m[]=new Movie[movieList.length];
		for(int i=0; i<movieList.length; i++){
			m[i]= new Movie(movieList[i]);
		}
		//For multiple running of program accoring to the wish of the user
		char c='y';
		int movieNo;
		while (c=='y' || c=='Y'){
			menue();
			int choice=sc.nextInt();
			switch(choice){
				case 1: displayAllMovie();
					break;
				case 2: movieNo=selectMovieNum();
					if(movieNo==-1)
						break;
					m[movieNo-1].provideDetails();
					System.out.println("Your seats are booked!!! \nHappy watching");
					break;
				case 3: movieNo=selectMovieNum();
					if(movieNo==-1)
						break;
					System.out.print("Enter the seat number yoy like to check: ");
					int seatNo=sc.nextInt();
					m[movieNo-1].bookingDetails(seatNo);
					break;
				case 4: break;
				default: System.out.println("XXXXXX Incorrect Input XXXXXX \nPlease enter a proper choice between 1-4");					
			}
			System.out.print("Do you wish to continue (Y/N): ");
			c=sc.next().charAt(0);			
		}//while loop for c
	}
}