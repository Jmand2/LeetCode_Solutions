package com.company;

public class Merge {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int pointer1 = 0, pointer2 = 0, pointer3 = 0;
        int[] nums3 = new int[nums1.length + nums2.length];

        while(pointer1 < nums1.length && pointer2 < nums2.length){

            if(nums1[pointer1] <= nums2[pointer2]){
                nums3[pointer3] = nums1[pointer1];
                pointer1++;
            }
            else{
                nums3[pointer3] = nums2[pointer2];
                pointer2++;
            }
            pointer3++;
        }

        while (pointer1 < nums1.length) {
            nums3[pointer3] = nums1[pointer1];
            pointer1++;
            pointer3++;
        }

        while (pointer2 < nums2.length) {
            nums3[pointer3] = nums2[pointer2];
            pointer2++;
            pointer3++;
        }

        if(nums3.length % 2 == 0)
            return (double) (nums3[nums3.length / 2] + nums3[(nums3.length / 2) + 1]) / 2;
        return nums3[nums3.length / 2];
    }


    public static void main(String[] args) {
        int[] arr1 = {1,4,6,8,9,12,35};
        int[] arr2 = {2,4,6,23,456,1234};
        System.out.println(findMedianSortedArrays(arr2, arr1));
    }
}