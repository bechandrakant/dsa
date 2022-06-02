package Arrays.PrefixSum;

public class PrefixSum {
    /**
     * Given array and Q queries L -> R,
     * find sum of all index from L -> R
     */
    public int[] sumLtoR(int[] arr, int[][] queries) {
        // Idea: prefix sum
        // TC: O(max(arr.length, queries.length))
        int[] result = new int[queries.length];
        int[] prefixSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            } else {
                prefixSum[i] = arr[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            // Logic
            int sum = prefixSum[right] - prefixSum[left] + arr[left];
            result[i] = sum;
        }

        return result;
    }

    /**
     * Given array and Q queries {L, R, X}
     * find sum of all index from L -> R
     */
    public int[] addXfromLtoR(int[] arr, int[][] queries) {
        // Brute force: for each query from L -> R add X
        // TC: queries.length * O(arr.length)

        // Idea: prefix sum
        // TC: O(arr.length + queries.length)
        // start with all zeroes
        int[] prefixSum = new int[arr.length];
        // For each query
        // add X to prefixSum[left]
        // add -X to prefixSum[right + 1]
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int X = queries[i][2];
            prefixSum[left] += X;
            if (right < arr.length - 1) {
                prefixSum[right + 1] -= X;
            }
        }

        // calculate prefixSum
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }

        // Add with original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] += prefixSum[i];
        }

        return arr;
    }

    /**
     * Given an array, find leftMax to ith position
     * @param arr
     * @return leftMax array
     */
    public int[] leftMax(int[] arr) {
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        return leftMax;
    }

    /**
     * Given an array, find rightMax to ith position
     * @param arr
     * @return rightMax array
     */
    public int[] rightMax(int[] arr) {
        int[] rightMax = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        return rightMax;
    }

    /**
     * Given a string with lowercase alphabets,
     * how many pairs (i, j) exists such that
     * i < j, word[i] = a, word[j] = g
     * @param word
     * @return
     */
    public int countOfAGPairs(String word) {
        int countOfG = 0;
        int totalPair = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) == 'g') {
                countOfG++;
            } else if (word.charAt(i) == 'a') {
                totalPair += countOfG;
            }
        }
        return totalPair;
    }

    /**
     * Find length of smallest subaaray which
     * contains both min and max of array
     */
    public int closestMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: arr) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        if (max == min) return 1;

        int maxIndex = 2 * arr.length;
        int minIndex = 2 * arr.length;
        int smallestLength = arr.length;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                smallestLength = Math.min(smallestLength, maxIndex - i + 1);
                minIndex = i;
            } else if (arr[i] == max) {
                smallestLength = Math.min(smallestLength, minIndex - i + 1);
                maxIndex = i;
            }
        }

        return smallestLength;
    }

    /**
     * Find count of equilibrium index of array
     * sum of elements before i = sum of elements after i
     */
    public int findCountOfEquilibriumIndex(int[] arr) {
        // sum of elements before i  + arr[i] = sum of elements after i + arr[i]
        // prefixSum[i] = prefixSum[arr.length - 1] - prefixSum[i] + arr[i]
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( prefixSum[i] == prefixSum[arr.length - 1] - prefixSum[i] + arr[i]) {
                count++;
            }
        }

        return count;
    }

    /**
     * Count of elements if removed,
     * sum of odd index nums == sum of even index nums
     */
    public int fairArray(int[] arr) {
        int[] prefixOddSum = new int[arr.length];
        int[] prefixEvenSum = new int[arr.length];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
            prefixEvenSum[i] = evenSum;
            prefixOddSum[i] = oddSum;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                oddSum = prefixEvenSum[arr.length - 1] - arr[0];
                evenSum = prefixOddSum[arr.length - 1];
            } else {
                oddSum = prefixOddSum[i - 1] + prefixEvenSum[arr.length - 1] - prefixEvenSum[i];
                evenSum = prefixEvenSum[i - 1] + prefixOddSum[arr.length - 1] - prefixOddSum[i];
            }
            if (evenSum == oddSum) count++;
        }

        return count;
    }

}
