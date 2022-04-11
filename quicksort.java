public class quicksort {
    public static void sort(int arr[], int low, int high) {
        if (low<high){
            int pivx = partition(arr,low,high);
            sort(arr, low, pivx-1);
            sort(arr, pivx+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,7,3654,32,34,87};
        int n = arr.length;
        sort(arr, 0, n-1);
        

        //print
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
