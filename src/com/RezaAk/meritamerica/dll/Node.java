package com.RezaAk.meritamerica.dll;

public class Node {
	
	//member variables
	public int value;
    public Node previous;
    public Node next;
    
    //constructor
    public Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
    }

}
