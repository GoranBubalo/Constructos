
public class Human {
	// Constructor
	String name;
	int age;
	double weight;

	Human(String name, int age, double weight) {
		// this = > is used to eliminate the confusion between class attributes and
		// parameters
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void eat() {
		// this.name => access the variable name that is declared at the beginning of
		// the class
		// IMPORTAN to differentiate the variable name's use this.
		System.out.println(this.name + " is eating ");
	}

	void drinking() {
		System.out.println(this.name + " is drinking ");
	}

}
