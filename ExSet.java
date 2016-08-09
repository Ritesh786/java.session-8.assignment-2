package gom.Samrat.Models;

import java.util.HashSet;
import java.util.Iterator;

public class ExSet {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<>();
		s.add("Ritesh");
		s.add("Urmilla");
		s.add("Savan");
		s.add("Amar");
		s.add("Ritesh");
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}

}
