 class SLLTester {
  public static void main(String[] args) {
    //create lists
    SuperLinkedList list1 = new SuperLinkedList();
    list1.add("a"); list1.add("b"); list1.add("c"); list1.add("d"); list1.add("e");

    SuperLinkedList list2 = new SuperLinkedList();
    list2.add("e"); list2.add("b"); list2.add("c"); list2.add("b"); list2.add("a");

    SuperLinkedList list3 = new SuperLinkedList();
    list3.add("A"); list3.add("D"); list3.add("c"); list3.add("C"); list3.add("D"); list3.add("E"); list3.add("B");
    
    System.out.println("This is list1");
    System.out.println(list1);
    System.out.println("This is list2");
    System.out.println(list2);
    System.out.println("This is list3");
    System.out.println(list3);

    System.out.println(list3.removeDuplicates());
  } // end main
} // end class