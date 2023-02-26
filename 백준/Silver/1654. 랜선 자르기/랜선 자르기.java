import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int k;
	static int n;
	static long ans;
	static int total;
	static long mid;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new int[k];


		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		left(k, n);
		System.out.println(ans);
	}

	private static void left(int k, int n) {
		long s = 1;
		long e = 1L << 60;
		while (s <= e) {
			mid = (s+e)/2;
			
			if (check(mid)) {
				ans = mid;
				s = mid + 1;
			}
			else e = mid - 1;
			
		}

	}

	private static boolean check(long mid) {
		total = 0;
		for (int v : arr) {
			total += v / mid;
		}
		return total >= n;
	}

}
