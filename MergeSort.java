public class MergeSort {


    static void merge(int[] arr, int left, int mid, int right) { //3 8 7 1 2, 0, 0, 1
        int n1 = mid - left + 1; //1
        int n2 = right - mid; //1

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i]; //3
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j]; //8

        int i = 0, j = 0, k = left; //0, 0, 0

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; 
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) { //3 8
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    static void mergeSort(int[] arr, int left, int right) { //3 8 7 1 2, 0, 1
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid); //3 8 7 1 2, 0, 1
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right); //3 8 7 1 2, 0, 0, 1
        }
    }


    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
            int[] arr = {3, 8, 7, 1, 2};
            System.out.println("Original array:");
            printArray(arr);
    
            mergeSort(arr, 0, arr.length - 1);
    
            System.out.println("\nSorted array:");
            printArray(arr);
    }
}
