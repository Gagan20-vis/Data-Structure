#include <limits.h>
#include <stdio.h>
#include <stdlib.h>

void printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int maximum(int arr[], int size)
{
    int max = INT_MIN;
    for (int i = 0; i < size; i++)
        if (max < arr[i])
            max = arr[i];
    return max;
}

void countsort(int arr[], int size)
{
    int i, j;
    // Find the maximum element in arr
    int max = maximum(arr, size);

    // Create the count array
    int *count = (int *)malloc((max + 1) * sizeof(int));

    // Initialize the array elements to 0
    for (int i = 0; i < max + 1; i++)
        count[i] = 0;

    // Increament the corresponding index in the count array
    for (int i = 0; i < size; i++)
    {
        count[arr[i]]++;
    }
    i = 0; // counter for count array
    j = 0; // counter for give array

    while (i <= max)
    {
        if (count[i] > 0)
        {
            arr[j] = i;
            count[i]--;
            j++;
        }
        else
            i++;
    }
}

int main()
{
    int arr[] = {3, 2, 1, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Before Sorting :- \n");
    printArray(arr, n);
    printf("After Sorting :- \n");
    countsort(arr, n);
    printArray(arr, n);
    return 0;
}