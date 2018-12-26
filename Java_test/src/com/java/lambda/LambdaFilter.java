package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilter {

	public static void main(String[] args) {
		String []arr = {"A","B","C","D"};
		List<String> strings = Arrays.asList("Rajan","Ajit","Abhi","Mahesh","Dev");
		strings.stream().filter(p->p.startsWith("A")).forEachOrdered(p->System.out.println(p));
		strings.stream()
		.sorted().forEach(System.out::println);
		
		strings.stream()
		.map(String::toUpperCase).forEach(System.out::println);
		
		List<String> strings2 = Arrays.stream(arr).filter(p->p.length()==1).collect(Collectors.toList());
		System.out.println(strings2);
	}

}
