import example.Simple;

import java.io.*;
import java.util.Arrays;
public class SimpleProto {
    public static void main(String[] args) throws IOException {
        Simple.Person.Builder builder = Simple.Person.newBuilder(); // new object is returned
        System.out.println("creating the Proto object");
        builder.setAge(4)
                .setName("rohith")
                .setIsMale(true)
                .setWeight(12.9f)
                .addAddress("8-2-601/G/247 GS colony BanjaraHills")
                .addAddress("Nizampet, Bachupally , Grieet")
                .addAllAddress(Arrays.asList("home","officee"));
        System.out.println(builder.toString());

        Simple.Person message = builder.build();
        System.out.println("Writing "+ message.toString().length()+" bytes to the file");
        File file = new File("simpleMessage.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        message.writeTo(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();


        System.out.println("Reading the Proto object");
        FileInputStream fis = new FileInputStream(file);
        Simple.Person messageFrom = Simple.Person.parseFrom(fis.readAllBytes());
        System.out.println("Reading "+ messageFrom.toString().length()+" bytes from the file");
        System.out.println("Message from file"+ messageFrom.toString());

    }
}
