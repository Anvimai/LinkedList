/**
 * COMP 410
 *See inline comment descriptions for methods not described in interface.
 *
*/
package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
	
//instructor provided code
	
  Node headCell; //this will be the entry point to your linked list (the head)
  Node lastCell; // this is the Node at the end of the list... the starting place
                 // if you wanted to traverse the list backwards
  
  public LinkedListImpl(){//this constructor is needed for testing purposes. Please don't modify!
    headCell = null; //Note that the root's data is not a true part of your data set!
    lastCell = null;
  }
  
  //implement all methods in interface, and include the getRoot method we made for testing 
  // purposes. Feel free to implement private helper methods!

 // add the fields you need to add to make it work... like a 
  
  public Node getRoot(){ //leave this method as is, used by the grader to grab your linkedList easily.
    return headCell;
  }
  public Node getLast(){ //leave this method as is, used by the grader to grab your linkedList easily.
    return lastCell;
  }
  
//end instructor provided code

public boolean insert(double elt, int index) {
	
	//terminate if index size is out of bounds
	if((index > size())||(index < 0)) {return false;}
	
	Node nNode = new Node(elt);
	
	//headCell instantiation
	if(headCell == null) {
		headCell = nNode;
		lastCell = nNode;
		
	}else {
	
		Node n = headCell; 
		
		//lastCell instantiation
		if(index == size()) {
		nNode.prev = lastCell;
		lastCell = nNode;
		}
		
		// instantiation when list is size 1
		if((size()==1)&&(index != 0)) {
		n.next = nNode; 
		nNode.prev = n; 
		return true;
		}
		
		
		// headCell re insertion 
		if(index == 0) {
			headCell.prev = nNode;
			nNode.next = headCell;
			headCell = nNode;
			return true;
		}
		
		//inner cell insertion headCell < index > lastCell for-loop
		for(int ind = 0; ind < (index-1); ind++) {n = n.next;}
		
		//end of list (lastCell) instantiation after headCell.next
		if(n.next == null) {
			
		n.next = nNode; 
		nNode.prev = n;
		lastCell = nNode;
		
		return true;
		
		}else { //general inner cell instantiation
			
			nNode.next = n.next;
			n.next.prev = nNode;
			n.next = nNode; 
			nNode.prev = n;
			return true;
					
		}
				
	}
	return false; //an error occurred 
	

}


//insert element at index where elt.prev < elt < elt.next
public boolean insort(double elt) {

	Node nNode = new Node(elt);
	Node n = headCell; 
	
	//headCell instantiation
	if(size()==0) {
		headCell = nNode; 
		lastCell = nNode;
		return true;
	}
	//if insertion takes place at index 0
	if(headCell.data > elt) {
		headCell.prev = nNode; 
		nNode.next = headCell; 
		headCell = nNode;
		return true;}
	
	//inner list insertion (finds the first occurrence of a less than prev and a greater than next)
	while(n.next != null ) {
		if((n.data <= nNode.data)&&(n.next.data > nNode.data)) {
			nNode.next = n.next; 
			nNode.prev = n;
			n.next.prev = nNode;
			n.next = nNode;
			return true; 
		}else {n = n.next;}
	}
	
	//if insertion takes place at the end of the list
	if((n.next == null) && (size()>0)) {
		n.next = nNode;
		nNode.prev = n; 
		lastCell = nNode; 
		return true;}	
	
	//insort always succeeds
	return true;
}

public boolean remove(int index) {
	
	//return false if index out of bounds
	if((index > size())||(index < 0)) {return false;}
	
	//headCell removal when size is 1
	if(size()==1) {
		headCell.next = null;
		lastCell.prev = null;
		headCell = null; 
		lastCell = null;

		return true;
	}
	
	//headCell removal and re declaration
	if(index == 0) { 
	headCell = headCell.next; 
	headCell.prev = null;
	return true;}
	
	
	//lastCell removal and re declaration
	if(index == (size()-1)) {
		lastCell = lastCell.prev;
		lastCell.next = null;
		return true;
	}
	
	//inner cell removal
	Node n = headCell; 

	
	for(int ind = 0; ind < index; ind++) {n = n.next;}
	
	Node nP = n.prev; 
	Node nN = n.next;
	nP.next = nN;
	nN.prev = nP;
		
	
	return true;
}

public double get(int index) {
	
	//if index is out of bounds
	if((index >= size())||(index < 0)) {return  Double.NaN;}
	
	
	Node n = headCell; 

	for(int ind = 0; ind < index; ind++) {n = n.next;}
	
	return n.data;
}

public int size() {
	
	//test this more
	
	int size = 0; 
	
	Node n = headCell; 
	
	while(n != null) {
		size++;
		n = n.next;
	}
	
	return size;
}

public boolean isEmpty() {
	
	if(size() == 0) {return true;}
	return false;
}


public void clear() {
	
	if(!isEmpty()) {
	headCell = null;
	lastCell = null;
	size();}
}



}