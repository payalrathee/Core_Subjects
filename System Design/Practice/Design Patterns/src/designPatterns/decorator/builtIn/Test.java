package designPatterns.decorator.builtIn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream f = new LowercaseInputStream(new FileInputStream("C:\\Work\\Core_Subjects\\System Design\\Design Patterns\\src\\designPatterns\\decorator\\builtIn\\a.txt"));
        int c;
        while((c = f.read()) > 0) {
            System.out.print((char)c);
        }
    }
}
