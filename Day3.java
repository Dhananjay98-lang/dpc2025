public class Day3{
	public static void main(String args[]){
		int array[] = {1,2,3,4,1,5,6};
		int n = array.length-1;
		int expected = (n*(n+1))/2;
		int arr_sum = 0;
		for(int i = 0; i < array.length;i++){
			arr_sum = arr_sum + array[i];
		}
		int duplicate = arr_sum - expected;
		System.out.println(duplicate);
	}
}
