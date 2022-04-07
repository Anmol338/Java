package week_5_lab_2;

import java.util.ArrayList;

public class ArrayBasics2 {

	public static void main(String[] args) {
		ArrayList arr1, arr2, arr3;
		arr1 = new ArrayList();
		System.out.println(arr1.size()); // return the size
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(5);
		arr1.add(10);
		arr1.add(2);
		arr1.add(7);
		arr1.add(100);
		System.out.println(arr1.size()); // 5 (0-4 index)
		arr1.add(2, 999);
		System.out.println(arr1.size()); // 5 (0-4 index)
		System.out.println(arr1);

		arr2 = new ArrayList();
		arr2.addAll(arr1);
		System.out.println(arr2.size());
		System.out.println(arr2);
//		arr1.clear();
//		System.out.println(arr1.size());

		Object obj1 = arr1.clone(); // Object -> arrayList
		boolean result = arr1.contains(7); // search value
		if (result == true) {
			System.out.println("found");
		} else {
			System.out.println("Not Found!!");
		}

		// forEach returns -> void
		// E get(int index)
		System.out.println(arr1.get(0));

		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}

		int sum = 0, avg = 0, min, max;

		for (int i = 0; i < arr1.size(); i++) {
			sum += (int) (arr1.get(i));
		}
		System.out.println("The sum is " + sum);
		avg = sum / arr1.size();
		System.out.println("The average is " + avg);

		// int indexOf(Object o)
		int n = arr1.indexOf(11);
		System.out.println(n);

		// boolean isEmpty()
		boolean res1 = arr1.isEmpty();
		System.out.println(res1);


		// E remove(int index)
		Object obj2 = arr1.remove(7); //based on index
		System.out.println(obj2);
		System.out.println(arr1.size());
		
		//boolean remove(Object o) //based on value
		Object obj3 = 7;
		boolean res2 = arr1.remove(obj3);
		System.out.println(res2);
		
		//E	set(int index, E element) //update/edit based on index
		Object obj4 = arr1.set(4, 5);
		System.out.println(obj4);
		System.out.println(arr1);
		
		
	}

}
