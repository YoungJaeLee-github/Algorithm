import java.io.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bufferedReader.readLine());
        while (testCase != 0) {
            String[] temp = bufferedReader.readLine().split(" ");
            bufferedWriter.write(String.valueOf(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])));
            bufferedWriter.newLine();
            testCase--;
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
