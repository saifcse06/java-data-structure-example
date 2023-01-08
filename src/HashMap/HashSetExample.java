package HashMap;

import java.util.HashSet;
/*
Demonstration of HashSet – to find string has unique characters
 */
public class HashSetExample {
    public static void main(String[] args) {
       HashSet<String> daysName = new HashSet<String>();
       daysName.add("Friday");
       daysName.add("Saturday");
       daysName.add("Sunday");
       daysName.add("Monday");
       daysName.add("Tuesday");
       daysName.add("Wednesday");
       daysName.add("Thursday");
       System.out.println(daysName);
       daysName.clone();
       System.out.println(daysName);
       System.out.println(daysName.retainAll(daysName));
       System.out.println(daysName);
       /*
       find string has unique characters
        */
       String s="helLo wqty ";
       boolean ans=isUnique(s);
       if(ans)
          System.out.println("string has unique characters");
       else
          System.out.println("string does not have unique characters");


    }
   static boolean isUnique(String s)
   {
      HashSet<Character> set =new HashSet<Character>();
      for(int i=0;i<s.length();i++)
      {
         char c=s.charAt(i);
         if(c==' ')
            continue;
         if(set.add(c)==false)
            return false;
      }
      return true;
   }
}
