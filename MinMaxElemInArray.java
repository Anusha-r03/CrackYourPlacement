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

// Maximum and minimum of an array using Linear search:
// Time Complexity: O(n)
// Auxiliary Space: O(1) as no extra space was needed.
class Pair{
    public int min;
    public int max;
}
class MinMaxElemInArray{

  public static Pair getMinMax(int arr[], int n){

    Pair minMax = new Pair();
    if(n == 1){
        minMax.min = arr[0];
        minMax.max = arr[0];
    }
    else if(arr[0]<arr[1]){
        minMax.min = arr[0];
        minMax.max = arr[1];
    }
    else{
        minMax.min = arr[1];
        minMax.max = arr[0];
    }

    for(int i=2; i<n; i++){
        if(arr[i]<minMax.min){
            minMax.min = arr[i];
        }
        else if(arr[i]>minMax.max){
            minMax.max = arr[i];
        }
    }  
    return minMax;
  }

  public static void main(String[] args){
      int[] arr = {100, 87, 65, 10, 36};
      int n = arr.length;
      Pair minMax = getMinMax(arr, n);
      System.out.println("Minimum Element: "+ minMax.min);
      System.out.println("Maximum Element: "+ minMax.max);
  }
}
