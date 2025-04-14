import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the no of element in array  ");
        int n= input.nextInt();
        int[] arr= new int[n];
        System.out.print("array elements are ");
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
            System.out.println(arr[i]+" ");
        }
      int low= 0;
        int high= n-1;
        System.out.println("sorted , array is :" );
      mergesort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

    } public static void merge(int[]arr,int low,int mid,int high){
        ArrayList<Integer> temp=  new ArrayList<>();
        int left =low;
        int right=mid+1;
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;

        }
        for(int i= low; i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    static void mergesort(int[]arr,int low,int high){
        if (low>=high) return;
        int mid= (low+high)/2 ;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

}

