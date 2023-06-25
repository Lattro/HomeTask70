import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String someString = scanner.nextLine();
        System.out.println(someString.length());
        try( PrintWriter writer = new PrintWriter(System.out))
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String secondString = bufferedReader.readLine();
            writer.println(secondString.length());
            writer.flush();
            System.out.printf("someString length = %s; secondString length = %s; ",someString.length(),secondString.length());
        }
        scanner.close();
    }
}
