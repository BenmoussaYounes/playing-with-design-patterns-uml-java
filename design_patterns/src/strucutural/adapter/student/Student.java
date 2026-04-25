package strcutural.adapter.student;

public class Student {
	private String fullName;
	private int age;
	
    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

	
	public String getFullName() {
		return fullName;
	}
	
	public int getAge() {
		return age;
	}
}
