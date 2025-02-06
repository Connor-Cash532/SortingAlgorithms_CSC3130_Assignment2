public class BubbleSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        int temp = 0;
        for(int i = 0; i < input.length - 1; i++){
            for(int j = 0; j < input.length - 1 - i; j++){
                if(input[j+1] < input[j]){
                    swap(i,j,input);
                }
            }
        }

        return input;
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = temp;
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Bubble Sort";
    }
}
