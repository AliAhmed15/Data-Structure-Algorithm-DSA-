class Employee{
	int salary;
	int hour;
	public void getInfo(int salary, int hour){ //getinfo method with salary and no. of hours variable in parameters
		this.salary=salary;
		this.hour=hour;
		}
	public void AddSal(){ //AddSal method with void method and if condition
		if(salary<500)
			salary+=10;
	}
	public void AddWork(){ //AddWork method eith void method and condition statement
		if(hour>6)
			salary+=5;
	}
 public static void main(String []abd){
	Employee e=new Employee(); //Employee object
	e.getInfo(150, 8); 
	e.AddSal();
	e.AddWork();
	System.out.print("Salary:"+ e.salary+"\nNo: of Hours:"+e.hour);
	}
}
