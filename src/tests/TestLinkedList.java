package tests;

import java.util.Iterator;

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

//      check the size of the empty list

		assert (amotzlist.getSize() == 0);

//	    add four elements at the tail
		amotzlist.add(3);
		amotzlist.add(5);
		amotzlist.add(8);
		amotzlist.add(9);

//      check the size of the list 

		assert (amotzlist.getSize() == 4);

//      check that elements exist in the same order that you specified them
		Iterator iter = amotzlist.getIter();

		assert (iter.next() == (Integer) 3);
		assert (iter.next() == (Integer) 5);
		assert (iter.next() == (Integer) 8);
		assert (iter.next() == (Integer) 9);
		assert (iter.next() == null);

//   	remove  head element

		amotzlist.remove(3);

//      check that the head element was removed

		Iterator iter1 = amotzlist.getIter();
		assert (iter1.next() == (Integer) 5);
		assert (iter1.next() == (Integer) 8);
		assert (iter1.next() == (Integer) 9);
		assert (iter1.next() == null);

// remove middle element

		amotzlist.remove(8);

// check that element was removed

		Iterator iter2 = amotzlist.getIter();
		assert (iter2.next() == (Integer) 5);
		assert (iter2.next() == (Integer) 9);
		assert (iter2.next() == null);

// remove tail element
		amotzlist.remove(9);

// check that head element was removed and size of linked list is 0

		Iterator iter3 = amotzlist.getIter();
		assert (iter3.next() == (Integer) 5);
		assert (iter3.next() == null);

// check remove of last element		
		amotzlist.remove(5);

		assert (amotzlist.getSize() == 0);
		assert (amotzlist.isEmpty(amotzlist));
	}

}
