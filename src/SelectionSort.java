public class SelectionSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        int temp = 0;
        for(int i = 0; i < input.length - 1; i++){
            int minimum = i;
            for(int j = i + 1; j < input.length; j++){
                if(input[j] < input[minimum])
                    minimum = j;
            }
            temp = input[minimum];
            input[minimum] = input[i];
            input[i] = temp;
        }
        return input;
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Selection Sort";
    }
}
