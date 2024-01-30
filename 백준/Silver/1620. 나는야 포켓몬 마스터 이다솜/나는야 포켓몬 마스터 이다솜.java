import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> StringMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String val = br.readLine();
            map.put(i + 1, val);
            StringMap.put(val, i+1);
        }
//        for (int i = 0; i < m; i++) {
//            String input = br.readLine();
//            if (input.matches("\\d+")) {
//                System.out.println(map.get(Integer.parseInt(input)));
//            } else {
//                System.out.println(StringMap.get((input)));
//            }
//        }
        for(int i = 0; i < m; i++) {
            String input = br.readLine();
            //입력값이 번호인지 포켓몬이름인지 판별
            if(49 <= input.charAt(0) && input.charAt(0) <= 57) {
                System.out.println(map.get(Integer.parseInt(input)));
            }else {
                System.out.println(StringMap.get((input)));
            }
        }

//        for (Integer val : map.keySet()) {
//            System.out.println("key: " + val + ", " + " val: " + map.get(val));
//        }
    }
}