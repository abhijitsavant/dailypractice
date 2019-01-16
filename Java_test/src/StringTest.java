
public class StringTest {

	public static void main(String[] args) {
		String str = ";This;is;my;";
		String arr[] = str.split(";");
		System.out.println(arr.length +" "+arr[3]);
	}

}
