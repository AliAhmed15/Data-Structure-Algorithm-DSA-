import java.util.*;
class Area2{
	double length;
	double breadth;
	Area2(double length , double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double returnArea(){
		return length*breadth;
	}
	public static void main(String []abcd){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		double length1=s.nextDouble();
		System.out.println("Input Breadth");
		double breadth1=s.nextDouble();
		
		Area2 a=new Area2(length1,breadth1);
		
		
		System.out.println(a.returnArea());
	}
}