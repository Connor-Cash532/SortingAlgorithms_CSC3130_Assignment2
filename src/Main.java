import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            BubbleSort b1 = new BubbleSort();
            InsertionSort i1 = new InsertionSort();
            QuickSort q1 = new QuickSort();
            SelectionSort s1 = new SelectionSort();
            ShellSort sh1 = new ShellSort();
            MergeSort m1 = new MergeSort();
            int[] nums = {3,2,5,6,10,-5,-9};
            int[] nums2 = {3,2,5,6,10,-4};
            nums = m1.sorty(nums);
            nums2 = m1.sorty(nums2);
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(nums2));

            Tester t1 = new Tester(b1);
            Tester t2 = new Tester(m1);
            Tester t3 = new Tester(q1);
            t1.test(5,20000);
            t2.test(5,20000);
            t3.test(5,20000);


    }
}