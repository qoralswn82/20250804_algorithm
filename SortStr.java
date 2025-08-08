public class SortStr {
    public static void main(String[] args) throws IOException{
         // scanner 가 아닌 buffereader 를 통한 성능 개선
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        
        List<String> words = new ArrayList<>(set);

      for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (compare(words[j], words[j + 1]) > 0) {
                    // swap
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }

      // 출력
        for (String word : words) {
            System.out.println(word);
        } 
        
        
    }

  // 비교 함수: 길이 우선, 그다음 사전순
    private static int compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length();
        } else {
            return a.compareTo(b);
        }
    }
}
