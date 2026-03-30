package com.palle.classpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListNote {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("home");
		list.add("about us");
		list.add("trainings");
		list.add("placements");

		int index = list.indexOf("about us");

		list.set(index, "About us");

		list.add("projects");

		String str = new StringBuilder().append(list.get(3)).reverse().toString();

		list.set(3, str);

		System.out.println(list);

		ListIterator<String> lit = list.listIterator(list.size());

		int value=list.size()-1;
		while (lit.hasPrevious()) {
            if(lit.previousIndex()%2!=0) {
			System.out.println(lit.previous());
            }
           
		}

	}

}
