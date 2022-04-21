package Movie;
import java.util.*;

//Child class to Theater
class Movie extends Theater{
	static String movieList[] = {"1. Harry Potter", "2. Batman", "3. GodFather"};
	public String movieName;
	

//Default contructor to set the movie name of the calling object
	Movie(String name){
		this.movieName=name;
	}
	
	
//To display the list of all movies available	
	public static void displayAllMovie(){
		for(int i=0; i<movieList.length; i++){
			System.out.println("\t"+movieList[i]);
		}
	}
	
	
//To return the movie name of the calling object
	String getMovieName(){
		return this.movieName;
	}
	
	

//To accept the booking details (name, seat numbers) and to call corresponding functions
//book in parent class to book the seats and name of the booking person
	void provideDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter required seat numbers (seperated by space): ");
		//To take multiple inputs from user
		String nextL= sc.nextLine();
		String given[]=nextL.split("[^0-9]+");
		int seatno[]=new int[given.length];
		for(int i=0; i<given.length;i++){
			seatno[i]=Integer.parseInt(given[i]);
		}
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		this.book(name, seatno);
	}
	
	
//To book the seats and set the name of the booking person
	void book(String name, int... arr){
		super.setBookingName(name, arr);
		double total=super.bookSeat(arr);
		if(total!=0)
			System.out.printf("Your seats are booked. Total amount to be paid is Rs. %.2f \nHappy watching!\n\n", total);
	}
	

//Overriding the parent function to display the details of a booked seat	
	//@Override
	void bookingDetails(int seatNo){
		System.out.println("\tBooked by "+super.getBookingName(seatNo)+".");
		if (super.getBookingName(seatNo)!="NO ONE"){
		System.out.print("\tFor the movie " + this.getMovieName().substring(3));
		System.out.printf(", at a price of Rs. %.2f\n", super.getPrice(seatNo));
		}
	}
	
	
//To select the movie number and to check if its within range
	public static int selectMovieNum(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Kindly enter the number corresponding to the movie you like to watch: ");
		int movieNo=sc.nextInt();
		if(movieNo<0 || movieNo>movieList.length){	
			System.out.println("Sorry, you selected a wrong movie number!!!");
			return -1;
		}
		else
			return movieNo;			
	}
	
	
//To display the vairous options available for ticket booking	
	static void menue(){
		System.out.println("\n\t **Welcome to CD Theaters Ticket Booking Portal**");
		System.out.println("\t====================================================");
		System.out.println("\t1. Check the list of movies running in CD Theater");
		System.out.println("\t2. Select Movie and book tickets");
		System.out.println("\t3. Check if a seat is booked");
		System.out.println("\t4. Quit");
		System.out.print("Please enter the number corresponding to your choice: ");	
	}
	

//Actual main function
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
			try{
			menue();
			int choice=sc.nextInt();
			switch(choice){
				case 1: displayAllMovie();
					break;
				case 2: movieNo=selectMovieNum();
					if(movieNo==-1)
						break;
					m[movieNo-1].displaySeats();
					m[movieNo-1].provideDetails();
					break;
				case 3: movieNo=selectMovieNum();
					if(movieNo==-1)
						break;
					m[movieNo-1].displaySeats();
					System.out.print("Enter the seat number you would like to check: ");
					int seatNo=sc.nextInt();
					m[movieNo-1].bookingDetails(seatNo);
					break;
				case 4: break;
				default: System.out.println("\nXXXXXX Incorrect Input XXXXXX \nPlease enter a proper choice between 1-4\n");					
			}
			System.out.print("Do you wish to continue (Y/N): ");
			c=sc.next().charAt(0);	
			}catch(Exception e){continue;}
		}//while loop for c
	}



//main fuction for checking the Movie class
	/*public static void main(String args[]){
		Theater t1=new Movie("RRR");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter seat numbers: ");
		//To take multiple inputs from user
		String nextL= sc.nextLine();
		String given[]=nextL.split(" ");
		int seatno[]=new int[given.length];
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		for(int i=0; i<given.length;i++){
			seatno[i]=Integer.parseInt(given[i]);
		}
		t1.bookSeat(seatno);
		t1.setBookingName(name, seatno);
		t1.displaySeats();
		//to display who booked the ticket
		System.out.print("Enter seat number you want to check: ");
		t1.bookingDetails(sc.nextInt());
	}*/
	
}
	