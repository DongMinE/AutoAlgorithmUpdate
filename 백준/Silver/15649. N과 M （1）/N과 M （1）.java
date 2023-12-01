import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m;
	static boolean[] visited;
	static int[] numbers, input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		visited = new boolean[n];
		numbers = new int[m];
		input = new int[n];
		for (int i = 1; i <= n; i++)
			input[i-1] = i;
		perm(0);

	}

	private static void perm(int cnt) {
		if (cnt == m) {
			for (int v : numbers) {
				System.out.print(v + " ");
			}
			System.out.println();
			return;
		}
		for (int j = 0; j < n; j++) {
			if (visited[j])
				continue;
			visited[j] = true;
			numbers[cnt] = input[j];
			perm(cnt + 1);
			visited[j] = false;
		}

	}

}
