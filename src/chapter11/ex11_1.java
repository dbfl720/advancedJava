package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(2);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));   // from부터 to사이에 저장된 객체를 반환
		print(list1,list2);
		
		Collections.sort(list1);  // list1과 list2를 정렬
		Collections.sort(list2);   // Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3	, "AA");  // 주어진 객체를 지정된 위치에 저장한다.
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2)" + list1.retainAll(list2)); // list1에서 list2와 겹치는 부분만 남기고 나머지 삭제.
		
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size() -1; i >=0; i--) {
			if(list1.contains(list2.get(i))) // get: 지정된 위치에 저장된 객체를  반환
				list2.remove(i);
		}
		
		
		print(list2, list2);

	}
	
	
		static void print(ArrayList list1, ArrayList list2) {
			System.out.println("list1: " + list1);
			System.out.println("list2: " + list2);
			System.out.println();
		}

}
