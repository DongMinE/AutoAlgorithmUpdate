import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

    static char[][] oriList, copyList;
    static boolean[][] check, check2;
    static int resRGB, res = 0;
    static int n;
    static int[] rx = {0, 0, 1, -1};
    static int[] ry = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        oriList = new char[n][n];
        copyList = new char[n][n];
        check = new boolean[n][n];
        check2 = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String color = br.readLine();
            for (int j = 0; j < n; j++) {
                char RGB = color.charAt(j);
                oriList[i][j] = RGB;
                if (RGB == 'R') {
                    RGB = 'G';
                }
                copyList[i][j] = RGB;
            }
        }
        //색 구역 확인
        bfs(oriList, check, 0); // 정상인
        bfs(copyList, check2, 1);// 적록색약인

        System.out.println(res + " " + resRGB);
    }

    private static void bfs(char[][] colorArray, boolean[][] checkRGB, int style) {
//        for (char[] arr : colorArray) {
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println("mmmmmmmmmmmmmmmmmmmmm");
//        for (boolean[] arr : checkRGB) {
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println("--------------------");
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!checkRGB[i][j]) {
                    if (style == 0) {
                        res++;
//                        System.out.println("style:" + style);
                    } else if (style == 1) {
                        resRGB++;
//                        System.out.println("style:" + style);
                    }
                    q.add(new int[]{i, j});

                    while (!q.isEmpty()) {
                        int[] pos = q.poll();
                        int x = pos[0];
                        int y = pos[1];

                        for (int k = 0; k < 4; k++) {
                            int dx = x + rx[k];
                            int dy = y + ry[k];
                            if (dx >= 0 && dx < n && dy >= 0 && dy < n) {
                                if (!checkRGB[dx][dy] && colorArray[dx][dy] == colorArray[x][y]) {
                                    q.add(new int[]{dx, dy});
                                    checkRGB[dx][dy] = true;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}