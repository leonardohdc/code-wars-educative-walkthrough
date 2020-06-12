package exercises8Kyu;

public class ArrayPlusArray {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int sumArr1 = 0;
		int sumArr2 = 0;
		for(int i : arr1)
		{
			sumArr1 += i;
		}
		
		for(int i : arr2)
		{
			sumArr2 += i;
		}
		return sumArr1 + sumArr2;
	}
}
