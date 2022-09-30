package collections;

import java.util.ArrayList;

public class ArraylistExample4 {
    public static void main(String[] arg) throws Exception
    {
        try {
  
            // Creating object of ArrayList of String of
            // size = 3
            ArrayList<String> numbers
                = new ArrayList<String>(3);
  
            // adding element to Arrlist numbers
            numbers.add("Abhinav");
            numbers.add("Ankit");
            numbers.add("Anupam");
            numbers.add("Aman");
  
            // Print the ArrayList
            System.out.println("ArrayList: " + numbers);
            
            
            
            
            numbers.trimToSize();
            
            System.out.println(" The List elements are:");
            // A to trim the capacity of an Array list the current list size
            System.out.println(" A to trim the capacity of an Array list the current list size:"+numbers.size());
      
            
            
      
            // using ensureCapacity() method to
            // increase the capacity of ArrayList
            // numbers to hold 30 elements.
            
            
            //B to increase the size of an Array list
            System.out.println(" B Increasing the capacity of ArrayList numbers to store upto 30 elements.");
  
            numbers.ensureCapacity(30);
  
            System.out.println("ArrayList numbers can now store upto 30 elements.");
            
            //C. to replace the second element of an Array List with the specified element.
            String new_color = "Vishal";
            numbers.set(1,new_color);

            int num=numbers.size();
            System.out.println("Replace second element with 'Vishal'."); 
            for(int i=0;i<num;i++)
            System.out.println(numbers.get(i));
            
            
            
            
            System.out.println("Original array list: " + numbers);
            System.out.println("Print using index of an element: ");
            int no_of_elements = numbers.size();
            for (int index = 0; index < no_of_elements; index++)
             System.out.println(numbers.get(index));
        }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
        
        
    }
}