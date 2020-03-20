package myproject;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = new int[3] // static array
				
		//ArrayList--> dynamic array
				//can allow duplicate
				//maintain insertion order
				//Synchronized
				//allow random fetch as it stores value on the basis of indexes
				
		ArrayList ar = new ArrayList();
		
		ar.add(29);
		ar.add(45);
		ar.add(47);
		
		System.out.println(ar.size());
		
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Employee e1 = new Employee("Gayatri",33,"Java Developer");
		Employee e2 = new Employee("Yogesh",42,"Architect");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		
		//iterator to traverse the value
		
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("***********");
		//addAll
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Java");
		ar5.add(".Net");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("JavaScript");
		ar6.add("Angular");
		ar6.add("React");
		
		ar5.addAll(ar6);
		
		for(int i = 0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//removeAll
		
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
	
		System.out.println("************");
		//retainAll
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Java");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("React");
		
		ar7.retainAll(ar8);
		for(int i= 0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
				
	}

}
