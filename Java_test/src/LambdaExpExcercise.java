import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class Person{
	private int age;
	private String fname;
	private String lname;
	
	Person(int age, String fname, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
	}
}

public class LambdaExpExcercise {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(2,"FF","GG"),
				new Person(3,"WW","QQ"),
				new Person(1,"Abhi","Savant"),
				new Person(4,"CC","AA")
				
				);
		Comparator<Person> comparator = (p1,p2)->p1.getFname().compareTo(p2.getFname());
		Collections.sort(persons,comparator);
		
		persons.forEach((Person p) ->System.out.println(p));
		Consumer<Person> consumer = (p)->System.out.println("With Consumer Interface : "+p);
		performConditionally(persons,consumer);
 	}

	public static void performConditionally(List<Person> persons,Consumer<Person> consumer) {
		for(Person person:persons) {
			consumer.accept(person);
		}
	}
}
