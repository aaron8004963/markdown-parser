import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }

    @Test
    public void fileTest() throws IOException{
        ArrayList<String> toTest = new ArrayList<String>();
        toTest.add("https://something.com");
        toTest.add("some-thing.html");

        assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file.md"))),
            toTest);
    }
}
