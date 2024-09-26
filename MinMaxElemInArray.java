// public class MinMaxElemInArray{

//     //Time Complexity: O(N)
//     //Space Complexity: O(1)
//     public static int minElem(int[] arr, int n){
//         int minElem=Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i]<minElem){
//                 minElem = arr[i];
//             }
//         }
//         return minElem;
//     }

//     public static int maxElem(int[] arr, int n){
//         int maxElem = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             if (arr[i]>maxElem){
//                 maxElem = arr[i];
//             }
//         }
//         return maxElem;
//     }

//     public static void main(String[] args) {
//         int arr[] = {7,4,9,8,3};
//         int n = arr.length;

//         System.out.println("Minimum Element:" + minElem(arr, n));
//         System.out.println("Maximum Element: "+ maxElem(arr,n));
        
//     }
// }


// //Time complexity: O(n log n), where n is the number of elements in the array, as we are using a sorting algorithm.
// //Auxilary Space: is O(1), as we are not using any extra space.
// import java.util.Arrays;
// //Min and Max using Sorting
// class Pair{
//     public int min;
//     public int max;
// }
// class MinMaxElemInArray{
//     public static Pair getMinMax(int arr[], int n){
//         Pair minMax = new Pair();
//         Arrays.sort(arr);
//         minMax.min = arr[0];
//         minMax.max = arr[n-1];
//         return minMax;
//     }
//     public static void main(String[] args){
//         int[] arr = {7,8,1,5,3,9};
//         int n = arr.length;
//         Pair minMax = getMinMax(arr, n);
//         System.out.println("Minimum Element: "+ minMax.min);
//         System.out.println("Maximum elemet: "+ minMax.max);
//     }
// }

// // Maximum and minimum of an array using Linear search:
// // Time Complexity: O(n)
// // Auxiliary Space: O(1) as no extra space was needed.
// class Pair{
//     public int min;
//     public int max;
// }
// class MinMaxElemInArray{

//   public static Pair getMinMax(int arr[], int n){

//     Pair minMax = new Pair();
//     if(n == 1){
//         minMax.min = arr[0];
//         minMax.max = arr[0];
//         return minMax;
//     }
//     else if(arr[0]<arr[1]){
//         minMax.min = arr[0];
//         minMax.max = arr[1];
//     }
//     else{
//         minMax.min = arr[1];
//         minMax.max = arr[0];
//     }

//     for(int i=2; i<n; i++){
//         if(arr[i]<minMax.min){
//             minMax.min = arr[i];
//         }
//         else if(arr[i]>minMax.max){
//             minMax.max = arr[i];
//         }
//     }  
//     return minMax;
//   }

//   public static void main(String[] args){
//       int[] arr = {100, 87, 65, 10, 36};
//       int n = arr.length;
//       Pair minMax = getMinMax(arr, n);
//       System.out.println("Minimum Element: "+ minMax.min);
//       System.out.println("Maximum Element: "+ minMax.max);
//   }
// }


// Java program of above implementation
public class MinMaxElemInArray {

    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        /* If array has even number of elements then initialize the first two elements as minimum and maximum */
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
            /* set the starting index for loop */
        } /* If array has odd number of elements then initialize the first element as minimum and maximum */ 
        else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
            /* set the starting index for loop */
        }

        /* In the while loop, pick elements in pair and compare the pair with max and min so far */
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
            /* Increment the index by 2 as two elements are processed in loop */
        }
        return minmax;
    }
    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("Minimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}
