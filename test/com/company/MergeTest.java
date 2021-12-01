package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MergeTest {
    int[] arr1 = {1,4,6,8,9,12,35};
    int[] arr2 = {2,4,6,23,456,1234};
    int[] arr3 = {15,42,67,231,900,1212,3005};
    int[] arr4 = {};
    int[] arr = {1,4,6,8,9,12,15,35,42,67,231,900,1212,3005};

    @Test
    void evenTest() {
        System.out.println(arr.length/2);
        assertEquals(Merge.findMedianSortedArrays(arr1,arr3),25);
    }

    @Test
    void oddTest() {
        assertEquals(Merge.findMedianSortedArrays(arr4, arr3), 8);

    }
    @Test
    void emptyTestRight() {
        assertEquals(Merge.findMedianSortedArrays(arr4,arr1),8);
    }

    @Test
    void emptyTestLeft() {
        assertEquals(Merge.findMedianSortedArrays(arr1,arr4),8);
    }

}