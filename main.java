
package compare;
import java.util.*;
public class main {
    public static void main(String[] args){
        Employee e = new Employee(12,"niki","teli");
        Employee e1 = new Employee(11,"niki","teli");
        Employee e2 = new Employee(14,"aaa","teli");
        List<Employee> eee = new ArrayList<Employee>();

        eee.add(e1);
        eee.add(e2);
        eee.add(e);
        Collections.sort(eee);
        for(Employee ll: eee){
            System.out.println(ll.f_name+", "+ll.age);
        }

        String s1 = "aa" ;
        String s2 = "bb" ;
        System.out.print(s1.compareTo(s2));  //    return   -1
        System.out.print(s2.compareTo(s1));  //    return   > 1
        System.out.print(s2.compareTo(s2));  //    return   0


       // You use collection.sort on any collection of objects
        List<String> s = new ArrayList<String>();
        s.add("aa");
        s.add("gg");
        s.add("bbb");
        s.add("kjj");
        s.add("paaa");
        s.add("as");

        // if the object is created by you employe,author etc them implement the Comparable<> Interface


        Collections.sort(s);
        for(String m:s) {
            System.out.println(m);
        }
    }

}
