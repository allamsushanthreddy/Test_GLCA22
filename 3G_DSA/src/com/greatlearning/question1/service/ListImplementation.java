package com.greatlearning.question1.service;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
	
		List<Integer> ll = new ArrayList<>();
		
		ll.add(12);
		ll.add(1);
		ll.add(34);
		ll.add(21);
		  
        if (ll.contains(34)) {
        	System.out.println("The list contains 34");
            System.out.println(ll.remove(ll.indexOf(34)));
        }
        else
            System.out.println("The list does not contains 34");
//        
//		while(ll.iterator().hasNext()) {
//			System.out.println(ll.iterator().next());
//			ll.remove(ll.indexOf(ll.iterator().next()));
//			
//		}
	}
}
