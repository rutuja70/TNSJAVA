package is;

import java.util.LinkedList;

public class LL {
	public static void main(String args[]) {
		LinkedList<String> list=new LinkedList<String>();
		list.addFirst("A");
		list.addFirst("is");
		list.add(2, "linked");
		list.add(3, "linked");
		list.addLast("list");
		list.addFirst("this");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"->");
			
		}
		System.out.print("null");
	}
}
