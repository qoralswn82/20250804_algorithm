public class ClimbingStairsDP {
    public int climbStairs(int n) {
    
        if (n <= 2) return n; // 1->1, 2->2 // n이 1 또는 2일 때는 결과가 n이므로 바로 반환


        int[] dp = new int[n + 1];       // dp 배열 생성: dp[i]는 i번째 계단까지 오르는 방법의 수 저장
        dp[1] = 1;                      // 1번째 계단까지 가는 방법은 1가지
        dp[2] = 2;                      // 2번째 계단까지 가는 방법은 2가지 (1+1, 2)

        for (int i = 3; i <= n; i++) {  // 3번째 계단부터 n번째 계단까지 반복
            dp[i] = dp[i - 1] + dp[i - 2]; // 점화식: 현재 계단까지 방법 = 이전 계단 + 이전이전 계단 방법 수 합
        }

        return dp[n];                   // 최종 n번째 계단까지 방법 수 반환
    }

    public static void main(String[] args) {
        ClimbingStairsDP cs = new ClimbingStairsDP();
        System.out.println(cs.climbStairs(5)); // 8
    }
}
