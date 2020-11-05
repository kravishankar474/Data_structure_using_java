package Arrays;

public class JaggedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},
				{4,5},
				{1,2,3}};
int brr[][] = {{1,2,3},
		{4,5},
		{1,2,3}};
int r,c;
r = arr.length;
c = arr[0].length;
int crr[][] = new int [r][c];
for(int i=0; i<crr.length; i++)
{c= arr[i].length;
	for(int j=0; j<c; j++)
	{
		crr[i][j] = arr[i][j] + brr[i][j];
		System.out.print(crr[i][j]+" ");
	}
	System.out.println();
}


	}

}
