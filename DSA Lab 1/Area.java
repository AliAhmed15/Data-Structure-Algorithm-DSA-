import java.util.*;
class Area{
	double length;
	double breadth;
	
	public void setDim(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getArea(){
		
		return length*breadth;

	}
	public static void main(String []abcd)
	{
		double length1,breadth1;
		Area a=new Area();
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		length1=s.nextDouble();
		System.out.println("Input Breadth");
		breadth1=s.nextDouble();
		a.setDim(length1,breadth1);
		System.out.println(a.getArea());
	
	}
}