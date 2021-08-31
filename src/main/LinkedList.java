package main;

public class LinkedList {
	private Link head = null;
	private Link tail = null;
	private int size = 0;

	public void add(int value) {
		Link newLink = new Link(value);
		size += 1;

		if (head == null) {
			assert tail == null;

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
		for (Link link = head; link != null; link = link.next) {

			if (link.value == value) {

				if (size == 1) {
					head = null;
					tail = null;

					break;

				}

				if (link.value == head.value) {
					link.next.previous = null;
					head = link.next;

					break;

				}

				else if (link.value == tail.value) {
					link.previous.next = null;
					tail = link.previous;

					break;
				}

				else {
					link.previous.next = link.next;
					link.next.previous = link.previous;

					break;
				}
			}

			else {
				if (link == tail) {
					break;
				}
			}

		}

		size -= 1;
	}

	public Boolean isEmpty(LinkedList list) {
		if (head == null) {
			assert tail == null;
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
