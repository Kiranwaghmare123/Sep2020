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

	static void sum(float i, float j,float n)
	{
		float k=i+j+n;
		System.out.println(k);
	}
}
class MathTest2
{
	
	public static void main(String args[])
	{
		Math1.sum(120,150);
		Math1.sum(120,150,170);
		Math1.sum(120.5f,150.5f,170.5f);


		
	}
}