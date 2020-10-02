class Math1
{
	static void sum(int i, int j)
	{
		int k=i+j;
		System.out.println(k);
	}

	static void sum(int i, int j,int n)
	{
		int k=i+j+n;
		System.out.println(k);
	}
}
class MathTest1
{
	
	public static void main(String args[])
	{
		Math1.sum(120,150);
		Math1.sum(120,150,170);


		
	}
}