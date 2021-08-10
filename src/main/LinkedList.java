package main;

public class LinkedList {
	private Link head = null;
	private Link tail = null;
	private int size = 0;

	public void add(int value) {
		Link newLink = new Link(value);
		size += 1;

		if (head == null) {
			assert (tail == null);

			head = newLink;
			tail = newLink;

		}

		else {
			tail.next = newLink;
			newLink.previous = tail;
			newLink.next = null;
			tail = newLink;

		}
	}

	public int getSize() {
		return size;
	}

	public void remove(int value) {
		Link current = head;
		for (int i = 1; i <= size; i++) {
			if (current.value == value) {

				if (size == 1) {
					head = null;
					tail = null;

					break;

				}

				if (current.value == head.value) {
					current.next.previous = null;
					head = current.next;

					break;

				}

				else if (current.value == tail.value) {
					current.previous.next = null;
					tail = current.previous;
					
					break;
				}

				else {
					current.previous.next = current.next;
					current.next.previous = current.previous;
					
					break;
				}
			}

			else {
				current = current.next;
			}

		}

		size -= 1;

	}

	public Boolean isEmpty(LinkedList list) {
		if (head == null) {
			assert (tail == null);
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
