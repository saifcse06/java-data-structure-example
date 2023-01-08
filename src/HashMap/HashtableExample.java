package HashMap;

import java.util.Hashtable;
/*
 * Hashtable
 */
public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable1=new Hashtable<Integer,String>();
        Hashtable<Integer, String> hashtable2;
        // Hash table set only unique key and value
        hashtable1.put(11,"Bangladesh");
        hashtable1.put(22,"USA");
        hashtable1.put(33,"Canada");
        hashtable1.put(33,"Canada");

        // create a clone or shallow copy of hash table hashtable1
        hashtable2 = (Hashtable<Integer, String>)hashtable1.clone();

        // checking clone hashtable1
        System.out.println("values in clone: " + hashtable1);

        // clear hash table hashtable1
        hashtable1.clear();

        // checking hash table hashtable2
        System.out.println("after clearing: " + hashtable1);
        System.out.println("values in clone: " + hashtable2);
    }
}
