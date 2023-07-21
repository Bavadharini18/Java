import java.util.*;
public class hashmap {
    public static void main(String args[]){
        HashMap<String,Integer>empids=new HashMap<>();
        empids.put("bava",12345);
        empids.put("poo",120406);
        empids.put("kavi",34567);

        System.out.println(empids);

        System.out.println(empids.get("bava"));
    }
}
