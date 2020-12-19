import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import example.Advancedtypes.AdvancedTypes;

public class AdvancedTypeProto {
    public static void main(String[] args) {
    AdvancedTypes.Builder builder = AdvancedTypes.newBuilder();
    // TimeStamp
    Timestamp timestamp = Timestamp.newBuilder()
            .setNanos(123)
            .setSeconds(12).build();

    builder.setEventDay(timestamp)
            .setMale("hello")
            .setFemale(true) // any-off shows latest assignment only
            .putColors("12","PINK");
    System.out.println(builder.toString());

    }
}
