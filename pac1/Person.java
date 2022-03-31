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
class Person
{    
	String name;
	Person(){
		System.out.println("Every Person has a name!");	
	}
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return this.name;
	}
}

