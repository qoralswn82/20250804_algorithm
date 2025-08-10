import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String pattern = br.readLine();

        // 패턴에서 * 기준으로 앞/뒤 나누기
        String[] parts = pattern.split("\\*");
        String prefix = parts[0];
        String suffix = parts[1];
        int prefixLen = prefix.length();
        int suffixLen = suffix.length();

        // 파일 이름 입력 및 검사
        for (int i = 0; i < num; i++) {
            String file = br.readLine();

            // 길이가 prefix+suffix보다 짧으면 무조건 불일치
            if (file.length() < prefixLen + suffixLen) {
                System.out.println("NE");
                continue;
            }

            // 앞/뒤 비교
            boolean matchFront = file.startsWith(prefix);
            boolean matchBack = file.endsWith(suffix);

            System.out.println(matchFront && matchBack ? "DA" : "NE");
        }
    }
}
