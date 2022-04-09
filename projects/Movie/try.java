
import java.util.*;

/*

//User defines unchecked exception declaration for ArrayIndexOutOfBoundsException
class SeatNoNotFound extends ArithmeticException{
	SeatNoNotFound (String message){
		super(message);
	}
}
*/



class Try{
	/*int bookSeat(int... arr){
		for (int seatNo:arr){
			if(this.seats[(seatNo-1)/15][(seatNo-1)%15]=='@'){
				//possibility of ArrayIndexOutOfBoundsException if seatNo provided is greater than 200
				try{
					this.seats[(seatNo-1)/15][(seatNo-1)%15]='-';
				}catch (ArrayIndexOutOfBoundsException e){
					//System.out.println(e.getMessage());
					//throw new SeatNoNotFound("\nYou selected a seat number that does not exist in theater...\n!!!Please re-run the program!!!");
					System.out.println("\nYou selected a seat number that does not exist in theater...\n!!!Please re-run the program!!!");
					return 0;
				}finally{
					return 0;
				}
			}else{
				System.out.println("Seat number '"+seatNo+"' is already booked by "+getBookingName(seatNo));
			}
		}
		return 0;
	}
	
	//To provide customized message for ArithmeticException
	static void err() throws SeatNoNotFound{
		throw new SeatNoNotFound("\nYou selected a seat number that does not exist in theater...\n!!!Please re-run the program!!!");
	}*/
	
	
	void m2(){
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();	
		int i[]=new int[5];
		try{
			i[x]=10;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Try");		
						
		}
	}
	
	public static void main(String args[]){
		Try t=new Try();
		t.m2();
		System.out.println("Try in main");	
	}	
}
