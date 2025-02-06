public class KSort {
    public int[] generateKSort(int[] input, int k){
        int n = input.length;
        int temp = 0;
        for(int gap = n / 2; gap > 0 && gap >= k; gap /= 2){
            for(int i = gap; i < n; i++){
                temp = input[i];
                int j = i;
                for(j = i; j >= gap && temp < input[j - gap] && j >= k; j-=gap){
                    input[j] = input[j-gap];
                }
                input[j] = temp;
            }
        }
        return input;
    }
}
