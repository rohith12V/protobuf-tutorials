import example.Enum;
import example.Simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class EnumProto {
    public static void main(String[] args) throws IOException {
        Enum.FavColor.Builder builder = Enum.FavColor.newBuilder();
        builder.setName("rohith")
                .setColor(Enum.Color.PINK);
        System.out.println(builder.toString());

    }
}
