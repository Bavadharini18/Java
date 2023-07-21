import java.util.*;
public class doctor {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int fees=0;
        int patients=sc.nextInt();
        while(patients>0){
            int age=sc.nextInt();
        if(age<17){
              fees+=200;
        }
        else if(age>=17 && age<=40){
             fees+=400;
        }
        else{
            fees+=300;
        }
    System.out.println(fees);
    }

}
}
