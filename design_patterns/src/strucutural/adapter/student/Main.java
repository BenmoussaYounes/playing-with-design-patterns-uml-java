package strcutural.adapter.student;

public class Main {

	public static void main(String[] args) {
        Student student = new Student("Younes BENMOUSSA", 35);
        Person person = new StudentAdapter(student);

        System.out.println(person.getFirstName()); 
        System.out.println(person.getLastName());  
        System.out.println(person.getAge());     
	}

}
