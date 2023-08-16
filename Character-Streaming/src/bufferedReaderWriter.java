import java.io.*;

public class bufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        char[] chars = new char[50];

        try(
                Reader filereader = new FileReader("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\Character-Streaming\\src\\Input");
                BufferedReader bufferedReader = new BufferedReader(filereader)
                ){

            filereader.read(chars);
            System.out.println(chars);
        }
        try(
                Writer filewriter = new FileWriter("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\Character-Streaming\\src\\Output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(filewriter)
                ){

            bufferedWriter.write(chars);
            System.out.println(bufferedWriter);

        }



    }
}
