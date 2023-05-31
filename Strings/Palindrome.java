
public class Palindrome {
    // public static boolean isPalindrome(String str) {
    // for (int i = 0; i < str.length() / 2; i++) {
    // int n = str.length();
    // if (str.charAt(i) != str.charAt(n - 1 - i)) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static void main(String arrgs[]) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right])
                left++;
            else if (height[left] > height[right])
                right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0, n = height.length;
        int left = 0, right = n - 1;
        int vol = 0;

        while (left < right) {
            vol = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(vol, max);
            if (height[left] < height[right])
                left++;
            else if (height[right] < height[left])
                right--;
            else {
                left++;
                right--;
            }
        }

        return max;
    }
}