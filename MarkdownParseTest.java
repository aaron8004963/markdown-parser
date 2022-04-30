import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void fileTest() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();
        toTest.add("https://something.com");
        toTest.add("some-thing.html");

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file.md"))),
                toTest);
    }

    @Test
    public void fileTest2() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();
        toTest.add("https://something.com");
        toTest.add("some-page.html");

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file2.md"))),
                toTest);
    }

    @Test
    public void fileTest3() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file3.md"))),
                toTest);
    }

    @Test
    public void fileTest4() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file4.md"))),
                toTest);
    }

    @Test
    public void fileTest5() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();
        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file5.md"))),
                toTest);
    }

    @Test
    public void fileTest6() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file6.md"))),
                toTest);
    }

    @Test
    public void fileTest7() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file7.md"))),
                toTest);
    }

    @Test
    public void fileTest8() throws IOException {
        ArrayList<String> toTest = new ArrayList<String>();

        assertEquals(
                MarkdownParse.getLinks(Files.readString(
                        Path.of("C:/Users/aaron/OneDrive/Desktop/Java/cse 15/markdown-parser/test-file8.md"))),
                toTest);
    }
    
    @Test
    public void failTest() {
            assertEquals(1,2);
    }
}
