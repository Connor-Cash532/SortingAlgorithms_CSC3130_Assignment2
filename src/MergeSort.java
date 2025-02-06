public class MergeSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length-1);
        return input;
    }

    public void mergeSort(int[] input, int left, int right){
        if(left < right){
            int middle = left + (right - left) / 2;

            mergeSort(input, left, middle);
            mergeSort(input, middle + 1, right);

            merge(input, left, middle, right);
        }
    }

    public int[] merge(int[] input, int left, int middle, int right){
        int[] arrayOne = new int[middle - left + 1];
        int[] arrayTwo = new int[right - middle];

        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = input[left + i];
        }
        for(int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = input[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < middle - left + 1 && j < right - middle) {
            if (arrayOne[i] <= arrayTwo[j]) {
                input[k] = arrayOne[i];
                i++;
            }
            else {
                input[k] = arrayTwo[j];
                j++;
            }
            k++;
        }
        while (i < middle - left + 1) {
            input[k] = arrayOne[i];
            i++;
            k++;
        }
        while(j < right - middle){
            input[k] = arrayTwo[j];
            j++;
            k++;
        }
        return input;
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Merge Sort";
    }
}
