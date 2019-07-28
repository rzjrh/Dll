package com.RezaAk.meritamerica.dll;

//Reza Akhlaqi 		7-23-2019



public class Dll {
	
	//member variables
	public Node head;
    public Node tail;
    
    //the constructor. They are null(empty) in the begining of the program
    public Dll() {
        this.head = null;
        this.tail = null;
    }
	  
    
 // adding (pushing) new node to the list
 // if there is no head, then add this new Node to the head. also, make the tail as the new Node
    public void push(Node newNode) {	
        if(this.head == null) {
        	System.out.println("System log: The head is null, DLL Started");
            this.head = newNode; 
            
            this.tail = newNode;
            return;
            
        }
       
        /*steps of making dll:
         1- make the last Node next to the new Node
         2- make the last Node as the prvious of the new Node
         3- make the tail as the new Node 
         */
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
        
        //these two lines are just for my curiosity!         
        System.out.println("System log: The tail changed to: " + newNode.previous.value);
        System.out.println("System log: The head changed to: " + lastNode.next.value);
        
        
    }
    
    
    
    
    //This method removes the last node of our DLL and returns it.
    public Node pop() {
    	Node secondTolast = null;
    	Node last = null;
    	
    	secondTolast = this.tail.previous;
    	last= this.tail;
    	
    	secondTolast.next= null; //pointed to last node now points to null
    	last.previous= null; //Pointed to the second the last Node now points to  null
    	this.tail= secondTolast;
    	return last;
    	
    		
    }
    
    
    
    
    
    //This method returns a boolean whether the value in the argument is in the list or not.
    //Return true if the value exists, else, return false.
    public boolean contains(Integer value) {
    	System.out.print("Check if the value '" + value +  "' existed in node: ");
    	Node current = this.head;
    	
    	while(current !=null) {
    		if(current.value == value) {
    			System.out.print("True\n");
    			return true;
    			
    		}
    		current = current.next;
    	}
    		System.out.print("False\n");
    		return false;	
    	
    }
    
    
    //Returns the number of nodes in the list.
    public int size() {
    	int count = 0;
    	Node current = this.head;
    	while(current !=null) {
    		count++;
    		current = current.next;
    	}
        System.out.println("\nThere are '" + count + "' Nodes in this program");
    	return count;
    }
    
    
   
    public void printAll() {
    	System.out.println("\nPrint all the values: ");
        Node current = this.head;
        while(current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
    }
    
    
}  
    


