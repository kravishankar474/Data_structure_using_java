package Arrays;

public class OnedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int brr[] = {6,7,8,9,10};
		int crr[] = new int[brr.length];
		for(int i=0; i<crr.length; i++)
		{
			crr[i]  = arr[i]+brr[i];
			System.out.print(crr[i]+" ");
		}

	}

}
