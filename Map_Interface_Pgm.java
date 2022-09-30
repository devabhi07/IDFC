package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_Pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Abhinav",1);
		m.put("Aman",2);
		m.put("Ankit",3);
		m.put("Anupam",4);
		System.out.println();
//		for(int i=0;i<m.size();i++)
//		{
//			System.out.println(m);
//		}
		
		for(Map.Entry m1: m.entrySet()) {
			System.out.println(m1.getKey()+", "+m1.getValue());
		}
		
		m.entrySet().parallelStream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		

	}

}
