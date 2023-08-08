import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleInputOutputExample {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----Scanner example with console content ------------------------------------");
        System.out.println("Enter name");

        Scanner sc = new Scanner(System.in);
//        System.in informs scanner to take/read input from this systems console
        String name = sc.next();
        System.out.println("Input from Systems console -"+name);

        System.out.println("-----Scanner example with console content ------------------------------------");


        try{
            Scanner fileScanner = new Scanner(new File("C:\\Users\\USER\\IdeaProjects\\java-io-concepts-2\\byte-Streaming\\src\\Sample-io-Example"));
            while (fileScanner.hasNext()){
                String fileContent = fileScanner.next();
                System.out.print(fileContent);
            }
        } catch (FileNotFoundException | NullPointerException exception){
            System.out.println(exception.getMessage());
        }


    }

}
