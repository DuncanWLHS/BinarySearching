public class InsertionSorting {

    public static void main(String[] args) {
        int[] listToSort = {7, 8, 5, 4, 9, 2};
        System.out.println("Original List");
        for (int n : listToSort) {
            System.out.print(n + " ");
        }

        insertionSort((listToSort));
        System.out.println("\nSorted list");
        for (int n : listToSort) {
            System.out.print(n + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }
}
