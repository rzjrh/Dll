package com.RezaAk.meritamerica.dll;

public class DllTest {

	public static void main(String[] args) {
		
		//creating new object names dll
        Dll dll = new Dll();
        
        //making instansiations
        Node Node1 = new Node(18);
        Node Node2 = new Node(33);
        Node Node3 = new Node(14);
        Node Node4 = new Node(123);
        Node Node5 = new Node(10);
        Node Node6 = new Node(2);
        Node Node7 = new Node(68);
        Node Node8 = new Node(120);
        Node Node9 = new Node(140);
        Node Node10 = new Node(155);
      
        //adding these nodes to the dll
        dll.push(Node1);
        dll.push(Node2);
        dll.push(Node3);
        dll.push(Node4);
        dll.push(Node5);
        dll.push(Node6);
        dll.pop(); 
        dll.push(Node7);
        dll.push(Node8);
        dll.push(Node9);
        dll.push(Node10);
        
       dll.printAll();
        
       
       dll.pop(); 
       dll.contains(80);
       dll.contains(120);
       dll.contains(135);
       dll.size();
       
        
    }
	
	
}
