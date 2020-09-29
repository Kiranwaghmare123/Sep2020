class cmd2
{
public static void main(String args[])
{
	String s1 =args[0];//10
	String s2 = args[1];//20

	//Wrapper Classes-->Integer,Float,Double...
	int i = Integer.parseInt(s1);
	int j = Integer.parseInt(s2);

	int k = i+j; 

	System.out.println(s1);
	System.out.println(s2);
	System.out.println(k);
}
}

