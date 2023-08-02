import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class java_ws_03_03 {
    static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int maxNum = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i < T + 1; i++) {
            int N = Integer.parseInt(br.readLine());
            String[][] data = new String[N + 2][N + 2];
            for (int j = 0; j < N + 2; j++) {
                Arrays.fill(data[j], "N");
            }
            for (int j = 1; j < N + 1; j++) {
                String[] a = br.readLine().split(" ");
                for (int k = 0; k < a.length; k++) {
                    data[j][k + 1] = a[k];
                }

            }
            for (int j = 1; j < N + 1; j++) {
                for (int k = 1; k < N + 1; k++) {
                    if (data[j][k].equals("B")) {
                    }
                    int cnt = 0;
                    for (int l = 0; l < 8; l++) {
                        int nr = j + dr[l];
                        int nc = k + dc[l];
                        if (data[nr][nc].equals("G")) {
                            break;
                        } else {
                            cnt++;
                        }
                        if (cnt == 8) {
                            int result = 0;
                            for (int m = 1; m < N + 1; m++) {

                                if (data[j][m].equals("B")) {
                                    result += 1;
                                }
                                if (data[m][k].equals("B")) {
                                    result += 1;
                                }
                            }
                            result -= 1;

                            maxNum = Math.max(maxNum, result);
                        }

                    }

                }

            }

        }
        System.out.printf("#%d %d", T, maxNum);

    }

}
