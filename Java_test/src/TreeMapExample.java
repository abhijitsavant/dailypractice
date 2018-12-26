import java.util.TreeMap;
class Key implements Comparable<Key>{
	private String name;
	private String value;
	
	
	public Key(String name, String value) {
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
	public int compareTo(Key o) {
		return this.getName().compareTo(o.getName());
	}
}
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String , Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		System.out.println(map.put("C", 3));
		System.out.println(map.put("C", 3));
		System.out.println(map.put("D", 3));
		
		TreeMap<Key , Integer> map1 = new TreeMap<>();
		Key k1 = new Key("Abhi","Savant");
		Key k2 = new Key("Ranjit","Savant");
		Key k3 = new Key("Ganesh","Savant");
		map1.put(k1, 1);
		map1.put(k2, 2);
		map1.put(k3, 3);
		System.out.println(map1);
	}

}
