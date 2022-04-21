package Movie;
import java.util.*;


//User defines unchecked exception declaration for ArrayIndexOutOfBoundsException
class SeatNoNotFoundException extends Exception{
	SeatNoNotFoundException (String message){
		super(message);
	}
}


//Parent class Theater
class Theater{
	private char seats[][]=new char[7][15];
	private double price[]= new double[105];
	private String bookingName[]=new String[105];
	
	
//Default Constructor to set seats to @ and price.
	Theater(){
		for(int seatNo=1; seatNo<=105; seatNo++){
			this.seats[(seatNo-1)/15][(seatNo-1)%15]='@';
			//setting price fro each row according to distance from screen
			if(seatNo<=30)
				this.price[seatNo-1]=250;
			else if (seatNo>=30 && seatNo<=75)
				this.price[seatNo-1]=300;
			else
				this.price[seatNo-1]=380;		
		}
	}
	
	
//Method to display all booked and unbooked seats in the theater 
	void displaySeats(){
		System.out.println("\n                                    SCREEN THIS WAY");
		System.out.println("           =========================================================================\n");
		for(int i=0; i<7; i++){
			for(int j=0; j<15; j++){
				System.out.printf("  %c  |",this.seats[i][j]);
			}
			System.out.println();
			for(int k=0; k<15; k++){
				System.out.printf(" %03d |",((i*15)+k+1)); 
			}
			if(i<2)
				System.out.printf("    Silver = Rs. %.2f", this.price[i*15]);
			else if (i>=2 && i<=4)
				System.out.printf("      Gold = Rs. %.2f", this.price[i*15]);
			else
				System.out.printf("   Diamond = Rs. %.2f", this.price[i*15]);
				
			System.out.println("\n");
		}
	}
	

//Method to book seats (to change '@' (seat available) to '-' (seat not available))	
	double bookSeat(int... arr){
		double total=0;
		try{
			for(int seatNo:arr){
				if (seatNo>0 && seatNo<=105){
					if(this.seats[(seatNo-1)/15][(seatNo-1)%15]=='@'){
						this.seats[(seatNo-1)/15][(seatNo-1)%15]='-';
						total+=this.price[seatNo-1];
					}else
						System.out.println("***Seat number '"+seatNo+"' is already booked by "+getBookingName(seatNo)+"***");
				}else{
					throw new SeatNoNotFoundException ("\nYou selected a seat number that does not exist in the theater...\n!!!!!Seats entered after the wrong seat number are not booked!!!!!\n");
				}
			}
		}catch(SeatNoNotFoundException e){
			System.out.println(e);
		}finally{return total;}
	}
			

//To set name of the booking person to the corresponding seat number
	void setBookingName(String name, int... arr){
		for(int seatNo:arr){
			if (seatNo>0 && seatNo<=105){
				if(this.seats[(seatNo-1)/15][(seatNo-1)%15]=='@')
					this.bookingName[(seatNo-1)]=name;
			}
		}
	}
	
		
//To return the price of the seat number selected
	double getPrice(int seatNo){
		return (this.price[seatNo-1]);
	}
	
	
//To retrive the name of the person who booked the particular seat
//and to return 'NO ONE' if the seat is not booked
	String getBookingName(int seatNo){
		if(seats[(seatNo-1)/15][(seatNo-1)%15]=='-')
			return this.bookingName[(seatNo-1)];
		else 
			return "NO ONE";
	}
	
	
//Function declaration in parent function, to be overriden by child class Movie
	void bookingDetails(int seatNo){}

	
	
//main function for checking Theater Class
	/*public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Theater t=new Theater();
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
		t.setBookingName(name, seatno);
		t.bookSeat(seatno);
		t.displaySeats();
		//to display who booked the ticket
		System.out.print("Enter seat number you want to check: ");
		System.out.print("Booked by "+t.getBookingName(sc.nextInt()));
	}
	*/
}