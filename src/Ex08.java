import java.io.*;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase, count;
        testCase = Integer.parseInt(bufferedReader.readLine());
        count = 0;

        while (testCase != 0) {
            String[] temp = bufferedReader.readLine().split(" ");
            int sum = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);

            bufferedWriter.write("Case #" + ++count + ": " + temp[0] + " + " + temp[1] + " = " + sum);
            bufferedWriter.newLine();
            testCase--;
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
