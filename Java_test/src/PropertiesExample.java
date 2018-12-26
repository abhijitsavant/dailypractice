import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties grades = new Properties();
		grades.setProperty("Biology", "19");
		//grades.setProperty(null, "19");
		System.out.println(grades);
	}

}
