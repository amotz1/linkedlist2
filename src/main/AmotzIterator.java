package main;

import java.util.Iterator;

public class AmotzIterator implements Iterator<Object> {
	private Link current; 
	
	public AmotzIterator(Link head) {
		this.current = head;
	}

	public boolean hasNext() {

		if (this.current.getNext() == null)
			return false;
		
		else
			return true;
	}

	public Link next() {
		Link tempLink = this.current;
		this.current = this.current.getNext();
		return tempLink;
	}

}
