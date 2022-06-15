package com.example.demo.other.promotion.facade;

import org.junit.Test;

/**
 * @author mxl
 * @version 1.0
 * @created 2021/5/9.
 */
public class Algorithm {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        String result = null;
        for (int index = 0; index<chars.length;index++) {
            int tempCount = 0;
            int left = index;
            int right = index;
            while (left <= right && right<chars.length && left >= 0){
                tempCount++;
                if (chars[left] == chars[right]) {
                    left--;
                    right++;
                    continue;
                }
                break;
            }
            if (tempCount > count){
                result = s.substring(++left, right);
                count = tempCount;
            }
        }
        return result;
    }

    @Test
    public void test(){
        String s = "cbbd";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }
}