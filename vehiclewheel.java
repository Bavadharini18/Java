import java.util.*;
class vehiclewheel
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int veh=obj.nextInt();
        int whe=obj.nextInt();
        int two=((4*veh)-whe)/2;
        int four=veh-two;
        System.out.println(two+" "+four);
    }
}