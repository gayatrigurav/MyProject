package myproject;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("qtp");
		ll.add("test");
		ll.add("selenium");
		
		System.out.println("content of LinkedList:"+ ll);
		
		//addfirst
		ll.addFirst("RTP");
		//addlast
		ll.addLast("Automation");
		
		System.out.println("content of LinkedList:"+ll);
		
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0,"XYZ");
		System.out.println(ll.get(0));
		
		//Remove first and remove last
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of the LinkedList"+ll);
		
		
	}

}
