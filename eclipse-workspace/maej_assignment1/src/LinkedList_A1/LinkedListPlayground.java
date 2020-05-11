package LinkedList_A1;

public class LinkedListPlayground {

  public static void main(String[] args) { 
    /*
     here you can instantiate your LinkedList and play around with it to check
     correctness. We've graciously also provided you a bit of extra test data for debugging.
     It doesn't matter what you have in here. We will not grade it. This is for your use in testing your implementation.
      */
    test9();
    //test1();
    //test2();
   // test3();
   // test4();
  //  test5();
   // test6();
   // test7();
    //test8();
    //test9();
   // test10();
   // test2();

  }
  
//  public static void test1(){
//    // example test cases
//    LinkedListImpl L= new LinkedListImpl();
//    System.out.println(L.isEmpty());
//    printList(L);
//    L.clear();
//    System.out.println(L.size());
//    System.out.println(L.isEmpty());
//    printList(L);
//    L.insert(3.3,0);
//    System.out.println(L.isEmpty());
//    printList(L);
//    L.insert(3.4, 0);
//    L.insert(3.5, 0);
//    L.insert(3.67, 1);
//    L.insert(3.357, 0);
//    L.insert(3.333, 4);
//    System.out.println(L.size());
//    printList(L);
//    L.remove(3);
//    System.out.println(L.size());
//    printList(L);
//    L.clear();
//    printList(L);
//    L.insert(3.4, 0);
//    L.insert(3.5, 1);
//    L.insert(3.67, 2);
//    L.insert(3.357, 3);
//    L.insert(3.333, 4);
//    L.insort(3.7);
//    System.out.println(L.size());
//    printList(L);
//    System.out.println(L.get(3));
//  }
//
//  public static void test2(){
//    // example test cases
//    LinkedListImpl L = new LinkedListImpl();
//    L.insert(3.4,0);//index 3
//    L.insert(3.5,1);//index 5
//    L.insert(3.67,2);//index 6
//    L.insert(3.2, 1);//index 4
//    L.insert(3.55, 0);//index 1 //insert after the fact 
//    L.insert(3.677, 1);//index 2 //insert after the fact 
//    L.insert(3.357, 0);//index 0 //insert after the fact 
//    L.remove(2);//3,5 dont work
//    System.out.println(L.size());
//    printList(L);
//  }
  
  //passed
  public static void test0() {
  LinkedListImpl L = new LinkedListImpl();
   L.clear();
   L.insert(3,0);
   L.insert(5,0);
   L.insert(6,1);
   L.clear();
   System.out.println(L.getRoot());
   L.insert(4, 0);
   printList(L);

   
  }
  
  public static void test1() {
  LinkedListImpl L = new LinkedListImpl();
  
  L.insert(3,0);
  L.insert(5,0);
  L.insert(6,0);
  L.insert(4,0);
  L.insert(7,0);
  L.insert(10,0);
  L.insert(2,0);
  L.insert(1,0);
  printList(L);
  L.insert(3,0);
  L.insert(5,1);
  L.insert(6,2);
  L.insert(4,3);
  printList(L);
 // L.clear();
 // printList(L);
  L.insert(3,1); //should return false
 // printList(L);

  }

  public static void test2() {
  LinkedListImpl L = new LinkedListImpl();
  L.insort(14);
  L.insort(21);
  L.insort(5);
  L.insort(17);
  L.insort(67);//--> 5,14,17,21,67
  printList(L);
  L.clear();
  L.insort(10);
  L.insort(15);
  L.insort(15);
  L.insort(20);
  L.insort(15);
  L.insort(10);
  printList(L);//--> 10,10,15,15,15,20
  }

  public static void test3() {
	  LinkedListImpl L = new LinkedListImpl();
  L.insert(3,0);
  L.insert(5,1);
  L.insert(6,2);
  L.insert(4,1);
  L.remove(2);// --> 3,4,6
  printList(L);
  L.clear();
  L.insert(3,0);
  L.insert(5,1);
  L.insert(6,2);
  L.insert(4,1);
  L.remove(3);
  printList(L);// --> 3,4,5
  L.clear();
  L.insert(3,0);
  L.insert(5,1);
  L.insert(6,2);
  L.insert(4,1);
  L.remove(0);
  printList(L);//--> 4,5,6
  L.clear();
  L.insert(3,0);
  L.insert(5,1);
  L.insert(6,2);
  L.insert(4,1);
  L.remove(3);
  printList(L);//--> 3,4,5
  L.remove(14); //should return false
  printList(L);

  }
  
  public static void test4() {
  LinkedListImpl L = new LinkedListImpl();
  L.insert(3,0);
  L.clear();
  printList(L);
  L.insert(5,0);
  L.insert(6,1);
  L.insert(4,0);
  printList(L);
  L.clear();
  System.out.println(L.isEmpty());//true
  L.insert(3,0);
  L.insert(5,0);
  L.insert(6,1);
  printList(L);
  L.clear();
  L.insert(4,0);
  printList(L);
  
  }
  
  public static void test5() {
  LinkedListImpl L = new LinkedListImpl();
  L.insert(3,0);
  L.insert(5,1);
  System.out.println(L.get(0));//L.get(0);
  L.clear();
  System.out.println(L.get(0)); //on empty list --> Double.NaN 
  }
  
  public static void test6() {
  LinkedListImpl L = new LinkedListImpl();
  System.out.println(L.size());// --> 0
  L.insert(45.0,0);
  System.out.println(L.size()); // --> 1
  }
  
  public static void test7() {
	  LinkedListImpl L = new LinkedListImpl();
  L.insert(3,0);
  System.out.println(L.size());//1
  L.insert(2.0,1);
  L.insert(1.0,2);//
  L.remove(0);// --> 2
  System.out.println(L.size());//2
  L.insert(3,0);
  L.insert(2.0,1);
  L.clear();
  System.out.println(L.size());// --> 0
  }
  
  public static void test8() {
	  LinkedListImpl L = new LinkedListImpl();
	 System.out.println(L.size());
     L.insert(3,0);
     L.insert(2.0,1);
     L.insert(1.0,2);
     L.remove(0);
     L.clear();
     L.insert(3,0);
     L.insert(2,1);
     L.insert(1,0);
     L.remove(2);// size 2  
     System.out.println(L.size());

    L.insert(3,0);
    L.insert(2.0,1);
    L.insert(1.0,2);
    L.remove(0);
    L.clear();
    L.insert(3,0);
    L.insert(2,1);
    L.insert(1,0);
    L.remove(2);
    System.out.println(L.size());//2
    printList(L);//--> 1,3
  }
  
  public static void test9() {
	  LinkedListImpl L = new LinkedListImpl();
    L.size();//0
    L.insert(3,0);
    L.insert(2.0,1);
    L.insert(1.0,2);
    L.remove(0);
    L.clear();
    L.insert(3,0);
    L.insert(2,1);
    L.insert(1,0);
    L.remove(2);
    printList(L);



    L.insert(3,0);
    L.insert(2.0,1);
    L.insert(1.0,2);
    L.remove(0);
    L.clear();
    L.insert(3,0);
    L.insert(2,1);
    L.insert(1,0);
    L.remove(2);
    printList(L);//                   --> 1,3
  }
  
  public static void test10() {
	  LinkedListImpl L = new LinkedListImpl();
    L.insort(14);
    L.insort(21);
    L.insert(10,1);
    L.remove(2);
    L.insort(8);
    L.insert(20,3);
    L.insort(17);
    L.insort(14);
    printList(L);
// --> 8,14,10,14,17,20
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
}