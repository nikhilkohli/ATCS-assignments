package assignments;

public class Searching {

	public static void main(String[] args) {
		int arr[] = {34,56,78,23,45};
		 int key = 45;
		 boolean flag = false;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==key)
			 {
				 System.out.println("element found " + arr[i]+ " at position "+i);
				 flag=true;
				 break;
			 }
			 
		 }
		 if(flag==false)
		 {
			 System.out.println("element not found");
		 }

	}

}
