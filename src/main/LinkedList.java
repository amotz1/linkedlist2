package main;

public class LinkedList {
	private Link head = null;
	private Link tail = null;

	public void add(int value) {
		Link newLink = new Link(value);
		
		if (head == null) {
			assert(tail == null);
			
			head = newLink;
			tail = newLink;
					
		}
		
		else {
			tail.setNext(newLink);
			newLink.setPrevious(tail);
			newLink.setNext(null);
			tail = newLink;
			
		}

	}

	public Boolean isEmpty(LinkedList list) {
		if (head == null) {
			assert(tail == null);
			return true;
		}

		else {
			return false;
		}
	}

	public Link getHead() {
		return head;
	}

	public AmotzIterator getIter() {
		AmotzIterator amotzIterator = new AmotzIterator(head);
		return amotzIterator;
	}

}
