import java.util.*;
public class ArrayList2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<ArrayList<String>> Manu = new ArrayList();
	
	ArrayList<String> food=new ArrayList();
	food.add("Pasta");
	food.add("Burger"); 
	food.add("Hotdog");
	
	ArrayList<String> drinks = new ArrayList<>();
	drinks.add("Tea");
	drinks.add("Coffe");
	 
	for(int i=0; i<food.size(); i++) {
		System.out.println(food.get(i));
	}	 
		System.out.println(food.get(0));
	

		Manu.add(food);
		Manu.add(drinks);
		
		System.out.println(Manu.get(0));
		System.out.println(Manu.get(1).get(0));
		
	//FOR EACH LOOP	
		for(String i: food) {
			System.out.println(i);
		}
		
		
	}

}
