public class Sort {
    public static int[] Sort1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] Sort2(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length - 1; i++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] Sort3(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while(arr[j] > temp && j >= 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,-2,7,15,3,4,1,9};
        printArr(Sort1(arr));
        printArr(Sort2(arr));
        printArr(Sort3(arr));
    }
}
