package main;

public class Linked_list {
  
  private Node value=null;
  private Node head=null;
  private Node tail=null;
  
  
  public Linked_list() {

  }
  
  public void add(Node value) {
	if(head == null) {
		head = value;
		tail = value;
	}else {
	   Node i = head;
       while (i.getNext() != null) {
           i = i.getNext();
       }
       i.setNext(value);
	
	}
    
  }

  public Node getValue() {
    return value;
  }

  public Node getHead() {
    return head;
  }




}
