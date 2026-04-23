
#include <stdio.h>

int binarySearch(int arr[], int size, int key) {
    int low = 0, high = size - 1, mid;

    while (low <= high) {
        mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;  
        }
        else if (arr[mid] < key) {
            low = mid + 1; 
        }
        else {
            high = mid - 1; 
        }
    }

    return -1;
}

int main() {
    int arr[] = {2, 4, 6, 8, 10, 12};
    int size = 6;
    int key, result;

    printf("Enter element to search: ");
    scanf("%d", &key);

    result = binarySearch(arr, size, key);

    if (result != -1)
        printf("Element found at index %d", result);
    else
        printf("Element not found");

    return 0;
}
