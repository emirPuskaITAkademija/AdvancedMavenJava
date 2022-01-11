package two.io;

import java.io.Closeable;
import java.io.IOException;

public class Citac implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Vozdra raj...neko ovdje zatvara neki resurs");
    }
}
