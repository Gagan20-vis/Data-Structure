#include <stdio.h>

void printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void bubbleSort(int *arr, int n)
{
    int temp;
    int isSorted = 0;
    for (int i = 0; i < n - 1; i++) // for number of passes
    {
        printf("working on pass number %d\n", i + 1);
        isSorted = 1;
        for (int j = 0; j < n - 1 - i; j++) // for number of comparison in each pass
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                isSorted = 0;
            }
        }
        if (isSorted)
        {
            return;
        }
    }
}

int main()
{
    // int arr[] = {12, 54, 65, 7, 23, 9};
    int arr[] = {3, 2, 1, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Before Sorting :- \n");
    printArray(arr, n);
    printf("After Sorting :- \n");
    bubbleSort(arr, n);
    printArray(arr, n);
    return 0;
}