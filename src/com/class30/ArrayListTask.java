package com.class30;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		/***
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 */
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ahmad");
		names.add("Mahmood");
		names.add("Kalbe");
		names.add("Maqsod");
		names.add("Mahbob");
		
		System.out.println(names.get(1));
		System.out.println(names.size());
		
		System.out.println("-----for loop-----");
		for(int i=0; i<names.size();i++){
			System.out.println(i);
		}
		
		System.out.println("----advanc loop-----");
		for(String words:names) {
			System.out.println(words);
			
			ArrayList alist=new ArrayList();
			alist.add("String");
			alist.add(100);
			alist.add(100.10);
			alist.add(true);
			alist.add('a');
			
			for(Object values: alist) {
				System.out.println(values);
			}
			
			ArrayList<Boolean> boleanArrayList=new ArrayList();
			boleanArrayList.add(true);
			boleanArrayList.add(false);
		
			for(Object val:boleanArrayList) {
				System.out.println(val);
			}
		}
	}
}
