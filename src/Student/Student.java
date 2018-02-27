package Student;

public class Student {

	String firstname, middleinitial, lastname, classification, major;
	int StudentID;

	public Student(String fn, String mi, String ln, String classif, String m, int id){

		firstname=fn;
		middleinitial=mi;
		lastname=ln;
		classification=classif;
		major=m;
		StudentID=id;
	}

	public String printFullName()

	{

		return firstname+middleinitial+lastname;
	}

	public void setMajor(String newmajor)

	{
		major=newmajor;
	}

	public void setclassification(String newclass)

	{
		classification=newclass;
	}
}

