import java.util.List;
import java.util.Scanner;

public class arrayINJava {
    public static void Sumpairs(int[] arr,int target){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    count=count+1;
                }
            }
        }
        System.out.println("number of sum pairs :  "+count);
    }
    public static void SumTriplet(int [] arr,int target){
        int count=0;
        for (int k=0;k<arr.length;k++){
        for (int i=k+1;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[k]+arr[j]+arr[i]) == target) {
                    count = count + 1;
                }
            }
        }
        }
        System.out.println("number of sum triplets :  "+count);
    }
    public static void unique(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        System.out.println("---Unique elements of the array ------ ");
        for (int k=0;k<arr.length;k++){
            if(arr[k]!=-1){
                System.out.print(arr[k]+"   ");
            }
        }
    }
    public static int max(int[] ar){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;

    }
    public static int min(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }
//    int[] ar={9,9,3,4,5,9,7,11,9};
//    int[] arr={1,2,3,5,6,7,3,2,1,5};
//
//    int max=max(ar);
//        System.out.println("first largest element = "+max);
//
//        for (int i=0;i<ar.length;i++){
//        if(ar[i]==max){
//            ar[i]=-1;
//        }
//    }
//    int max_2nd=max(ar);
//        System.out.println("second largest element = "+max_2nd);
//    int min=min(arr);
//        System.out.println("first smallest element = "+min);
//        for (int i=0;i<arr.length;i++){
//        if(arr[i]==min){
//            arr[i]=Integer.MAX_VALUE;
//        }
//    }
//    int min_2nd=min(arr);
//        System.out.println("second smallest element = "+min_2nd);
//        for (int i=0;i<arr.length;i++){
//        if(arr[i]==min_2nd){
//            arr[i]=Integer.MAX_VALUE;
//        }
//    }
//    int min_3rd=min(arr);
//        System.out.println("third smallest element = "+min_3rd);
    public static int firstDuplicate(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void reverseArray(int[] a){
        int[] array=new int[a.length];
        int ans=0;
        for (int i=a.length-1;i>=0;i--){
            array[ans++]=a[i];
        }
        System.out.println("------ reverse array will be-------- ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
    }
    public static void reverseSWAP(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
        System.out.println("----- displaying elements in reverse order -----");
        for (int k=0;k<a.length;k++){
            System.out.print(a[k]+"  ");
        }
    }
    public static void zeroANDone(int[] a ){
        int count_0=0;
        int count_1=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==1){
                count_1+=1;
            }
            else{
                count_0+=1;
            }
        }
        for (int i=0;i<a.length;i++){
            if(i<count_0){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
        System.out.println("------ sorted array of 0's and 1's ------");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void swapZERONE(int[] a){
        int i=0;
        int j=a.length-1;
        while (i<=j){
            if(a[i]==0 && a[j]==1){
                break;
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            i++;
            j--;
        }
        System.out.println();
        System.out.println("-------- 2nd approach for sorting 0's and 1's ------");
        for (int ind=0;ind<a.length;ind++){
            System.out.print(a[ind]+" ");
        }
    }
    public static void sorted(int[] a){
        int left=0,right=a.length-1;
        while(left<right){
            if(a[left]==1 && a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==0)
                left++;
            if(a[right]==1)
                right--;
        }
        System.out.println("sorted array ------ ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    public static void evenODD(int [] a){
        int left=0,right=a.length-1;
        while(left<right){
            if(a[left]%2==1&& a[right]%2==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]%2==0)
                left++;
            if(a[right]%2==1)
                right--;
        }
        System.out.println("sorted array ------ ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    public static int[] array(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                arr[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                arr[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return arr;
    }
    public static void sort01(int[] a){
        int left=0,right=a.length-1;
        while(left<right){
            if(a[left]==1&&a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==0){
                left++;
            }
            if(a[right]==1){
                right--;
            }
        }
        System.out.println("-----sorted array of 0's and 1's ------ ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void reveresal(int[] a){
        int left=0,right=a.length-1;
        while(left<=right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println("----reverse array of original array ----- ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }

    }
    public static void parity(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0)
                left++;
            if(arr[right]%2==1)
                right--;
        }
        System.out.println("------ first-even and second-odd sorted array ---- ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static int [] prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static int array_sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static  boolean partition(int [] arr){
        int totalSum=array_sum(arr);
        int ps=0;
        for (int i=0;i<arr.length;i++){
            ps+=arr[i];
            int ss=totalSum-ps;
            if(ps==ss){
                return true;
            }
        }
        return false;
    }
    public static void advance(int[] arr,int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            arr[i]=arr[i]+sum;
            sum=arr[i];
        }
        System.out.println(sum);
    }
    public static void prefSUM(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println("-----prefix sum array -------");
        for (int i=0;i<arr.length;i++){
            System.out.print( arr[i]+" ");
        }
    }
    public static int ceiling(int[] arr,int target){
        if(arr[arr.length-1]<target){
            return -1;
        }
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target >arr[mid]){
                left=mid+1;
            }
            else if(target <arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return left;
    }
    public static int floor(int [] arr,int target){


        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target >arr[mid]){
                left=mid+1;
            }
            else if(target <arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return right;
    }
    public static void missing(int [] arr){
        int n=arr.length+1;
        int exp_sum=(n*(n+1))/2;
        int sum=0;
        for (int i=0;i<arr.length;i++){
             sum=sum+arr[i];
        }
        int miss=exp_sum-sum;
        System.out.println("missing number from 1 to "+n+" = "+miss);
    }
    public static boolean binaryS(int[] arr,int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(target >arr[mid]){
                left=mid+1;
            }
            else if(target < arr[mid]){
                right=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    //when the array is either ascending or descending
    public static boolean orderAgnostic(int [] arr,int target){
        int left=0, right=arr.length-1;
        boolean order=arr[left]<arr[right];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            if(order){
                if(arr[mid]<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return false;
    }

    //find the prefix sum of the array
    public static int[] sum_prefix(int [] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static List<Integer> duplicates(int[] arr,List<Integer> list){
        list.add(arr[0]);
         for (int i=1;i<arr.length;i++){
             if(arr[i]!=arr[i-1]){
                 list.add(arr[i]);
             }
         }
         return list;
    }
    public static int position(int[] arr,int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>arr[mid]){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int[] sort(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]==0)
                left++;
            if(arr[right]==1)
                right--;
        }
        return arr;
    }

    public static int[] sorted012(int[] a){
        int left=0, right=a.length-1;
        while(left<=right){

            if(a[left]==2 && a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==1 && a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==2 && a[right]==1){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==0){
                left++;
            }
            if(a[right]==2){
                right--;
            }
        }
        return a;
    }
    public static int[] s(int[] arr){
        int a=0,b=0,c=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0)
                a++;
            else if(arr[i]==1)
                b++;
            else
                c++;
        }
        for (int i=0;i<arr.length;i++){
            if(i<a)
                arr[i]=0;
            else if(i>=a && i<b+a)
                arr[i]=1;
            else
                arr[i]=2;
        }
        return arr;
    }
    public static boolean Agnostic(int[] arr,int target){
        int left=0, right=arr.length-1;
        boolean isAGNOSTIC=arr[left]<arr[right];
        while(left<=right){
            int mid=(left+right)/2;
            if(isAGNOSTIC){
                if(arr[mid]==target)
                    return true;
                if(target>arr[mid])
                    left=mid+1;
                else if(target<arr[mid])
                    right=mid-1;
            }
            else{
                if(arr[mid]==target)
                    return true;
                if(target>arr[mid])
                    right=mid-1;
                else if(target<arr[mid])
                    left=mid+1;
            }
        }
        return false;
    }
    public static int[] swapping(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void printing(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static int[] rotating(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int jj=0;jj<n-k;jj++){
            ans[j++]=arr[jj];
        }
        return ans;
    }
    public static void rotate(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotateInPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        rotate(arr,0,n-k-1);
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-1);
    }
    public static int[] sorting01(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int swap=arr[left];
                arr[left]=arr[right];
                arr[right]=swap;
                left++;
                right--;
            }
            if(arr[left]==0)
                left++;
            if(arr[right]==1)
                right--;
        }
        return arr;
    }
    public static int[] sortEven(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int swap=arr[left];
                arr[left]=arr[right];
                arr[right]=swap;
                left++;
                right--;
            }
            if(arr[left]%2==0)
                left++;
            if(arr[right]%2==1)
                right--;
        }
        return arr;
    }
    public static int[] squaring(int[] arr){
        int[] ans=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            ans[j++]=arr[i]*arr[i];
        }
        return ans;
    }
    public static void bubbleSORT(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int[] sort012(int[] arr){
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int swap =arr[mid];
                arr[mid]=arr[low];
                arr[low]=swap;
                mid++;
                low++;
            }
            else if(arr[mid]==1) {
                mid++;

            }
            else if(arr[mid]==2){
                int swap =arr[mid];
                arr[mid]=arr[high];
                arr[high]=swap;
                high--;
            }
        }
        return arr;
    }
    public static boolean recBinarySearch(int[] a,int left,int right,int target){
        if(left>right){
            return false;
        }
        int mid=left+(right-left)/2;
        if(target==a[mid]){
            return true;
        }
        else if(target>a[mid]){
            return recBinarySearch(a,mid+1,right,target);
        }
        else{
            return recBinarySearch(a,left,mid-1,target);
        }
    }
    public static int firstOccur(int[] arr,int target){
        int flag=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                flag=mid;
                right=mid-1;
            }
            else{
                if(target>arr[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return flag;
    }
    public static int first(int[] arr,int tar){
        int flag=-1;
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==tar){
                flag=mid;
                left=mid+1;
            }
            else{
                if(tar>arr[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return flag;
    }
    public static int nearest(int x){
        int left=0, right=x;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=mid*mid;
            if(val==x)
                return mid;
            else{
                if(val<x){
                    ans=mid;
                    left=mid+1;
                }
                else{
                   right=mid-1;
                }

            }
        }
        return ans;
    }
    public static int[] s012(int[] arr){
        int left=0,mid=0, right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }
        }
        return arr;
    }
    public static int near(int x){
        int left=0, right=x;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=mid*mid;
            if(val==x)
                return mid;
            else {
                if(val<x){
                    ans=mid;
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }

            }
        }
        return ans;
    }
    public static int lastOccur(int[] arr,int target){
        int left=0, right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==arr[mid]){
                ans=mid;
                right=mid-1;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return ans;
    }
    public static int peakElement(int[] arr){
        int left=0, right=arr.length-1;
        int n=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((mid==0||arr[mid]>arr[mid-1]) && (mid==n-1||arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }
        }
        return -1;
    }
    public static int rotated(int[] arr){
        int left=0, right=arr.length-1;
        int nas=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=arr[arr.length-1]){
                nas=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return nas;
    }
    public static void firstAndLast(int[] arr,int target){
        int left=0, right=arr.length-1;
        int flag1=-1;
        while(left<=right) {
            int mid = left + (right - left) /2;
            if(arr[mid]==target){
                flag1=mid;
                right=mid-1;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }

        }
        int lef=0, righ=arr.length-1;
        int flag2=-1;
        while(lef<=righ) {
            int mid = lef + (righ - lef) /2;
            if(arr[mid]==target){
                flag2=mid;
                lef=mid+1;
            }
            else if(target>arr[mid]){
                lef=mid+1;
            }
            else if(target<arr[mid]){
                righ=mid-1;
            }

        }
        System.out.println("first occurence : "+flag1);
        System.out.println("last occurence :"+flag2);
    }
    public static int ceiling2(int[] arr, int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target >arr[mid]){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return left ;
    }
    public static int floor2(int[] arr,int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>arr[mid]){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return right;
    }
    public static void  rotatingKth(int[] arr,int k){
        int n=arr.length-1;
         k=k%n;
         int j=0;
         int[] ans=new int[n];
         for (int i=n-k;i<n;i++){
             ans[j++]=arr[i];
         }
         for (int kk=0;kk<n-k;kk++){
             ans[j++]=arr[kk];
         }
        System.out.println("----rotated array -------");
         for (int m=0;m<n;m++){
             System.out.print(ans[m]+"  ");
         }
    }
    public static int minimumElement(int[] arr){
        int left=0, right=arr.length-1;
        int n=arr.length;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static int targeted(int[] arr,int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<arr[right]){
                if(target>arr[mid] && target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(target<arr[mid] && target>=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid-1;
                }
            }
        }
        return -1;
    }
    public static boolean Binary(int[][] arr,int target){
        int n=arr.length;
        int m= arr[0].length;
        int left=0, right=(n*m)-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midE;
            midE = arr[mid/m][mid%m];
            if(target==midE){
                return true;
            }
            else if(target>midE){
                left=mid+1;
            }
            else if(target<midE){
                right=mid-1;
            }
        }
        return false;
    }
    public static int peak(int[] arr){
        int n=arr.length;
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int[] ss012(int[] arr){
        int n=arr.length;
        int left=0, mid=0, right=n-1;
        while(mid<=right){
            if(arr[mid]==0){
                int tem=arr[mid];
                arr[mid]=arr[left];
                arr[left]=tem;
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int tem=arr[mid];
                arr[mid]=arr[right];
                arr[right]=tem;
                right--;
            }
        }
        return arr;
    }
    public static int c(int [] arr,int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
        }
        return right;
    }
    public static int pe(int[] arr){
        int n=arr.length;
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int minimum(int[] arr){
        int n=arr.length;
        int left=0, right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int target=25;
        System.out.println("minimum element index : "+minimum(arr));


    }
}
