class Person {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else { 
		    this.age = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

class Student extends Person {
	
	private String course;
	
	public void setCourse(String setCourse) {
		this.course = setCourse;
	}
	public String getCourse() {
		return course;
	}
	
	public void displayInfo() {
		System.out.println("——————————————Student Info——————————————");
		System.out.println("Name      : " + getName());
		System.out.println("Age       : " + getAge());
		System.out.println("Course    : " + getCourse());
		System.out.println("————————————————————————————————————————");

	}
}

 public class Part2 {
 	public static void main(String[] args) {
 		
 		Student s = new Student();
 		
 		s.setName("Toby Claveria");
 		s.setAge(16);
 		
 		s.setCourse("ICT");
 		
 		s.displayInfo();
 	}
 }
