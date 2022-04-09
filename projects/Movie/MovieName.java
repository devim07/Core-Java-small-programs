import java. util.Scanner;


class MovieSelect
{
	static Scanner sc= new Scanner(System.in); // we declared all var. static because methods are static and we can't used non static in static method
	static String name;
	static String[] movielist = {"Harry Potter", "Batman", "GodFather"};
	static int num;
    
	
	public static void getName()
	{
		System.out.println("Customer put his name here -->");
		name= sc.nextLine();
		System.out.println();
		System.out.println(name);
		movieName();
	}
	
	public static void movieName()
	{
		System.out.println();
		System.out.println("Movie name is--->");
		System.out.println();
		for(int i=0; i<movielist.length; i++)
		{
			System.out.println(movielist[i]);
		}
		System.out.println();
		System.out.println("Please Select The Movie");
		 num=sc.nextInt(); //if we don't declare num as local then we can't used it in other method
		System.out.println("Select the movie number       " +movielist[num-1]);
		seatNo();
	}
	
	/*public static void seatNo()
	{
		System.out.println();
		System.out.println("how many seats you want==>");
		System.out.println();
		int seatsNo=sc.nextInt();
		System.out.println("you select seats  " +seatsNo );
		System.out.print("for movie ===> " +movielist[num-1]);
	}*/
	
	public static void main(String...args)
	{
		getName();
	}

}