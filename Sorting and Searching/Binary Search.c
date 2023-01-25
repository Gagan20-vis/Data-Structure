#include<stdio.h>

int BinarySearch(int arr[], int size, int element)
{
    int low = 0;
    int mid;
    int high = size -1;
    while (low <= high) 
    {
        mid = (low + high)/2;
        if (arr[mid] == element) 
        {
            return mid;
        }
        if (arr[mid] < element) 
        {
            low = mid +1;
        }
        else 
        {
            high = mid -1;
        }
    }
    return -1;
    
}

int main()
{
    int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
    int size = sizeof(arr)/sizeof(int);
    int element = 11;
    int searchIndex = BinarySearch(arr, size, element);
    printf("The element %d was found at index %d\n", element, searchIndex);
    return 0;
}