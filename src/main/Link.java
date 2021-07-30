package main;

public class Link {
	
	private int value;
	private Link next;
	private Link previous;
	
	public Link(int value) {
		this.value = value;
		next = null;
		previous = null ;
		
	}
	
	public Link getNext() {
		return next;
	}
	
	public void setNext(Link newLink) {
		next = newLink;
	}
	
	public Link getPrevious() {
		return previous;
	}
	
	public void setPrevious(Link newLink) {
		previous = newLink;
	}
	
	public int getValue() {
		return this.value;
	}
}


