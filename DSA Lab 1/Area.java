import java.util.*; //importing scanner class
class Area{ 
	double length;
	double breadth;
	
	public void setDim(double length,double breadth){ //setDim method created with no return type and two parameters for taking input
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getArea(){ //getArea method created eith Double return type
		
		return length*breadth;

	}
	public static void main(String []abcd) 
	{
		double length1,breadth1;
		Area a=new Area(); //Object of area class
		Scanner s=new Scanner(System.in);
		System.out.println("Input Length");
		length1=s.nextDouble(); // taking length input
		System.out.println("Input Breadth");
		breadth1=s.nextDouble(); // taking breadth input
		a.setDim(length1,breadth1); //calling steDim Method using class object 
		System.out.println(a.getArea());
	
	}
}
