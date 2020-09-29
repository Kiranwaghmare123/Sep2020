class F11
{
public static void main(String args[])
{
	//Rows
	
	for(int i=1;i<=4;i++)
	{
		//spaces
		for(int j=4;j>=i;j--)
		{
		System.out.print(" ");
		}
		//print *
		for(int k=1;k<=i;k++)
		{
		System.out.print("*");
		}
		//P2
		for(int m=2;m<=i;m++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
}	
}

