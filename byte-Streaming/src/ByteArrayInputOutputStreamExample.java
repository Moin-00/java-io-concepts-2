import java.io.*;

public class ByteArrayInputOutputStreamExample {
    public static void main(String[] args) {
        byte [] bytearray = {'H','e','l','l','o'};
        try{

            InputStream inputStream = new ByteArrayInputStream(bytearray,0,bytearray.length);
            InputStream inputStream2 = new ByteArrayInputStream(bytearray,1,bytearray.length);
//            offset is used to tell the input-stream where to start the bytearray from
//            i.e the index from which we want to read teh bytearray from

//        Reads from Input-stream bytearray
            OutputStream outputStream = new ByteArrayOutputStream();
            OutputStream outputStream2 = new ByteArrayOutputStream();
//        Writes the input stream over system console
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
