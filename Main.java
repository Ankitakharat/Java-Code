import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		StudentLL d=new StudentLL();
		Scanner sc=new Scanner(System.in);
		while(true)
		{

			show();	
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();

			switch(ch)
			{

			case 1:

				Student s=getData(sc);
				d.push(s);
				System.out.println(s);
				break;

			case 2:

				d.pop();
				System.out.println(d);
				break;


			case 3:

				System.out.println(d);
				break;

			case 4:

				if(d.isempty())
					System.out.println("LL is empty");	


			default:
				break;



			}


		}

	}


	public static Student getData(Scanner sc)
	{
		System.out.println("Enter the name:");
		String name=sc.next();

		System.out.println("Enter the roll_no:");
		int roll_no=sc.nextInt();

		System.out.println("Is experienced:");
		boolean exp=sc.nextBoolean();

		Student s=new Student(name,roll_no,exp);
		return s;
	}

	public static void show()
	{
		System.out.println("1.Push Student:");
		System.out.println("2.Pop Student:");
		System.out.println("3.Print Stack:");
		System.out.println("4.Is empty:");
		System.out.println("5.Exit");
	}

}