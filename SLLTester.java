 import java.util.LinkedList;
 class SLLTester {
  public static void main(String[] args) {
    //create lists
    SuperLinkedList list1 = new SuperLinkedList();
    list1.add("a"); list1.add("b"); list1.add("c"); list1.add("d"); list1.add("e");

    SuperLinkedList list2 = new SuperLinkedList();
    list2.add("e"); list2.add("d"); list2.add("c"); list2.add("b"); list2.add("a");

    SuperLinkedList list3 = new SuperLinkedList();
    list3.add("A"); list3.add("D"); list3.add("C"); list3.add("C"); list3.add("D"); list3.add("E"); list3.add("B");
    
    System.out.println("This is list1");
    System.out.println(list1);
    System.out.println("This is list2");
    System.out.println(list2);
    System.out.println("This is list3");
    System.out.println(list3);
    System.out.println();

    //mix
    LinkedList <String> mixList = list1.mix(list2);
    System.out.println("This is the calling list after the mix");
    System.out.println(list1);
    System.out.println("This is the sent list after the mix");
    System.out.println(list2);
    System.out.println("This is retList, return value of the call of mix");
    System.out.println(mixList);
    System.out.println();
    

    //removeDuplicates
    System.out.println("This is list3 after removeDuplicates:");
    LinkedList <String> dupes = list3.removeDuplicates();
    System.out.println(list3);
    System.out.println("List returned from removeDuplicates: ");
    System.out.println(dupes);
    System.out.println();

    //removeVowels and removeConsanants
    System.out.println("Removed vowels:" + list3.removeVowels());
    System.out.println("This is list 3 after removeVowels:");
    System.out.println(list3);
    System.out.println();
    System.out.println("Removed consonants: " + list2.removeConsonants());
    System.out.println("This is list2 after removeConsonants:");
    System.out.println(list2);
    System.out.println();

    //concatenate
    LinkedList <String> conList = list3.concatenateStrings();
    System.out.println("This is list3 after concatenateStrings:");
    System.out.println(list3);
    System.out.println("This is retList, return call of concatenateStrings");
    System.out.println(conList);
    

  } // end main
} // end class