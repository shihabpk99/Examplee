import java.util.*;
public class MethodsF {
	
static void display(String name, int age) {
	
	System.out.println("Hello!! "+name);
	System.out.println("Your age is "+age);

	
}

static int display(int x, int y) {	
	return x+y;
	
}

static double display(double x, double y) {
	return x+y;
}
	
	
	
	
	
  public static void main(String[] args) {
	  
	 String name="Bro";
	 int age= 21;
	 
	 int x=2;
	 int y=5;
	 
	 double a=4.5;
	 double b=11.5;
	 
	 display(name,age);
	  
	int rslt1= display(x,y);
	System.out.println(rslt1);
	
	double rslt2= display(a,b);
	System.out.println(rslt2);
	  
	   
	  
  }
}
