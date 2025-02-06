import java.io.FileWriter;
import java.util.Arrays;
import java.io.*;
public class Performance {
    public static void main(String[] args){
        generateReport();
        System.out.println("Random Data");
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        printEntire(new BubbleSort(), sizes);
        printEntire(new QuickSort(), sizes);
        printEntire(new InsertionSort(), sizes);
        printEntire(new SelectionSort(), sizes);
        printEntire(new MergeSort(), sizes);
        printEntire(new ShellSort(), sizes);

        System.out.println("K-Sorted Data");
        printEntireKSorted(new BubbleSort(), sizes);
        printEntireKSorted(new QuickSort(), sizes);
        printEntireKSorted(new InsertionSort(), sizes);
        printEntireKSorted(new SelectionSort(), sizes);
        printEntireKSorted(new MergeSort(), sizes);
        printEntireKSorted(new ShellSort(), sizes);
//        KSort k1 = new KSort();
//        int[] nums = {8,4,5,2,1,6,7,3};
//        nums = k1.generateKSort(nums, 2);
//        System.out.println(Arrays.toString(nums));
    }

    public static void generateReport(){
        try {
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public static void print(SortingAlgorithm sa, int size){
        String s = "";
        Tester t1 = new Tester(sa);
        System.out.print("Sorted " + size + " elements in ");
        t1.test(20, size);
    }

    public static void printKSorted(SortingAlgorithm sa, int size){
        String s = "";
        Tester t1 = new Tester(sa);
        System.out.print("Sorted " + size + " elements in ");
        t1.kSortedTest(20, size);
    }

    public static void printEntire(SortingAlgorithm sa, int[] sizes){
        System.out.println(sa.toString());
        for(int i = 0; i < sizes.length; i++){
            print(sa, sizes[i]);
        }
    }

    public static void printEntireKSorted(SortingAlgorithm sa, int[] sizes){
        System.out.println(sa.toString());
        for(int i = 0; i < sizes.length; i++){
            printKSorted(sa, sizes[i]);
        }
    }
}
