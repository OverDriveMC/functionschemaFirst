package anonymous_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class PersonFirstNameSort {
	public static void main(String[] args) {
		List<Person>people=new ArrayList<Person>();
		Collections.sort(people,new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstname().compareTo(o2.getFirstname());
			}
		});
	}
}

class Person{
	private String firstname;
	private String secondname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	
}