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
        System.out.println(location);
    }

    public static int calculateMedian(ArrayList<Integer> list, int left, int right) {
        int length = right - left + 1;
         int median = left + length / 2;
         if (length % 2 == 0) {
            return (list.get(median) + list.get(median - 1)) / 2;
         } else {
             return list.get(median);
         }
    }

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {

            int median = list.indexOf(calculateMedian(list, left, right));

            if (list.get(median) == target) {
                return median;
            }
            else if (list.get(median) < target) {
                left = median + 1;
            } else {
                right = median - 1;
            }
        }
        return -1;
    }
}