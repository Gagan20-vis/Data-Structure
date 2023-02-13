public class Mergesort {
        public static void main(String[] args){
            int[] arr = {13,46,24,52,20,9} ;
            int n = arr.length;
            merge_sort(arr,0,n-1);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
        static void merge (int[] arr, int low, int mid, int high){
            int[] temp = new int[low+high+1];
            int i=low ;
            int j=mid+1 ;
            int k=low ;

            while(i<=low && j<=high){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }
                else {
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }

            while(i<=mid){
                temp[k]=arr[i];
                i++;
                k++;
            }
            while(j<=high) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            if (high + 1 - low >= 0) System.arraycopy(temp, low, arr, low, high + 1 - low);
        }
        static void merge_sort(int[] arr, int low , int high){
            if(low>=high)
                return ;
            else {
                int mid = (low+high)/2 ;
                merge_sort(arr,low,mid);
                merge_sort(arr,mid+1,high);
                merge(arr,low,mid,high);
            }
        }
}
