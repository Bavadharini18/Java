import java.util.*;

class house {

static void minCost(int costs[][], int N)
{
	int amt[][] = new int[N][3];
	amt[0][0] = costs[0][0];
	amt[0][1] = costs[0][1];
	amt[0][2] = costs[0][2];

	for (int i=1;i<N;i++){
	amt[i][0] = Math.min(amt[i-1][1],amt[i-1][2])+ costs[i][0];
	amt[i][1] = Math.min(amt[i-1][0],amt[i-1][2])+ costs[i][1];
	amt[i][2] = Math.min(amt[i-1][0],amt[i-1][1])+ costs[i][2];
	}
	System.out.println("Minimum Cost of Painting is :" +Math.min(amt[N-1][0],Math.min(amt[N-1][1],amt[N-1][2])));
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number of Houses :");
	int n=sc.nextInt();
	if(n==0){
		System.out.println("NO COST");
	}
	else{
	System.out.println("Enter the cost of Painting Each houses");
	int costs[][] = new int[n][3];
	for(int i=0;i<n;i++){
		for(int j=0;j<3;j++){
			costs[i][j]=sc.nextInt();
		}
	}
	minCost(costs,n);
}
}
}