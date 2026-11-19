package Variable;

public class DifferentClass {

	public static void main(String[] args) {
		
		
		//Different class
		
		System.out.println("Classname as reference");
		System.out.println();
		
		System.out.println("Id:"+StaticVariable.id);	//Class name as reference
		System.out.println("Name"+StaticVariable.name);
		System.out.println("Age:"+StaticVariable.age);
		
		System.out.println("------------------------------");
		
		System.out.println("Objectname as reference");
		System.out.println();
		
		StaticVariable d=new StaticVariable();
		
		System.out.println("Id:"+d.id);	//Object name as reference
		System.out.println("Name:"+d.name);
		System.out.println("Age:"+d.age);
		
		

	}

}
