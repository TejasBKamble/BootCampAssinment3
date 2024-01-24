package Day3Assinment;

public class LargestElementArray {

	public static void main(String[] args) {
		
        int[] arr=new int[] {2,4,6,5,7,8,5,4,3,11,55,2,33,22,11};
		int num=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=num)
			{
				num=arr[i];
			}
			
		}
		System.out.println(num);


	}

}
