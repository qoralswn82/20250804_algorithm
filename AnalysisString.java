public class AnalysisString {
    /**
     * 문제) 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
     * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
     * 첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.
     */
    public static void main(String[] args)  throws IOException{
        // 여기에 코드를 작성하세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!==null){
            int lower = 0, upper = 0, number = 0, space = 0;
            // java Character 클래스의 메소드를 사용하여 손쉽게 문자열 구분 사용
            for (char ch : input.toCharArray()) {
                if (Character.isLowerCase(ch)) lower++;
                else if (Character.isUpperCase(ch)) upper++;
                else if (Character.isDigit(ch)) digit++;
                else if (ch == ' ') space++;
            }
            // 표준 출력 포맷팅 
            System.out.printf("%d %d %d %d%n", lower, upper, digit, space);
        }
    }
}
