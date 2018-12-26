import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaExpExcercise2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int key = 2;
	/*	Consumer<Object> consumer =(p)->System.out.println(p);
		BiFunction<Integer,Integer,Integer> biFunction1 = (p1,p2)->p1+p2 ;
		performOperation(arr,key,biFunction1,consumer);
		BiFunction<Integer,Integer,Integer> biFunction2 = (p1,p2)->p1/p2 ;
		performOperation(arr,key,biFunction2,consumer);*/
		BiFunction<Integer,Integer,Integer> biFunction3 = (p1,p2)->p1*p2 ;
		performOperation(arr,key,biFunction3,System.out::println);
	}

	private static void performOperation(int[] arr, int key, BiFunction<Integer, Integer, Integer> biFunction, Consumer<Object> consumer) {
		for (int i : arr) {
			consumer.accept(biFunction.apply(i, key));
		}
	}

}
