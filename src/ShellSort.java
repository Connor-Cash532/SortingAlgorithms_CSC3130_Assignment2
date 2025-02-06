public class ShellSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int temp = 0;
        for(int gap = n / 2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i++){
                temp = input[i];
                int j = i;
                for(j = i; j >= gap && temp < input[j - gap]; j-=gap){
                    input[j] = input[j-gap];
                }
                input[j] = temp;
            }
        }
        return input;
    }

    @Override
    public String toString() {
        return "Sorting Algorithm - Shell Sort";
    }
}
