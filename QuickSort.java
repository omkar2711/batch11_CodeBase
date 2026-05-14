public class QuickSort {

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;

        System.out.println("Original array:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, n-1);

        System.out.println("Sorted array:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
