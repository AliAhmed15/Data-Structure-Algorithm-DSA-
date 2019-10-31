class Task5{
	public int SecLarg(int Arr[])
	{
		int m=0,n=0;
		for(int i=1; i<Arr.length; i++)
		{
			if(Arr[i]>Arr[m])
			{
				n=m;
				m=i;
			}
		}
		if(m==0)
			n++;
		return n;
	}
	public static void main(String []abcd)
	{
		Task5 t =new Task5();
		int Arr[]={5,4,7,8,1,2,9,0,3};
		System.out.print("Second Largest is at: "+t.SecLarg(Arr));
	}
}
   