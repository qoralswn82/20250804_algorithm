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
        //기본 util Collections 정렬 기능 사용
      Collections.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        
        for (String word : words) {
            System.out.println(word);
        }
        
        
    }

}
