public class InsertionSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        int temp = 0;

        for(int i = 1; i < input.length; i++){
            temp = input[i];
            int j = i;
            for(j = i; j > 0 && temp < input[j-1]; j--){
                input[j] = input[j-1];
            }
            input[j] = temp;
        }
        return input;
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Insertion Sort";
    }
}
