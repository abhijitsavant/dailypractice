import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class KeyClass implements Comparable<KeyClass>{
	private String name;
	private String value;
	
	
	public KeyClass(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Key [name=" + name + ", value=" + value + "]";
	}


	@Override
	public int compareTo(KeyClass o) {
		return this.getValue().compareTo(o.getValue());
	}
}
public class TreeSetExample {

	public static void main(String[] args) {
		KeyClass k1 = new KeyClass("Abhi","Savant");
		KeyClass k2 = new KeyClass("Ranjit","Savant1");
		KeyClass k3 = new KeyClass("Ganesh","Savant");
		
		Set<KeyClass> set = new TreeSet<>();
		Set<KeyClass> set2 = Collections.unmodifiableSet(set);
		set2.add(new KeyClass("ABC", "Unmodified"));
		System.out.println(set2);
		set.add(k1);
		set.add(k2);
		set.add(k3);
		System.out.println(set);
	}

}
