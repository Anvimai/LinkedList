package LinkedList_A1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListImplTest {

	@Test
	void testLinkedListImpl() {
		LinkedListImpl Ll = new LinkedListImpl();
		for(int i = 0; i < 1000; i++) {
			Ll.insert(i, i);
		}
		
		assertEquals(0,Ll.getRoot().data);
		assertEquals(1,Ll.getRoot().next.data);
		assertEquals(1000,Ll.size());
		assertEquals(999,Ll.getLast().data);
		assertEquals(998,Ll.getLast().prev.data);
		
	}




	@Test
	void testInsert() {
		
		LinkedListImpl Ll = new LinkedListImpl();

		Ll.insert(0, 0);
		Ll.insert(1, 1);
		Ll.insert(2, 2);
		Ll.insert(3, 3);
		Ll.insert(4, 4);
		Ll.remove(0);
		Ll.remove(0);
		Ll.remove(0);
		Ll.remove(0);
		Ll.remove(0);

		
		printList(Ll);
		

		
	}
	
	public static void printList(LinkedListImpl L){ 
	    //note that this is a good example of how to iterate through your linked list
	    // since we know how many elements are in the list we can use a for loop
	    Node curr=L.lastCell; // the first data node in the list... might be null
	    System.out.print("List: ");
	    for(int i=0; i<L.size(); i++) { 
	      System.out.print(" --> " + curr.data);
	      curr=curr.prev;
	    }
	    System.out.println();
	  }
	
	@Test
	void testInsort() {
		
		LinkedListImpl Ll = new LinkedListImpl();
		Ll.insort(6);
		Ll.insort(2);
		Ll.insort(4);
		Ll.insort(9);
		Ll.insort(7);
		Ll.insort(10);
		Ll.insort(20);
		Ll.insort(15);
		//printList(Ll);
		Ll.remove(5);
		//printList(Ll);
		Ll.insort(10);
		//printList(Ll);
		
	}

	@Test
	void testRemove() {
		
	}

	@Test
	void testGet() {
		
	}

	@Test
	void testSize() {
		LinkedListImpl Ll = new LinkedListImpl();
		for(int i = 0; i < 5; i++) {
			Ll.insert(i, i);
		}

		Ll.remove(0);
		Ll.remove(1);
		Ll.remove(2);
		Ll.remove(1);
		Ll.remove(0);
		assertEquals(0,Ll.size());
	}



}
