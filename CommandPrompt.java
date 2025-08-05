public class CommandPrompt {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = new String[size];
        for(int i = 0 ; i < size; i++){
           str[i]=sc.next();
        }
        
        String result = "";
        for(int j = 0 ; j < str[j].length; j++){
            for(int i = 0 ; i < size-1; i++){
              if(str[i].charAt(j)==str[i+1].charAt(j)){
                result[j]=str[i].charAt(j);
              }else{
                result[j]='?';  
              }
            }
        }
        System.out.println(result);
        
    }
}
