package designPatterns.decorator.builtIn;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends FilterInputStream {

    protected LowercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int r = super.read(b, off, len);
        for(int i = off;i<off+r;i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return r;
    }
}
