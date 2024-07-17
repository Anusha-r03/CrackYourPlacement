
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // If the list is empty or m is 0, return 0
        if (a.isEmpty() || m == 0) {
            return 0;
        }
        
        // Sort the array
        Collections.sort(a);
        
        long res = Long.MAX_VALUE;
        
        // Traverse the array to find the minimum difference
        for (int i = 0; i <= n - m; i++) {
            int minElm = a.get(i);
            int maxElm = a.get(i + m - 1);
            res = Math.min(res, maxElm - minElm);
        }
        
        return res;
    }
}
