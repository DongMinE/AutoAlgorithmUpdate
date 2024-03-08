import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] list = new long[101];
            list[0] = 0;
            list[1] = list[2] = list[3] = 1;
            list[4] = list[5] = 2;
            for (int i = 6; i < 101; i++) {
                list[i] = list[i - 1] + list[i - 5];
            }

//            for (int i = 4; i <= n; i++) {
//                list[i] = list[i - 2] + list[i - 3];
//            }

            System.out.println(list[n]);
        }

    }
}