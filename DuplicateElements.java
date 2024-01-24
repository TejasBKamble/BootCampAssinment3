package Day3Assinment;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr=new int[] {2,4,6,5,7,4,6,2,2,6};
	        int num;
			
			for(int j=0;j<arr.length;j++)
			{		
				num=arr[j];
			for(int i=0;i<arr.length;i++)
			{
				if(num==arr[i])
				{
					System.out.print(" "+num);
				}
			}		
			
			}
	}

}
