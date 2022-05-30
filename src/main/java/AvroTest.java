import avro.RandomData;
import org.apache.avro.Schema;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class AvroTest {
    public static void main(String[] args) throws IOException {
        AvroTest me = new AvroTest();
        ClassLoader classLoader = me.getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("avro.avsc");
        Schema schema = new Schema.Parser().parse(is);
        Iterator<Object> it = new RandomData(schema, 1).iterator();
        System.out.println(it.next());
    }
}