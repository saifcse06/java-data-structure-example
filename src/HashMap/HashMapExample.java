package HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<Integer, String>();
        obj.put(0,"January");
        obj.put(1,"February");
        obj.put(2,"March");
        obj.put(3,"April");
        System.out.println(obj.get(3));
    }
}
