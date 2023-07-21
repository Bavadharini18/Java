
/* 1.Print an integer representing the total sales value of the two highest selling 
products on the Website.
Constraints
2 ≤ numProducts ≤ 106
Note
More than one product can have a similar sales value.
Example
Input
5
15 26 13 7 45
Output
71*/

import java.util.*;

class sortcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

Arrays.sort(arr);   
System.out.println(arr[n-1]+arr[n-2]);   
}   
}

