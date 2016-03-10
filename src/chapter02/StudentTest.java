package chapter02;

public class StudentTest {
public static void main(String[] args){
	Person p = new Student(10);
	//upcasting dec->asc
	Student s = new Student();
	Person p2 = s;
	
	//Downcasting asc->dec
	Person p3 = new Student();
	//p3.showInfo(); p3 is Person type -> no permission
	
	Student s2 =(Student) p3;
	s2.showInfo();
	
	//same way:
	((Student)p3).showInfo();
}

}
