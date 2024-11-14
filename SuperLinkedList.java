import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {


    public boolean removeVowels() {
        ListIterator <String> iter = this.listIterator();
        int count = 0;
        while (iter.hasNext()){
            if ("aeiou".indexOf(iter.next().toLowerCase())!=-1){
                count ++;
                iter.remove();
            } //end if
        } //end while
        if (count == 0)
            return false;
        return true;
    } //end method removVowels

    public boolean removeConsonants() {
        ListIterator <String> iter = this.listIterator();
        int count = 0;
        while (iter.hasNext()){
            if ("aeiou".indexOf(iter.next().toLowerCase())==-1){
                count ++;
                iter.remove();
            } //end if
        } //end while
        if (count == 0)
            return false;
        return true;
    } //end method removeConsanants

    public LinkedList<String> removeDuplicates() {
        LinkedList <String> retList = new LinkedList <String>();
        ListIterator <String> iter = this.listIterator();
        for (int i = 0; i<this.size(); i++){
            iter=this.listIterator();
            boolean found = false;
            String search = this.get(i);
            while (iter.hasNext()){
                if (iter.next().equals(search)){
                    if (!found)
                        found = true;
                    else{
                        retList.add(iter.previous());
                        iter.remove();
                    }//end inner else
                } //end outer if
            }//end while
        }//end for loop
        return retList;
    } //end method removeDuplicates

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {
        ListIterator <String> iter = this.listIterator();
        String retVal = iter.next();
        while (iter.hasNext()){
            retVal += ", ";
            retVal += iter.next();
        }//end while
        return retVal;
    }//end toString
} // end SuperLinkedList