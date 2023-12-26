import java.util.Scanner;
class MainChar
	{
	public static void main(String arg[])
		{
		Scanner sc=new Scanner(System.in);
		system.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z')
			system.out.println("Alphabet");
		else if(ch>='0'&&ch<='9')
			system.out.println("digit");
		else
			system.out.println("Special characters");
		}
}