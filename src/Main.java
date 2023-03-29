import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }

    //    task 1
//
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
//    non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters
//    include letters and numbers.
//
//    Given a string s, return true if it is a palindrome, or false otherwise.
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    //    Task 2
//
//    Given an integer array nums, return true if any value appears at least twice in the array,
//    and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> objects = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (objects.contains(nums[i])) {
                return true;
            } else {
                objects.add(nums[i]);
            }
        }
        return false;
    }
    //    task 3
//
//    Given an array of integers nums and an integer target, 
//    return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[]{i, j};
            }
        }
        return null;
    }
}




