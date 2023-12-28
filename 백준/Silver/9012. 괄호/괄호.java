import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int a = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    a++;
                } else if (str.charAt(j) == ')') {
                    a--;
                    if (a < 0) {
                        break;
                    }
                }
            }
            if (a == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}