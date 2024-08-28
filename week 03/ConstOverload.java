class Rectangle{
	double length;
	double breadth;
	Rectangle(){
		length = 6.0;
		breadth = 2.5;
	}
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void displaySides(){
		System.out.println("length: "+ length + " breadth: "+ breadth);
	}
}
public class ConstOverload{
	public static void main(String[] args){
		Rectangle rect1 = new Rectangle();
		rect1.displaySides();
		Rectangle rect2 = new Rectangle(15,36);
		rect2.displaySides();
		Rectangle rect3 = new Rectangle(13.5,20);
		rect3.displaySides();
		
	}

}

