import java.io.*;

public class ByteArrayInputOutputStreamExample {

//    input stream = Consider this as a pipe of input data that we read from either console or file
//    output stream = Consider this as a  pipe of output data we write to either console or file

//    we can only read and write from bytearray stream once
    public static void main(String[] args) {
        byte [] bytearray = {'H','e','l','l','o'};
        try{

/*
Here InputStream is an abstract class and ByteArrayInputStream extends this abstract class (Up casting)
Here OutputStream is an abstract class and ByteArrayOutputStream extends this abstract class (Up casting)
*/

            InputStream inputStream = new ByteArrayInputStream(bytearray,0,bytearray.length);//read
            InputStream inputStream2 = new ByteArrayInputStream(bytearray,1,bytearray.length);//read
/*
            offset is used to tell the input-stream where to start the bytearray from
            i.e the index from which we want to read the bytearray from
        Reads from Input-stream bytearray
*/

            OutputStream outputStream = new ByteArrayOutputStream();//write
            OutputStream outputStream2 = new ByteArrayOutputStream();//write

            outputStream.write(inputStream.readAllBytes());

            outputStream2.write(inputStream2.readAllBytes());



            System.out.println(outputStream.toString());
            System.out.println("when offset of 1 applied to input stream");
            System.out.println(outputStream2.toString());

        }catch(IOException ioException){
            ioException.printStackTrace();
            System.out.println(ioException.getMessage());

        }



    }
}
