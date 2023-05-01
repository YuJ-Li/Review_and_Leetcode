package Algorithms.Sorting.bubble_sort;
/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in
the wrong order. Bubble Sort is not suitable for large data sets as its average and worst time complexity is high.

Time Complexity: O(N^2)
 */
public class bubble_sort {
    /**
     * bubble sort in ascending order, assuming all inputs are int
     * @param arr the input integer array
     */
    public static void asc_bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    //swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * bubble sort in descending order, assuming all inputs are int
     * @param arr the input integer array
     */
    public static void des_bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j] < arr[j+1]){
                    //swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        System.out.print("The unsorted array: ");
        printArray(arr);
        asc_bubbleSort(arr);
        System.out.print("The sorted array in ascending order: ");
        printArray(arr);
        des_bubbleSort(arr);
        System.out.print("The sorted array in descending order: ");
        printArray(arr);
    }
}