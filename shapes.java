import java.util.*;
class area1{
    static int area(int l,int b){
        return l*b;
    }
    static int area(int l,int b,int h){
        return l*b*h;
    }
    class shapes{
        public static void main(String[] args){
            System.out.println(area1.area(11,11));
            System.out.println(area1.area(11,12,13));
        }
    }
}
//type promotion