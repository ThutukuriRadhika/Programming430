import java.util.Scanner;
class MainDate
{
	public static void main(String[] args) 
	{
		System.out.println("enter the date(dd mm yyyy)");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||mm<1||yy=1||mm>12||dd>31)
			system.out.println("invalid");
		else if((mm==4||mm==6||mm==9||mm==11)&& dd>30)
			system.out.println("invalid");
		else if(mm==2&&dd>29)
			system.out.println("invalid");
		else if(yy%4==0&&yy%100!=0||yy%400==0)==false&&m==2&&dd>28)
			system.out.println("invalid");
		else
			system.out.println("valid");

	}
}