package Day3Assinment;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr=new int[] {2,4,6,5,7,8,5,4,3,11,55,2,33,22,11};
			int num=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(i%2==0)
				{
					num=arr[i];
					
					System.out.println(num);
				}
							
			}
			
	}

}
