package javabasics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<String>();
		set1.add("aaaaaaaaaaaa1232");
		set1.add("rrrrrrrrrr");
		set1.add("4rfdfdf");
		set1.add("swe3e233434");
		
		int setsize=set1.size();
		System.out.println("size is ..."+setsize);
		
		Iterator<String> itr=set1.iterator();
		String s1=(String) itr.next();
		System.out.println(s1);
		
		
		
		

	}

}
