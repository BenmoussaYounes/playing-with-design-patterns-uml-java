package strcutural.adapter.student;

public class StudentAdapter implements Person{
	final private Student student;
	
	
    public StudentAdapter(Student student) { 
        this.student = student;
    }
	
	@Override
	public String getFirstName() {
		String[] names = student.getFullName().split(" ");
		return names[0];
	}

	@Override
	public String getLastName() {
		String[] names = student.getFullName().split(" ");
		return names.length > 1 ? names[1] : "";
	}

	@Override
	public int getAge() {
		return student.getAge();
	}
	

}
