/*Create a class called Person with a member variable name. 
Save it in a file called Person.java 
Create a class called Employee who will inherit the Person class.
The other data members of the employee class are annual salary (double),
the year the employee started to work, 
and the national insurance number which is a String.
Save this in a file called Employee.java 
Your class should have a reasonable number of constructors and accessor methods. 
Write another class called TestEmployee, containing a main method
to fully test your class definition.*/

package pac1;
import java.util.*;
protected class Employee extends Person
{    
	double anSal;
	int year;
	Employee(){
		System.out.println("Every Employee has a year of joining and annual salary");
	}
	Employee(double sal, int year){
		System.out.println("Every Employee has a year of joining and annual salary");
		this.anSal=sal;
		this.year=year;
	}
	void setAnSal(double sal){
		this.anSal=sal;
	}
	void setYear(int year){
		this.year=year;
	}
	double getAnSal(){
		return this.anSal;
	}
	int getYear(){
		return this.year;
	}
}

class TestEmployee{
	public static void main(String args[]){
		Person p1=new Person();
		p1.setName("Devi DInesh");
		System.out.println(p1.getName());
		System.out.println("***************************************");
		Employee e1=new Employee(220000, 1998);
		e1.setName("Bhavya DInesh");
		System.out.println(e1.getName());
		System.out.println(e1.getAnSal());
		System.out.println(e1.getYear());
		System.out.println("***************************************");
		Person p2=new Employee(300000,1995);
		p2.setName("Vanaja Dinesh");
		System.out.println(p2.getName());
		//p2.getAnSal();
		//p2.getYear();
		System.out.println("***************************************");
	}
}