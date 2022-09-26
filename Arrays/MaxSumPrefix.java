package Arrays;

public class MaxSumPrefix {
    public static void maxSubarraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];

        }

        for (int j = 1; j < number.length; j++) {
            int start = j;
            for (int k = j; k < number.length; k++) {
                int end = k;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max Sum  = " + maxSum);

    }

    public static void main(String args[]) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(number);
    }
}
