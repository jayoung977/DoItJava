import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * java_ws_03_04
 */
public class java_ws_03_04 {
    static int N;
    static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i < T + 1; i++) {
            int answer;
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] data = new int[4];
            for (int j = 0; j < 4; j++) {
                data[j] = Integer.parseInt(st.nextToken());
            }
            answer = check(data);
            // System.out.println();
            System.out.printf("#%d %d", i, answer);
        }

    }

    private static int check(int[] data) {
        int br = data[2] - 1; // 0부터 시작하도록
        int bc = data[3] - 1;
        int wr = data[0] - 1;
        int wc = data[1] - 1;
        for (int i = 0; i < dr.length; i++) {
            for (int n = 1; n < N; n++) {
                int nbr = br + dr[i] * n;
                int nbc = bc + dc[i] * n;
                if (nbr >= 0 & nbr < N & nbc >= 0 & nbc < N) {
                    if (nbr == wr & nbc == wc) {
                        return 1;
                    }
                }
            }

        }

        return 0;
    }
}

// 3
// 2
// 1 1 2 2
// 3
// 1 1 3 2
// 4
// 2 2 3 4