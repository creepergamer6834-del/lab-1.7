public class ArrayOps {

    // Read REQ 02
    public String toText(int[] nums) {
        String result = "[";

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            result += nums[i];
            if ((i + 1 < n)) {
                result += ", ";
            }
        }

        return result + "]";
    }

    // Read REQ 03
    public int[] numbersFrom(int start, int end) {
        int num1 = end - start;

        if (num1 <= 0) {
            return new int[0];
        }

        int[] num = new int[num1];

        for (int i = 0; i < num.length; i++) {
            num[i] = start + i;
        }

        return num;
    }

    // Read REQ 04
    public double averageLength(String[] words) {
        if (words.length == 0) {
            return 0.0;
        }

        double result = 0.0;

        for (int i = 0; i < words.length; i++) {
            result += words[i].length();
        }

        return result / words.length;
    }

    // Read REQ 05
    public boolean hasWord(String[] words, String target) {
        int length = words.length;

        boolean result = false;

        for (int i = 0; i < length; i++) {
            String currentWord = words[i];
            if (currentWord.equals(target)) {
                result = true;
            }
        }

        return result;
    }

    // Read REQ 06
    public int indexOfLongest(String[] words) {
        if (words.length == 0) {
            return -1;
        }

        int longestIndex = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[longestIndex].length()) {
                longestIndex = i;
            }
        }

        return longestIndex;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }

        return result;
    }

    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = 0;

        return nums;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }

    public boolean hasMatchingEnds(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }

        return true;
    }

    public int sumSkipping13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }

        return sum;
    }
}