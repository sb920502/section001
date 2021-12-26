package com.program005;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\ntarget = ");
        int target = scanner.nextInt();
        Solution solution = new Solution();
        int[] r = solution.twoSum(nums, target);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
            if (i < r.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
