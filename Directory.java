package exam01;
//ADD IMPORTS NEEDED HERE
import java.util.List;
import java.util.ArrayList;

public class Directory {
	
	List<Person> people = new ArrayList<>();
	
    //-----------------------------------------------------------------------
    //this method is provided, do not alter it!
    //returns true if str1 isLater than str2 alphabetically
    private boolean isLater(String str1, String str2) {
        return str1.compareTo(str2) > 0;
    }
    //----------------------------------------------------------------------
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public Person latestName() {
		if (people.size() == 0) {
			return null;
		}
		
		String latestFirst = people.get(0).getFirstName();
		String latestLast = people.get(0).getLastName();
		
		// Check first names
		for (int i=1; i<people.size(); i++) {
			if (isLater(people.get(i).getFirstName(), latestFirst)) {
				latestFirst = people.get(i).getFirstName();
			}
		}
		
		// Check last names
		for (int i=1; i<people.size(); i++) {
			if (isLater(people.get(i).getLastName(), latestLast)) {
				latestLast = people.get(i).getLastName();
			}
		}
	
	
		Person latestPerson = new Person(latestFirst, latestLast);
		
		return latestPerson;
	}
	
	public void makeAFamily(String last) {
		
		for (int i=0; i<people.size(); i++) {
			Person newPerson = new Person(people.get(i).getFirstName(), last);
			people.set(i, newPerson);
		}
			
	}
	
	public String toString() {
		return people.toString();
	}
}