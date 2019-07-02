package leetcode.arrays.third_maximum_number;

import java.util.Arrays;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(thirdMax(new int[]{3, 2, 1}));
    System.out.println(thirdMax(new int[]{1, 2}));
    System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
    System.out.println(thirdMax(new int[]{1, 2, -2147483648}));
    System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));
    System.out.println(thirdMax(new int[]{1,-2147483648,2}));
  }

  static int thirdMax(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }

    Arrays.sort(nums);

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int thirdMax = Integer.MIN_VALUE;
    boolean thirdSet = false;

    for (int i = nums.length-1; i >= 0; i--) {
      if (nums[i] >= max) {
        max = nums[i];
      }

      if (nums[i] >= secondMax && nums[i] < max) {
        secondMax = nums[i];
      }

      if (nums[i] >= thirdMax && nums[i] < secondMax) {
        thirdMax = nums[i];
        thirdSet = true;
      }
    }

    return thirdSet ? thirdMax : max;
  }

  static int thirdMax01(int[] nums){
    long max1=Long.MIN_VALUE;
    long max2=Long.MIN_VALUE;
    long max3=Long.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]>max1)
      {
        max3=max2;
        max2=max1;
        max1=nums[i];
      }
      else if(nums[i]>max2 && nums[i]<max1)
      {
        max3=max2;
        max2=nums[i];
      }
      else if(nums[i]>max3 && nums[i]<max2)
      {
        max3=nums[i];
      }
    }
    return ((max3==Long.MIN_VALUE||max3==max2)?(int)max1:(int)max3);
  }

}
