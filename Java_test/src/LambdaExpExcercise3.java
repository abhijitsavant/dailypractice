import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaExpExcercise3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int key = 0;
		Consumer<Object> consumer =(p)->System.out.println(p);
		BiFunction<Integer,Integer,Integer> biFunction2 = (p1,p2)->p1/p2 ;
		performOperation(arr,key,wrapper(biFunction2),consumer);
		//wrapper(biFunction2);
	}

	private static BiFunction<Integer, Integer, Integer> wrapper(BiFunction<Integer, Integer, Integer> biFunction2) {
		return (p1,p2)->{
			Integer p3 = null;
			try {
				p3 = biFunction2.apply(p1, p2);
			} catch (ArithmeticException e) {
				System.out.println("Exception has been caught ");
			}
			return p3;
		};
	}

	private static void performOperation(int[] arr, int key, BiFunction<Integer, Integer, Integer> biFunction, Consumer<Object> consumer) {
		for (int i : arr) {
			consumer.accept(biFunction.apply(i, key));
		}
	}

}
