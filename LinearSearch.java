import java.util.*;
public class LinearSearch
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of elements");
	    int n = sc.nextInt();
		
		int arr[] = new int[n]; 
		System.out.println("Enter elements of array");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter key");
	    int k = sc.nextInt();
	 
	    int flag=0,index=0;
    	for(int i=0; i<n; i++){
    		if(k == arr[i]){
    		    flag=1;
    		    index=i;
    		}
	    }
	    
	    if(flag==1){
	        System.out.println("key found at index "+index);

	    }else{
	        System.out.println("key not found");
	    }
	}
}