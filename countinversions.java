import java.util.*;

class countinversions{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
		int inversioncount = 0;
        int n=arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j])
					inversioncount++;
		System.out.println("Number of inversions are "
						+ inversioncount);
	}
}

