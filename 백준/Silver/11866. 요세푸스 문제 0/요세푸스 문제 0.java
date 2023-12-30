import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int people = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        sb.append("<");
        for (int i = 1; i < N; i++) {
            // 방법1. 빼려는 숫자만큼 앞에 숫자를 뒤로 보내고 맨 앞에 있는 숫자 제거
            for (int j = 0; j < people - 1; j++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll());
        sb.append(">");
        System.out.println(sb);
    }
}