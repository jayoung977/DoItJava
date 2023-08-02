import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * java_ws_03_06
 */
public class java_ws_03_06 {
    static int maxNum = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] data = new int[N][N];

        // char[] chrArr = st.nextToken().toCharArray();
        // System.out.println(chrArr[0] - '0');

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            for (int j = 0; j < N; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] rowIdxs = new int[N];
        int[] colIdxs = new int[N];
        for (int i = 0; i < N; i++) {
            int rowCnt = 0;
            int colCnt = 0;
            for (int j = 0; j < N; j++) {
                // data[i][j]
                if (data[i][j] == 1) {
                    rowIdxs[rowCnt] = j;
                    rowCnt += 1;
                }
                if (data[j][i] == 1) {
                    colIdxs[colCnt] = i;
                    colCnt += 1;
                }
            }
            for (int j = 0; j < rowIdxs.length - 1; j++) {
                int result = rowIdxs[j + 1] - rowIdxs[j];
                maxNum = Math.max(maxNum, result);
            }
            for (int j = 0; j < colIdxs.length - 1; j++) {
                int result = colIdxs[j + 1] - colIdxs[j];
                maxNum = Math.max(maxNum, result);
            }
        }
        System.out.println(maxNum);

    }
}
