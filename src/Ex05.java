import java.io.*;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] temp = bufferedReader.readLine().split(" ");
            if (Integer.parseInt(temp[0]) == 0) {
                break;
            }
            bufferedWriter.write(String.valueOf(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
