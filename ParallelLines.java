import java.io.*;
import java.util.*;

public class ParallelLines {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // x값, y값 각각 카운팅할 맵
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // x값 카운트
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            // y값 카운트
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        int ans = 0;
        // x좌표가 같은 점이 2개 이상이면 직선 1개
        for (int count : xMap.values()) {
            if (count >= 2) ans++;
        }
        // y좌표가 같은 점이 2개 이상이면 직선 1개
        for (int count : yMap.values()) {
            if (count >= 2) ans++;
        }

        System.out.println(ans);
    }
}
