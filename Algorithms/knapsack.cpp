#include<iostream>
using namespace std;

void bubblesort(double a[],int b[],int c[],int n)
{
    int temp;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n-i-1; j++)
            if (a[j] < a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                
                temp = b[j];
                b[j] =b[j+1];
                b[j+1] = temp;
                
                temp = c[j];
                c[j] = c[j+1];
                c[j+1] = temp;
            }
}

void knapsack(int weight[],int profit[],int n,int W)
{
    double fractional[10];
    for (int i = 0; i < n; i++)
        fractional[i] = (double)profit[i]/(double)weight[i];
    bubblesort(fractional,weight,profit,n);

    double total_profit = 0;
    
    for (int i = 0; i < n; i++)
    {
        if (W>0 && W > weight[i])
        {
            W -= weight[i];
            total_profit += profit[i];
        }
        else{
            total_profit += profit[i] * (double)W/(double)weight[i];
            break;
        }
    }
    cout<<"The Maximum profit of the knapsack :- "<<total_profit;
}
int main()
{
    int weight[] = {10,20,30};
    int profit[] = {60,100,120};
    int W = 50;
    int size = sizeof(weight)/sizeof(weight[0]);
    knapsack(weight,profit,size,W);
    return 0;
}