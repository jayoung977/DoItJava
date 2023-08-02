import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java_ws_03_07 {
    static int N;
    static int maxNum = 0;
    static int maxR = 0;
    static int maxC = 0;
    static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static int[][] data;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        data = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            for (int j = 0; j < N; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println("------------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int result = check(i, j);
                if (result > maxNum) {
                    maxR = i;
                    maxC = j;
                    maxNum = result;
                }
            }

        }
        System.out.println(maxNum);
        System.out.printf("%d,%d", maxR, maxC);

    }

    private static int check(int i, int j) {
        int cnt = 0;

        if (data[i][j] == 0) {
            cnt++;
        }

        for (int k = 0; k < dr.length; k++) {
            for (int n = 1; n < 10; n++) { // i,j에서 최대 연속 9번 가능
                int nr = i + dr[k] * n;
                int nc = j + dc[k] * n;
                int br = i + dr[k] * (n - 1); // before
                int bc = j + dc[k] * (n - 1);

                if (nr >= 0 & nr < N & nc >= 0 & nc < N) {
                    if (data[nr][nc] == 1 & data[br][bc] == 1) {
                        break;
                    } else if (data[nr][nc] == 0) {
                        cnt++;
                    }
                }

            }
        }

        return cnt;
    }
}

// 10
// 0 0 0 0 0 0 0 0 0 0
// 0 1 0 1 0 1 0 1 0 1
// 0 1 0 1 0 1 0 1 0 1
// 0 0 1 0 1 0 1 0 1 0
// 0 0 0 1 0 1 0 1 0 1
// 0 1 0 0 0 1 0 0 0 1
// 0 0 1 0 0 0 0 0 1 0
// 0 1 0 0 0 1 0 0 0 0
// 0 1 1 1 1 1 1 1 1 1
// 0 0 0 0 0 0 0 0 0 0