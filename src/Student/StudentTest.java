package Student;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);


		Student student1=new Student("Anthony", "Francis","Smith","no classification", "no major", 242547);
		Student student2=new Student("Alexus", "Christian","Stone","no classification", "no major", 244757);

		System.out.println(student1.firstname);
		System.out.println(student1.middleinitial);
		System.out.println(student1.lastname);

		System.out.println(student2.firstname);
		System.out.println(student2.middleinitial);
		System.out.println(student2.lastname);


		System.out.println("What is your student ID?");
		int id=scanner.nextInt();

		if(id==student1.StudentID){

			System.out.println("Hi " + student1.firstname + " how are you? Press 1 to view your name. Press 2 to set your Major. Press 3 to set classification. Press 4 to exit." );
			int num=scanner.nextInt();
			{
				if(num==1){

					System.out.println(student1.firstname);
					System.out.println(student1.middleinitial);
					System.out.println(student1.lastname);
				}

				if(num==2){

					System.out.println("What do you want to set your major to?");
					scanner.nextLine();
					
					student1.major=scanner.nextLine();
					
					System.out.println("The student's major is now " + student1.major);
				}
				if(num==3){

					System.out.println("What do you want to set your clasification to?");
					scanner.nextLine();
					
					student1.classification=scanner.nextLine();

					System.out.println("The student's classifcation is now " + student1.classification);
				}

				if(num==4){

					System.out.println("This program has been terminated");
				}
			}
		}
		if(id==student2.StudentID){

			System.out.println("Hi " + student2.firstname + " how are you? Press 1 to view your name. Press 2 to set your Major. Press 3 to set classification. Press 4 to exit." );
			int num=scanner.nextInt();
			{
				if(num==1){

					System.out.println(student2.firstname);
					System.out.println(student2.middleinitial);
					System.out.println(student2.lastname);
				}

				if(num==2){

					System.out.println("What do you want to set your major to?");
					scanner.nextLine();
					
					student1.major=scanner.nextLine();

					System.out.println("The student's major is now " + student1.major);
				}
				if(num==3){

					System.out.println("What do you want to set your clasification to?");
					scanner.nextLine();
					
					student1.classification=scanner.nextLine();

					System.out.println("The student's classifcation is now " + student1.classification);
				}

				if(num==4){

					System.out.println("This program has been terminated");
				}
			}

		}
	}
}

