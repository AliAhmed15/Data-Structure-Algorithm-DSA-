class Employee{
	int salary;
	int hour;
	public void getInfo(int salary, int hour){
		this.salary=salary;
		this.hour=hour;
		}
	public void AddSal(){
		if(salary<500)
			salary+=10;
	}
	public void AddWork(){
		if(hour>6)
			salary+=5;
	}
 public static void main(String []abd){
	Employee e=new Employee();
	e.getInfo(150, 8);
	e.AddSal();
	e.AddWork();
	System.out.print("Salary:"+ e.salary+"\nNo: of Hours:"+e.hour);
	}
}