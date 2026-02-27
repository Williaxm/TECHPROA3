import java.util.ArrayList;
class Student {

// error/warning found on ln 40, deleted the local variable temp allocated on Student as it wil trigger a style warning


private int id;
private String name; 
Student(int id, String name) {
	this.id = id;
	this.name = name;
	System.out.println("Student Created: " + name);
}
void displayInfo() {
	System.out.println("ID: " + id + ", Name: " + name);
}
@Override
protected void finalize() throws Throwable {
	System.out.println("Garbage Collector destroying Student Object: " + name);
}
}
public class Seatwork8Q3 {
	public static void main(String[] args) {
	System.out.println("=== Student Record System Started ===");
	ArrayList<Student> students = new ArrayList<>();	
	students.add (new Student(1, "Juan"));
	students.add (new Student(2, "Maria"));
	students.add (new Student(3, "Pedro"));
	System.out.println("\n--- Displaying Student Records ---");
	for (Student s : students) {
		s.displayInfo();
	}
	System.out.println("\n--- Removing Student Records ---");
	students.remove(0);
	students.remove(0);
	System.out.println("\nRequesting Garbage Collection...");
	System.gc();
	System.out.println("\n--- Creating Temporary Student Objects ---");
	for (int i = 4; i <= 20; i++) {
		new Student(i, "TempStudent" + i);
	}
	System.out.println("\n--- Clearing Remaining References");
	students = null;
	System.out.println("\nRequesting Garbage Collection Again...");
	System.gc();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.print(e);
	}
	System.out.println("\n=== Program Ended ===");
}
}
