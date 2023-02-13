#include<stdio.h>

void printArray(int *arr ,int n)
{
    for (int i = 0; i < n; ++i) 
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}

int partition(int a[],int low,int high)
{
    int pivot = a[low];
    int i = low+1;
    int j = high;
    int temp;
    
    do 
    {
        while (a[i] <= pivot) 
        {
            i++;
        }
        while (a[j] > pivot) 
        {
            j--;
        }
        if (i<j) 
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }while (i<j);
    
    temp = a[low];
    a[low] = a[j];
    a[j] = temp;
    printArray(a, high-1);  
    return j;
}
void quicksort(int a[],int low,int high)
{
    int partitionIndex;     //Index of pivot after partition
    
    if (low<high) 
    {
        partitionIndex = partition(a,low,high);
        printArray(a,9);
        quicksort(a,low,partitionIndex-1);      //sort left subarray
        quicksort(a, partitionIndex+1,high);    //sort right subarray  
    }
}   
int main()
{
    int arr[] = {3, 5, 2, 13, 12, 3, 2, 13, 45};
    int size = sizeof(arr)/sizeof(arr[0]);
    printArray(arr,size);
    quicksort(arr,0,size-1);
    printArray(arr,size);
    return 0;
}