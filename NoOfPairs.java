import java.util.Scanner;

public class NoOfPairs {
	static void check(int[] arr,int r) {
		int p = 0;
		int q=0;
		int t=0;
		for(int i=0;i<arr.length;i++) {
			p=arr[i];
			for (int j=i;j<arr.length;j++) {
				q=arr[j];
				if (p*q==r) {
					t++;
				}
			}
		}
		System.out.println("Posssible pairs are: "+t);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter " + n + " Numbers: ");
		int [] arr = new int [n];
		int i=0;
		  while(i<n)
		    {
		        arr[i] = sc.nextInt();
		        i++;
		    }
		System.out.print("Enter the Product: ");
		int r = sc.nextInt();
		check(arr,r);
}
}
