public class Minimum{
  public static void main(String[] args) {
    findMin();
  }

  public static void findMin(){
    int[] arr = new int[]{60, 5, 74, 32, 1, 90, 45, 103, 6, 55, 21};
    int min = arr[0];
    int minTwo = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i]<min){
        min = arr[i];
      }
    }

    for (int j = 1; j < arr.length; j++) {
      if (arr[j] < minTwo && min < arr[j]) {
        minTwo = arr[j];
      }
    }

    System.out.println("Minimum: " + min);
    System.out.println("Second Minimum: " + minTwo);
}
}
