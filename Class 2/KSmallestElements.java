
public class KSmallestElements {
  public static void kElements(int arr[], int k) {
    for (int i = k; i < arr.length; i++) {
      int currElement = arr[k];
      int max = arr[k-1];
      int maxPosition = k-1;
      for (int reverseIdx = k-2; reverseIdx >= 0; reverseIdx--) {
        if (arr[reverseIdx] > max) {
          max = arr[reverseIdx];
          maxPosition = reverseIdx;
        }
      }

      if (currElement < max) {
        while (maxPosition < k-1) {
          arr[maxPosition] = arr[maxPosition + 1];
          maxPosition++;
        } 
        arr[k-1] = currElement;
      }
    }

    for (int i = 0; i < k; i++) {
      System.out.print(arr[k] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {50,25,100,200,30};
    kElements(arr, 2);
  }
}
