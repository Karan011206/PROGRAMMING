public class QuickSort {
    public static void Quicksort(int Arr[], int low ,int high)
    {
        if (low<high){
            int pi = partition(Arr,low ,high);
Quicksort(Arr, low, pi-1);
Quicksort(Arr,pi+1,high);
    

        }

    }

    private static int partition(int Arr[], int low, int high)
    {
        int pivot = Arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (Arr[j] <= pivot) {
                i++;
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        }
        int temp = Arr[i + 1];
        Arr[i + 1] = Arr[high];
        Arr[high] = temp;
        return i + 1;
    }

}
