package main;

import java.util.Iterator;

class AmotzIterator implements Iterator<Object> {
	private Link current;

	AmotzIterator(Link head) {
		current = head;
	}

	public boolean hasNext() {

		if (current.next == null)
			return false;

		else
			return true;
	}

	public Object next() {
		Link tempLink = current;
		
		if (current == null) {
			assert hasNext();
		}
		
		current = current.next;
		return tempLink.value;
	}

}
