import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        char[] charsOfInputFile = new char[25];
        try(
                FileReader filereader = new FileReader("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\Character-Streaming\\src\\Input");

                ){
            filereader.read(charsOfInputFile);

        }


        try(
                FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\Character-Streaming\\src\\Output.txt")

                ){
            fileWriter.write(charsOfInputFile);

        }

    }
}
