#include <iostream>
using namespace std;

int getpivot(int arr[], int n)
{
    int s = 0;
    int e = n - 1;
    int mid = (s + e) / 2;
    while (s < e)
    {
        if (arr[mid] >= arr[0])
        {
            s = mid + 1;
        }
        else
        {
            e = mid;
        }
        mid = (s + e) / 2;
    }
    return s;
}

int binarySearch(int arr[], int s, int e, int key)
{
    int start = s;
    int end = e;
    int mid = (start + end) / 2;
    while (start <= end)
    {
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            start = mid + 1;
        else
            end = mid - 1;
        mid = (start + end) / 2;
    }
    return -1;
}

int Search(int arr[], int n, int key)
{
    int pivot = getpivot(arr, n);
    if (key >= arr[pivot] and key <= arr[n - 1])
        return binarySearch(arr, pivot, n - 1, key);
    else
        return binarySearch(arr, 0, pivot - 1, key);
}

int main()
{
    int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    int size = 9;
    int key;
    cin >> key;
    int search = Search(arr, size, key);
    if (search != -1)
        cout << key << " is found at index :-" << search;
    else
        cout << "Element not found!" << endl;
    return 0;
}