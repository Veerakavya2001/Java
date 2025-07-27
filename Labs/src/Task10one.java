import java.util.Scanner;

public class Task10one {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int sum=0;
		int min=arr[0];
		int max =arr[0];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter array values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			if (arr[i] < min) 
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
			
		}
		System.out.println("Average: " + (sum/10.0));
		System.out.println("Min: " + min + ", Max: " + max);
		
		
		
	}

}
