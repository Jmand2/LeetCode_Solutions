package com.company;

public class IntToRoman {
    public static String intToRoman(int num) {
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] numerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder answer = new StringBuilder();
        for (int i = values.length - 1; i >= 0; i--) {
            if (num >= values[i]) {
                answer.append(numerals[i]);
                num -= values[i];
                i++;
            }
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
}
