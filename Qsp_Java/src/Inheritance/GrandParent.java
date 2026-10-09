package Inheritance;

class top{
	
	String Bike;
	String Cycle;
	
	void house() {
		System.out.println("House");
	}
	
	
	void display(String Bike,String Cycle) {
		System.out.println("Bike:"+Bike);
		System.out.println("Cycle:"+Cycle);
	}
	
}




class middle extends top{
	
}


class lower extends middle{
	
}


public class GrandParent {

	public static void main(String[] args) {
		
		lower l=new lower();
		l.house();
		
		l.display("Tvs", "Normal Cycle");
		

	}

}
