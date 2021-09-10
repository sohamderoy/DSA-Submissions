public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int sum = 0;
        for (int i = 0; i < B; i++){
            sum += A.get(i);
        }
        int maxSum = sum;
        int i = B - 1, j = A.size() - 1;
        while(i>=0){
            sum-=A.get(i--);
            sum+=A.get(j--);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
}