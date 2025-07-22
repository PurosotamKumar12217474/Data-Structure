package Recurrsion;

import java.util.Scanner;

public class reverse {
    // int reverse(int i , int arr[] , int n){
    //     if(i>=n/2) return ;
    //     int swap(arr[i], arr[n-i-1]);
    //     reverse(i+1, arr,n);
    // }


    boolean stringReverse(int i, string s){
        if(i>=s.size()/2) return true;
        if(s[i]!=s[s.size()-i-1])
            return false;
        return stringReverse(i+1 , s);
    }

    public static int main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i = 0 ; i<n ; i++)
        //     int arr[i] = sc.nextInt(i);
        
        // reverse(0, arr, n);
        // for(int i= 0 ; i < n ; i++)
        //     System.out.println(arr[i] + " ");

        // return 0;

        string s = "madam";
        System.out.println(stringReverse(0,s));
        return 0;

    }
    
}
