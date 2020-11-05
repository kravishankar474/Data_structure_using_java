package Arrays;

public class TwodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},
						{4,5,6}};
		int brr[][] = {{1,2,3},
				{4,5,6}};
		int crr[][] = new int [arr.length][arr[0].length];
		for(int i=0; i<crr.length; i++)
		{
			for(int j=0; j<crr[i].length; j++)
			{
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
