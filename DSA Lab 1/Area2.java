import java.util.*;
class Area2{ // class created with two variables 
	double length;
	double breadth;
	Area2(double length , double breadth){ //created a constructer
		this.length=length;
		this.breadth=breadth;
	}
	public double returnArea(){ // reaturnArea method created eith double return class
		return length*breadth;
	}
	public static void main(String []abcd){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		double length1=s.nextDouble(); //taking length input
		System.out.println("Input Breadth");
		double breadth1=s.nextDouble(); //taking bradth input
		
		Area2 a=new Area2(length1,breadth1); //object of constructor created
		
		
		System.out.println(a.returnArea());
	}
}
