public class Day1{
  public static void main(String args[]){
    int array[] = {0,1,2,1,0,2,1,0};
    int n = array.length;
    int start = 0, end = n-1;
    for(int i=0; i<n; i++){
      if(array[i]==0){
        array[i]=array[i]+array[start];
        array[start]=array[i]-array[start];
        array[i]=array[i]-array[start];
        start++;
      }
    }

     for(int i=0; i<n; i++){
      if(array[i]==2){
        array[i]=array[i]+array[end];
        array[end]=array[i]-array[end];
        array[i]=array[i]-array[end];
        end--;
      }
    }

    for(int i=0;i<n-1;i++){
      System.out.print(array[i]+", ");
    }
    System.out.print(array[n-1]);
  }
}
