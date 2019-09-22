package exam01;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
}

