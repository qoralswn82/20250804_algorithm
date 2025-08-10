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
            //String 메소드의 활용을 통해 접두사, 접미사의 확인 진행
           if (fileName.length() >= prefix.length() + suffix.length() &&
                fileName.startsWith(prefix) &&
                fileName.endsWith(suffix)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
