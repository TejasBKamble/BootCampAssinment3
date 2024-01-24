package Day3Assinment;



public class SecontLargest {
	
	public static int findSecondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for (int num : arr) {

	    	if (num > largest) {
	    		
	            secondLargest = largest;
	            
	            largest = num;
	        }
	        
	        else if (num > secondLargest) {
	            secondLargest = num;
	        }
	    }

	    return secondLargest;
	}
	

	public static void main(String[] args) {

	     int[] arr=new int[] {2,4,6,5,7,8,5,4,3,11,55,2,33,22,11};

	        System.out.println("The second largest element in arr1 is: " + findSecondLargest(arr));
	}

}
