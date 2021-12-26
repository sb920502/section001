package com.program003;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("jewels = ");
        String jewels = scanner.next();
        System.out.print("stones = ");
        String stones = scanner.next();
        Solution solution = new Solution();
        System.out.print(solution.numJewelsInStones(jewels, stones));
    }
}
