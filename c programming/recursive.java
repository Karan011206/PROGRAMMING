public class recursive {
  public static int BinarySearch(int arr[], int low, int high,int target)
  {
    if(low>high)
    {
        return -1;
    }
    int mid = low +(high - low)/2;
    if(arr[mid]==target)
    {
        return mid;
    }
    else if(arr[mid] > target)
    {
        return BinarySearch(arr, low, mid - 1, target);
    }
    else
    {
        return BinarySearch(arr, mid + 1, high, target);
    }
  }

  public static void main(String[] args)
  {
    int[]arr={1,2,3,4,5,6};
  }
    
}
