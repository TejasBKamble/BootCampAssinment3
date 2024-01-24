package Day3Assinment;

public class ElementFequency {

	public static void main(String[] args) {
		
        int[] arr=new int[] {2,4,6,5,7,4,6,2,2,6};
        int count=0,num;
		
		for(int j=0;j<arr.length;j++)
		{		
			num=arr[j];
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				count++;
			}
		}
		
		System.out.println(arr[j]+" = "+count);
		count=0;
		}

	}

}
