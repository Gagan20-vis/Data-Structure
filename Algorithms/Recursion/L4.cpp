#include <bits/stdc++.h>
using namespace std;

// Problem 1
//  void reverse(int arr[], int l, int size)
//  {
//      if (l >= size / 2)
//          return;
//      swap(arr[l], arr[size - l - 1]);
//      reverse(arr, l + 1, size-1);
//  }

// Using one variable
void reverse(int arr[], int i, int size)
{
    if (i > size / 2)
    {
        return;
    }
    swap(arr[i], arr[size - i - 1]);
    reverse(arr, i + 1, size);
}

// Problem 2
bool ispalidrome(string s, int l)
{
    if (l >= s.length() / 2)
        return true;
    if (s[l] != s[s.length() - l - 1])
        return false;
    return ispalidrome(s, l + 1);
}

void print(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    string s = "madam";
    int l = 0;
    int r = s.length() - 1;
    // reverse(arr, l, size);
    // reverse(arr, l, size);
    // print(arr, size);
    cout << ispalidrome(s, l);
    return 0;
}