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
            for(int i = 0; i < str.length(); i++) {
                int ch = str.charAt(i);
                if(97 <= ch && ch <= 122) {
                    lower += 1;
                }else if(65 <= ch && ch <= 90) {
                    upper += 1;
                }else if(48 <= ch && ch <= 57) {
                    number += 1;
                }else if(ch == 32) {
                    space += 1;
                }
            }
            System.out.println(lower+" "+upper+" "+number+" "+space);
        }
    }
}
