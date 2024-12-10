public class Algorithms {

    /**
     * Performs a binary search on a sorted array.
     * @param array A sorted array of integers.
     * @param target The integer to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
