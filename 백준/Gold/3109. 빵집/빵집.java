import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int ans, n, m;
	static char arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			if (back(i, 0))
				ans++;
		}
		System.out.println(ans);
	}

	private static boolean back(int x, int y) {
		arr[x][y] = '-';

		if (y == m - 1)
			return true;

		if (x > 0 && arr[x - 1][y + 1] == '.')
			if (back(x - 1, y + 1))
				return true;

		if (arr[x][y + 1] == '.')
			if (back(x, y + 1))
				return true;

		if (x + 1 < n && arr[x + 1][y + 1] == '.')
			if (back(x + 1, y + 1))
				return true;
		return false;
	}
}
