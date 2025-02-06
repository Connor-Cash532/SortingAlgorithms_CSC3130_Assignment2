import java.util.*;
import java.util.concurrent.TimeUnit;

public class Tester {
    private SortingAlgorithm sa;
    public Tester(SortingAlgorithm sa){
        this.sa = sa;
    }

    public double singleTest(int size){
        Random rand = new Random();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(size);
        }
        long startTime = System.currentTimeMillis();
        sa.sorty(nums);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public double kSortedSingleTest(int size){
        KSort k1 = new KSort();
        Random rand = new Random();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(size);
        }
        k1.generateKSort(nums, 10);
        long startTime = System.currentTimeMillis();
        sa.sorty(nums);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public void kSortedTest(int iterations, int size){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += kSortedSingleTest(size);
        }
        double average = total / (iterations * 1.0);
        System.out.println(average + " ms (avg) for k-sorted data where k = 10");
    }
    public void test(int iterations, int size){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += singleTest(size);
        }
        double average = total / (iterations * 1.0);
        System.out.println(average + " ms (avg)");
    }
    public SortingAlgorithm getSa() {
        return sa;
    }

    public void setSa(SortingAlgorithm sa) {
        this.sa = sa;
    }


}
