//CONSTRUCTOR
public class Main {

	public static void main(String[] args) {
		
		///constructor = is a special  method when an object is instantiated ( created ) 
		
		
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
		//Access on of the attributes
		System.out.println(human1.name);
		System.out.println(human2.age);
		
		human1.drinking();
		human2.eat();

	}

}
