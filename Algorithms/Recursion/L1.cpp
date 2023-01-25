#include<iostream>
using namespace std;
int count=0;
int func(){
    if(count==4)
        return 0;
    cout<<count++<<endl;
    func();
}
int main(){
    func();
    return 0;
} 