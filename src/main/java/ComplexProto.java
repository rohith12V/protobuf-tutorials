import example.Complex;

import java.io.IOException;

public class ComplexProto {
    public static void main(String[] args) throws IOException {
        Complex.DummyMessage.Builder dependantBuilder = Complex.DummyMessage.newBuilder();
        dependantBuilder.
                setName("rohith")
                .setId(12);
        System.out.println(dependantBuilder.toString());
        Complex.ComplexMessage.Builder builder = Complex.ComplexMessage.newBuilder();
        builder.setOneDummy(dependantBuilder)
                .addMultipleDummy(createDummyMessage(23,"y"));
        System.out.println(builder.toString());

    }

    public static Complex.DummyMessage createDummyMessage(int id , String name) {
        Complex.DummyMessage.Builder newDummyMessage = Complex.DummyMessage.newBuilder();
        newDummyMessage.
                setName(name)
                .setId(id);
        return newDummyMessage.build();
    }
}
