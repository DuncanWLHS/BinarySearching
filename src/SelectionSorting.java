public class SelectionSorting {

    public static void main(String[] args) {
        int[] listToSort = {7, 8, 5, 4, 9, 2};
        System.out.println("Original List");
        for (int n : listToSort) {
            System.out.print(n + " ");
        }

        selectionSort((listToSort));
        System.out.println("\nSorted list");
        for (int n : listToSort) {
            System.out.print(n + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length -1; i ++) {
            int minIndex = i;
            for (int j = i = 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap here
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
