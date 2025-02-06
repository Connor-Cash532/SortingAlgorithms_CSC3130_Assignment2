public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        quickSort(input, 0, input.length-1);
        return input;
    }

    public static int partition(int[] input, int left, int right){
        int midpoint = left + (right - left) / 2;
        int pivot = 0;
        if(input[left] > input[right] && input[left] < input[midpoint])
            pivot = input[left];
        else if(input[right] > input[left] && input[right] < input[midpoint])
            pivot = input[right];
        else
            pivot = input[midpoint];

        int low = left;
        int high = right;

        boolean done = false;
        while (!done) {
            // Increment low while numbers[low] < pivot
            while (input[low] < pivot) {
                low = low + 1;
            }

            // Decrement high while pivot < numbers[high]
            while (pivot < input[high]) {
                high = high - 1;
            }

            // If low and high have crossed each other, the loop
            // is done. If not, the elements are swapped, low is
            // incremented and high is decremented.
            if (low >= high) {
                done = true;
            }
            else {
                int temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                low++;
                high--;
            }
        }

        // "high" is the last index in the left segment.
        return high;
    }


    public static void quickSort(int[] input, int left, int right){
        if (right <= left) {
            return;
        }

        // Partition the array segment
        int high = partition(input, left, right);

        // Recursively sort the left segment
        quickSort(input, left, high);

        // Recursively sort the right segment
        quickSort(input, high + 1, right);
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Quick Sort";
    }
}
