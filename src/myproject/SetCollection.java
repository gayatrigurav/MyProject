package myproject;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // If we want to represents the group of individual objects as a single entity, where duplicates are not allowed
		//and insertion order is not preserved, then we should go for set.
		
		//HashSet(1.2 version):- underlined data structure is HashTable, null insertion possible, duplicates not allowed, if duplicate
		//added then no compile time or run time errors just returns false, searizable and clonable can be implemented
		//no insertion order maintained,best for the search operation cause the hash code is used to search the data.
	   
		//HashSet HashSet h = new HashSet() //creates empty hash set object with initial capacity 16 
		//and fill ratio/ load factor:- 0.75 after filling 75% capacity new hashset object will be created thats why 
		//load factor or fill ratio is 0.75
		
		//HashSet h = new HashSet(int initialCapacity) :- can customized the initial capacity
		//HashSet h = new HashSet(int initialCapacity,float load-factor) :- can customized the load factor as well 
		//HashSet h = new HashSet(Collection c) :- inter conversion of collection objects
		
		//## LinkedHashSet(1.4 version)## :- child class of HashSet 
		//If we want to represents the group of individual objects as a single entity, where duplicates are not allowed
		//and insertion order must be preserved then we should go for LinkedHashSet.
		//underlined data structure is hashtable + linkedList
	
		//HashSet<Integer> h = new  HashSet<>();
		//h.add(4);
		//h.add(23);
		//h.add(32);
		
		
		//System.out.println(h);// insertion order is not preserved.
		
		LinkedHashSet<Integer> h = new LinkedHashSet<>();
		h.add(4);
		h.add(23);
		h.add(32);
		
		System.out.println(h);
		
		
	}
	
	

}
