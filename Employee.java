import java.util.*;
public class Employee
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the gender in form of M or F");
			char m=sc.next().charAt(0);
			if(m=='M')
			{
				System.out.println("Enter the age");
				int a=sc.nextInt();
				if(a>20 && a<40)
					System.out.println("You will work anywhere");
				else if(a>40 && a<60)
					System.out.println("You can work in urban areas");
			}
			else if(m=='F')
			System.out.println("You will only work in urban areas");
}
}
			
				
			