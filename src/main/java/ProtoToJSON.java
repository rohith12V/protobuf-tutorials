import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.Simple;

import java.util.Arrays;

public class ProtoToJSON {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        Simple.Person.Builder builder = Simple.Person.newBuilder(); // new object is returned
        builder.setAge(4)
                .setName("rohith")
                .setIsMale(true)
                .setWeight(12.9f)
                .addAddress("8-2-601/G/247 GS colony BanjaraHills")
                .addAddress("Nizampet, Bachupally , Grieet")
                .addAllAddress(Arrays.asList("home","officee"));
        String protoString = builder.toString();

        // Proto to JSON
        String json = JsonFormat.printer().print(builder);
        System.out.println(json);

        // JSON to Proto
        Simple.Person.Builder builder1 = Simple.Person.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder1);
        System.out.println(builder1.toString());
    }

}
