import java.util.*;
class vehicle
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int dis=obj.nextInt();
        int count1=0,n=0;
        char x1=obj.next().charAt(0);
        char x2=obj.next().charAt(0);
        int a1=obj.nextInt();
        int a2=obj.nextInt();
        for(char c=x1;c<=x2;c++)
        {
            count1++;
        }
        for(int i=a1;i<=a2;i++)
        {
            n++;
        }
        int len1=count1*count1;
        int len2=n+n+(n-1)+(n-1);
        int sol=len1*len2*dis;
        System.out.println(sol);

    }
}