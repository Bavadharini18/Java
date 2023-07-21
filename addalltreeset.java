
import java.util.TreeSet;
public class addalltreeset {
    public static void main(String args[]){
        TreeSet<String>al=new TreeSet<String>();
        TreeSet<String>al1=new TreeSet<String>();
        al.add("b");
        al.add("a");
        al.add("v");
        al.add("a");
        al1.add("p");
        al1.add("o");
        al1.add("o");       

System.out.println(al.addAll(al1));
System.out.println("TreeSet "+al+" "+al1);
System.out.println(" "+al);
    }
}
