import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(4);
        numList.add(25);
        numList.add(2);
        numList.add(14);
        numList.add(87);
        numList.add(56);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        int location = binarySearch(numList, 25);
        System.out.println("The Index of the target is " + location);
    }

    public static int calculateMedian(ArrayList<Integer> list, int low, int high) {
        int length = high - low + 1;
         int median = low + length / 2;
         if (length % 2 == 0) {
            return (list.get(median) + list.get(median - 1)) / 2;
         } else {
             return list.get(median);
         }
    }

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {

            int median = list.indexOf(calculateMedian(list, low, high)); //median can be found by (low + high) / 2;

            if (list.get(median) == target) {
                return median;
            }
            else if (list.get(median) < target) {
                low = median + 1;
            } else {
                high = median - 1;
            }
        }
        return -1;
    }
}