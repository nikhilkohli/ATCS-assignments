package assignments;

public class binarysearch {

	public static void main(String[] args) {
		 int arr[] = {10,20,30,40,50};  
	     int key = 50;
	     
	     int first = 0;
	     int last = arr.length-1;
	     int mid = (first + last)/2;  
	     
	     while( first <= last )
	     {  
	        if ( arr[mid] < key )
	        {  
	          first = mid + 1;     
	        }
	        else if (arr[mid] > key)
	        {  
	           last = mid - 1;  
	        } 
	        else if( arr[mid] == key )
	        {  
	          System.out.println("Element is found: "+arr[mid] +" at position "+ mid);  
	          break;  
	        }
	         
	        mid = (first + last)/2;  
	     }  
	     if ( first > last ){  
	        System.out.println("Element is not found!");  
	     }  

	}

}
