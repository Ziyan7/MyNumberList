package javastream;

import java.util.*;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;


public class NumberPlayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myNumberList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			myNumberList.add(i);
		}
		// Method 1 : traversing using itirator or for loop
//		Iterator itr = myNumberList.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		for (int a : myNumbecerList) {
//			System.out.println(a);
//		}

		// Method 2: using consumer interface
//		class MyConsumer implements Consumer<Integer>{
//			public void accept(Integer t) {
//				System.out.println("method 2: consumer imp value : "+t);
//			}
//		}
//		Consumer action = new MyConsumer();
//		myNumberList.forEach(action);
//		
		// METHOD 3 : using via implementing Consumer Interface (accept)
//		class MyConsumer implements Consumer {
//			@Override
//			public void accept(Object t) {
//				System.out.println("using via implementing Consumer Interface " + t);
//			}
//		}
//		MyConsumer obj = new MyConsumer();
//		myNumberList.forEach(obj);

//		myNumberList.forEach(System.out::println);

// METHOD 4 : using explicit lamda function
//		Consumer<Integer> mytest = n -> {
//			System.out.println("method4 " + n);
//		};
//		myNumberList.forEach(mytest);

		// METHOD 5 : using implicit lamda function
//		myNumberList.forEach(n -> {
//			System.out.println("method5 " + n);
//		});
		
		
		
		
// METHOD 6: using lambda to print double value
//		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
//		myNumberList.forEach(n -> {
//			System.out.println("double list:" +toDoubleFunction.apply(n));
//		});
//		
		
//Method 7 to check even or odd
//		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
//		myNumberList.forEach(n -> {
//			System.out.println(n + " is " + isEvenFunction.test(n));
//		});
//		
		
		
		
//		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
//		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
//		myNumberList.forEach(n -> {
//			doubleList.add(toDoubleFunction.apply(n));
//			doubleList.forEach(n1 -> {
//				System.out.println("forEach value of : " + n1 + "check even " + isEvenFunction.test(n1.intValue()));
//			});

		//});
		
		
//Java Streams
		
		//Method 8 to print double value
//		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
//		myNumberList.forEach(n -> {
//			System.out.println("double list:" +toDoubleFunction.apply(n));
//		});
//		myNumberList.forEach(n1 -> {
//			System.out.println("double list:" +n1);
//		});
//		
//		Function<Integer, Double> toDoubleFunctions = Integer::doubleValue;
//		List<Double> doubleArray = myNumberList.stream().map(toDoubleFunctions).collect(Collectors.toList());
//		
		//method 9 to check even numbers
		Predicate<Integer> isEvenFunction = n-> n% 2==0;
//		myNumberList.forEach(n-> {
//			System.out.println("check"+ isEvenFunction.test(n));
//		});
		
		//method 10 to use java stream
//		List<Integer> check = myNumberList.stream().filter(isEvenFunction).collect(Collectors.toList());	
//		check.forEach(i -> {
//			System.out.println(i);});
		
		// find first even number
//		Integer first = myNumberList.stream().filter(isEvenFunction).findFirst().orElse(null);	
//		System.out.println(first);
		
		
		//find min
//		Integer min = myNumberList.stream().filter(isEvenFunction).min((n1,n2) -> n1 - n2).orElse(null);	
//		System.out.println(min);
		
		//find max
//		Integer max = myNumberList.stream().filter(isEvenFunction).max(Comparator.comparing(Integer :: intValue)).orElse(null);	
//		System.out.println(max);
		
		//sum and average
//		Integer sum = myNumberList.stream().reduce(0, Integer::sum);	
//		System.out.println(sum);
//		long count = myNumberList.stream().count();
//		System.out.println("average = "+ sum/count);
		
//		boolean allEven= myNumberList.stream().allMatch(isEvenFunction);
//		boolean anyEven= myNumberList.stream().anyMatch(isEvenFunction);
//		System.out.println(allEven);
//		System.out.println(anyEven);
		
		List<Integer> sortarray = myNumberList.stream().sorted((n1,n2)-> n2.compareTo(n1)).collect(Collectors.toList());
		sortarray.forEach(n -> {
			System.out.println(n);
		});
		
		
//		myNumberList.stream().map(toDoubleFunction).forEach(System.out :: println);
//		List<Double> doubleArray = myNumberList.stream().map(toDoubleFunction).collect(Collectors.toList());
//		System.out.println(doubleArray);
//		myNumberList.stream().forEach(System.out :: println);
				

	}
	
}
