class sorting{
    public static void printer(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        // int small =0;
        int arr[] = {7,8,3,1,2};


        for(int i=0;i<arr.length-1;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && arr[current] < arr[j]) {
                arr[j+1]=arr[j];
                printer(arr);
                j--;
            }
            //placement
            // int temp = arr[small];
            arr[j+1]= arr[current];
            // arr[i]=temp;
        }
        printer(arr);
    }
}