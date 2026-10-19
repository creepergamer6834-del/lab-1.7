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
        int[] num = new int[num1];
        int length = num.length;
        int[] a = new int[1];
        if (num1 <= 0) {
            return a;
        }
        for (int i = 0; i < length; i++) {
            num[i] += i + start;
        }
        return num;
    }

    // Read REQ 04
    public double averageLength(String[] words) {
        int length = words.length;
        double result = 0.0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            int word = words[i].length();
            counter++;
            result += word;
        }
        result /= counter;
        return result;
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
        return -999;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        return false;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        return null;
    }

    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        return null;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        return null;
    }
}