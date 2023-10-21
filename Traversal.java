/* operatipn on array (TRAVERSAL) */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner back = new Scanner(System.in);
		int[] list = new int[10];
		int n;
		int i, neg = 0, zero = 0, pos = 0;
		
		System.out.println("enter the size of the list:");
		n = back.nextInt();
		System.out.println("enter the elements one by one");
		
		for(i=0; i<n; i++) {
		    System.out.println("Enter number" + i);
		    list[i] = back.nextInt();
		}
		
		for(i=0; i<n; i++){
		    if(list[i]<0)
		    neg=neg+1;
		    
		    else 
		            if(list[i]==0)
		               zero=zero+1;
		           else
		               pos=pos+1;
		    }
		    System.out.println("No of Negative numbers in given list are:" + neg);
		    System.out.println("No of Zero in given list are:" + zero);
		    System.out.println("No of Positive numbers in given list are:" + pos);
		
	}
}