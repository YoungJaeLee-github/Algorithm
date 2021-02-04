// bracket Ex

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackEx02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        while (testCase != 0) {
            String input = bufferedReader.readLine();
            int openBracketCount = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    openBracketCount++;
                } else {
                    openBracketCount--;
                }
                if (openBracketCount < 0) {
                    break;
                }
            }
            System.out.println(openBracketCount == 0 ? "YES" : "NO");
            testCase--;
        }
        bufferedReader.close();
    }
}
