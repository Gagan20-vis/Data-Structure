#include <stdio.h>

void printArray(int *arr, int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void SelectionSort(int *arr, int n)
{
    int indexOfMin;
    int temp;
    for (int i = 0; i < n - 1; i++)
    {
        indexOfMin = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[indexOfMin])
            {
                indexOfMin = j;
            }
        }
        temp = arr[i];
        arr[i] = arr[indexOfMin];
        arr[indexOfMin] = temp;
    }
}

int main()
{
    int arr[] = {3, 5, 2, 13, 12};
    int n = sizeof(arr) / sizeof(arr[0]);
    SelectionSort(arr, n);
    printArray(arr, n);
    return 0;
}