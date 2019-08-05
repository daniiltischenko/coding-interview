package leetcode;

public class Task_852_Peak_Index_in_a_Mountain_Array {

  public static void main(String[] args) {
    System.out.println(peakIndexInMountainArray(new int[]{0,1,0}) == 1);
    System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}) == 1);
  }

  static int peakIndexInMountainArray(int[] A) {

    for (int i = 1; i < A.length; i++) {
      if (A[i] > A[i-1] && A[i] > A[i+1]) {
        return i;
      }
    }

    return -1;
  }

}
