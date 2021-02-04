import java.io.*;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = bufferedReader.readLine().split(" ");
        bufferedWriter.write(String.valueOf(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
