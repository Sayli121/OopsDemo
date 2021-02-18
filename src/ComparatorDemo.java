import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student5> ar=new ArrayList<Student5>();
		
        Student5 s1=new Student5(111,"john","Benaluru");
        Student5 s2=new Student5(121,"allen","mumbai");
        Student5 s3=new Student5(131,"sam","milan");
        Student5 s4=new Student5(141,"joe","Benaluru");
        
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        ar.add(s4);
        
        System.out.println("************Unsorted Array List:***********");
        //System.out.println(ar);// invoke ToString() method
        for(int i=0;i<ar.size();i++)
        	System.out.println(ar.get(i));
        
        Collections.sort(ar,new SortbyRoll());
        System.out.println("*************Sorted by roll no************");
        
        for(int i=0;i<ar.size();i++)
        	System.out.println(ar.get(i));
        System.out.println("*************Sorted by name************");
        
        Collections.sort(ar,new SortByName());
        for(int i=0;i<ar.size();i++)
        	System.out.println(ar.get(i));
        
        
        
        
	}

}
