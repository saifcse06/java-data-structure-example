package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<Integer, String>();
        obj.put(0,"January");
        obj.put(1,"February");
        obj.put(2,"March");
        obj.put(3,"April");
        System.out.println(obj.get(3));
        /*
         Demonstration of HashMap – count the characters in a string
         */
        String s="hello";
        check(s);
    }

    static void check(String s)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        Iterator<Character> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Object x=itr.next();
            System.out.println("count of "+x+" : "+map.get(x));
        }
    }
}
