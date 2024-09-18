import java.util.*;

class animal {
	String name;
	 animal (String name) {
	 	this.name = name;
	 }
	 void eat(){
	 	System.out.println(name + " is eating");
	 }
}
 
class dog extends animal {
	dog(String name){
		super(name);
	}
	
	void speak() {
		System.out.println(name + " is barking");
	}
}

public class Sinherit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dog name");
		String name = sc.next();
		dog mydog = new dog(name);
		System.out.println("Name: " + mydog.name);
		mydog.eat();
		mydog.speak();
		sc.close();
	}
}
