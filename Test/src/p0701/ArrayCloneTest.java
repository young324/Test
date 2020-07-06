package p0701;

public class ArrayCloneTest {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 arr2배열 : ");
		
		for(int num : arr2) {
			System.out.println(num + " ");
		}
		System.out.println("");
		
		System.out.println("arr2의 요소값 변경");
		arr2[2]=0;
		for(int num : arr2) {
			System.out.println(num + " ");
		}
		System.out.println("");

		System.out.print("본체 arr");
		System.out.println("");
		for(int num : arr1) {
			System.out.println(num + " ");
		}
	}

}
