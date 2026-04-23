class countiterative{
    
}

//given a sorted binary array in ascending order the tast is t0 fine the nof of 1

public class CountOnes {

    static int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1, result = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
                result = mid;
                high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
        
                return arr.length - result;
            }
        }

        return arr.length - result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 1};
        System.out.println("Number of 1s: " + countOnes(arr)); 
    }
}

//search an element in an almost sorted array 
class CountOnesinalmostsorted{

    static int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1, result = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }