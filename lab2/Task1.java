class Task1{
	public static void main(String []abcd){
		int Arr[]=new int[100];
		for(int i=0; i<=99; i++){
			if(i%2==0)
				Arr[i]=(i+2*i);
			else if(i<=50 && i%2!=0)
				Arr[i]=(i+4/3);
			else if(i>50 && i%2==0)
				Arr[i]=(i*i*i);
			else
				Arr[i]=i;
		}
		for(int x=0; x<=99; x++)
			System.out.println(Arr[x]);
	}
}
				