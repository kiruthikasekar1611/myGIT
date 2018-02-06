package strings;

import java.util.*;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		Map <Character,Integer> map1= new HashMap<Character,Integer>();
		
		String s1="cognizant technologies";
		char[] c1=s1.toCharArray();
		int size= c1.length;
		
		for(int i=0;i<size;i++){
			char c=c1[i];
			if(map1.containsKey(c)){
				map1.put(c, (map1.get(c)+1));
			}
			else
				map1.put(c,1);			
		}

		for(Entry<Character,Integer> entry: map1.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		
			
		}
	}

}
