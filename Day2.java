public class Day2{
	public static void main(String args[]){
		int array[] = {1,2,3,5,6};
		int n = array.length+1;
		int total_sum = (n*(n+1))/2;
		int arr_sum = 0;
		for(int i = 0; i < array.length;i++){
			arr_sum = arr_sum + array[i];
		}
		int missing = total_sum - arr_sum;
		System.out.println(missing);
	}
}
