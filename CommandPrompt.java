public class CommandPrompt {
    /**
     *
     *  문제)  첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다. ?은 해당 자리에 오는 모든 문자열을 표현한다.
     */
    public static void main(String[] args) throws IOException {
        // scanner 가 아닌 buffereader 를 통한 성능 개선
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] files = new String[n];
        
        for (int i = 0; i < n; i++) {
            files[i] = br.readLine();
        }
        // 문제의 예외 케이스 선처리
        // N == 1 일 경우 해당 문자열이 나올 수 있는 결과는 1개 이므로 선처리 
        if (n == 1) {
            System.out.println(files[0]);
            return;
        }
        //메모리 낭비를 막기 위한 String -> StringBuilder 사용 / 불변 -> 가변
        //*** 추가적으로, MT일 경우 StringBuilder 는 동기화가 안됨으로 사용금지 -> StringBuffer 를 사용
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < files[0].length(); i++) {
            char ch = files[0].charAt(i);
            boolean same = true;
            
            for (int j = 1; j < n; j++) {
                if (files[j].charAt(i) != ch) {
                    same = false;
                    break;
                }
            }
            
            sb.append(same ? ch : '?');
        }
        
        System.out.println(sb.toString());
    }
}
