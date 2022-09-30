package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("Abhinav");
		s.add("Ankit");
		s.add("Aman");
		s.add("Vishal");
		System.out.println("Size "+s.size());
		
		  s.trimToSize();
		  System.out.println();
		  for (int i =0; i<s.size(); i++) {
	            System.out.println("Number = " + s);
	        }
		
		
		
//		System.out.println(s);
//		s.remove(2);
//		System.out.println(s);
//		s.set(1,"Akash");
//		System.out.println(s);
		
//		for(int i=0;i<s.size();i++) {
//			System.out.println(s);
//		}
//		System.out.println(s);
		
//		 for(int i =0; i<s.size(); i++){
//	            String a = s.get(i);
//	            System.out.println(a);
//	        }
//		 
		//iterator object
//		 Iterator<String> itr = s.iterator();
//	        while(itr.hasNext()){
//	            System.out.println("Next element" + itr.next());
//	            itr.remove();
//	        }
//	     
//	         System.out.println("final Size : " +s.size());
//		 
//
//	}

}
}
