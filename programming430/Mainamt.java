import java.util.Scanner;
class Mainamt 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int amt=sc.nextInt();
		system.out.println("2000rs->"+amt/2000);
		amt=amt%2000;
		system.out.println("500rs->"+amt/500);
		amt=amt%500;
		system.out.println("200rs->"+amt/200);
		amt=amt%200;
		system.out.println("100rs->"+amt/100);
		amt=amt%100;
		system.out.println("50rs->"+amt/50);
		amt=amt%50;
		system.out.println("20rs->"+amt/20);
		amt=amt%20;
		system.out.println("10rs->"+amt/10);
		amt=amt%10;
		system.out.println("5rs->"+amt/5);
		amt=amt%5;
		system.out.println("2rs->"+amt/2);
		amt=amt%2;
		system.out.println("1rs->"+amt);
		


	}
}
