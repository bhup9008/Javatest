import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /* List<String> list=List.of("ava@gmail.com" , "ava@gmail.com", "ava@gmail.org", "ava@gmail.in" , "Smith", "city");
        List<String> liststart1=
       list.stream().filter(x->x.endsWith(".com")).collect(Collectors.toList());
        System.out.println(liststart1);
       List<String> liststart=
       list.stream().map(s->s.toLowerCase()).filter(s->s.startsWith("s")||s.startsWith("c")).collect(Collectors.toList());
       System.out.println(liststart);



        List<Integer> numList=List.of(234 , 3000, 200, 500 , 300, 100);
            Integer maxnum=
            numList.stream().min(Comparator.comparing(Integer::intValue)).get();
        Integer sum=numList.stream().mapToInt(n->n.intValue()).sum();
        System.out.println("avrage "+sum/numList.size());
        List<Integer> sortnum1=
        numList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println(sortnum1);
        OptionalDouble ss=
        numList.stream().mapToDouble(n->n.intValue()).average();

        System.out.println(ss.getAsDouble());
        OptionalDouble avead=
                numList.stream().mapToInt(n->n.intValue()).average();

        System.out.println(ss.getAsDouble());*/




       /* String s1="a";
        String s2="A";
        String s3=new String("a");
        String s4=new String("A");
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put(s1,"a");
        hashmap.put(s2,"A");
        hashmap.put(s3,"aaa");
        hashmap.put(s4,"AAA");
        System.out.println(hashmap.size());
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s3==s1);*/


        //hashmap.entrySet().stream().forEach(x->System.out.println(x.getKey()+":"+x.getValue()));

       /* StringBuilder sb1=new StringBuilder("a");
        StringBuilder sb2=new StringBuilder("a");
        Map<StringBuilder,String> hashmap1=new HashMap<>();
        hashmap1.put(sb1,"a");
        hashmap1.put(sb2,"a");
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(hashmap1.size());*/



    /*    String c=null;
        String c1="hello";
        System.out.println(c==c1);
        System.out.println(c.equals(c1));
        */

        int n=5;
        for (int i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (int j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print("* ");
            }

            // print new line for each row
            System.out.println();
        }






    }


}