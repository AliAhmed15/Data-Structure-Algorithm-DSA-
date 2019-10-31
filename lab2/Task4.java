class Task4{
	public float Avg(int Arr[])
	{
		int a=0;
		float x=0.0f;
		while(a<Arr.length)
		{
			x+=Arr[a];
			a++;
		}
		x/=Arr.length;
		return x;
	}
	public static void main(String []abcd)
	{
		int Arr[]={1,5,8,9,6,4};
		Task4 t=new Task4();
		System.out.println("Avg: vlaues of Array is :"+t.Avg(Arr));
	}
}