package tests;

import main.AmotzIterator;
import main.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		System.out.println("start test");

		test();

		System.out.println("end test");
	}

	public static void test() {
//      create empty list
		LinkedList amotzlist = new LinkedList();
		assert (amotzlist.isEmpty(amotzlist));

//	    add three element at the tail
		amotzlist.add(3);
		amotzlist.add(5);
		amotzlist.add(8);

//      check that elements exist in the same order that you specified them
		AmotzIterator iter = amotzlist.getIter();

		assert (iter.next().getValue() == 3);
		assert (iter.next().getValue() == 5);
		assert (iter.next().getValue() == 8);

//		remove  element

//		check that the element was removed

	}

}

// TODO implement the test to the remove method 
// and also the method remove in the LinkedList class