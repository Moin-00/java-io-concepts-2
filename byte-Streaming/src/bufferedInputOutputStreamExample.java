import java.io.*;

public class bufferedInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Read from input file
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\byte-Streaming\\src\\Input");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            byte[] bytes = bufferedInputStream.readAllBytes();
            System.out.println(new String(bytes));

            // Write to output file
            try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\byte-Streaming\\src\\output.txt");
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

                bufferedOutputStream.write(bytes);
            }
        }
    }



}
