
class CalculateArea{
	int area(int length,int breadth){
		return length*breadth;
	}
	double area(double length,double breadth){
		return length*breadth;
	}
	int area(int side){
		return side*side;
	}
	double area(double side){
		return side*side;
	}
}

public class overload{
	public static void main(String[] args){
		CalculateArea square = new CalculateArea();
		CalculateArea rectangle = new CalculateArea();
		System.out.println("Area of Square: " + square.area(3));
		System.out.println("Area of Rectangle: " + rectangle.area(21,20));
		System.out.println("Area of Square: " + square.area(2.5));
		System.out.println("Area of Rectangle: " + rectangle.area(4.55, 100));
	}
}

