public class ClimbingStairsDP {
    public int climbStairs(int n) {
    
        if (n <= 2) return n; // 1->1, 2->2 // n이 1 또는 2일 때는 결과가 n이므로 바로 반환


        int twoBack = 1;   // ways(1) : 1칸 계단을 오르는 방법의 수는 1
        int oneBack = 2;   // ways(2) : 2칸 계단을 오르는 방법의 수는 2 ([1+1], [2])
        int current = 0;   // 현재 계산 중인 ways(i)를 저장할 변수 초기화
    
        // 3번째 계단부터 n번째 계단까지 반복하면서 방법의 수 계산
        for (int i = 3; i <= n; i++) {
            current = oneBack + twoBack; // ways(i) = ways(i-1) + ways(i-2)
            twoBack = oneBack;           // 이전 두 칸 전의 값 업데이트 (이전의 ways(i-1))
            oneBack = current;           // 바로 이전 칸의 값 업데이트 (현재 계산한 ways(i))
        }
        return current;  // n번째 계단까지 오르는 총 방법 수 반환
    }

    public static void main(String[] args) {
        ClimbingStairsDP cs = new ClimbingStairsDP();
        System.out.println(cs.climbStairs(5)); // 8
    }
}
