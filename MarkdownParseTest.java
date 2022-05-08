import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
        // mark from server
        @Test 
        public void fileTest() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();
                toTest.add("https://something.com");
                toTest.add("some-thing.html");

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file.md"))),
                                toTest);
        }

        @Test
        public void fileTest2() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();
                toTest.add("https://something.com");
                toTest.add("some-page.html");

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file2.md"))),
                                toTest);
        }

        @Test
        public void fileTest3() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file3.md"))),
                                toTest);
        }

        @Test
        public void fileTest4() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file4.md"))),
                                toTest);
        }

        @Test
        public void fileTest5() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();
                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file5.md"))),
                                toTest);
        }

        @Test
        public void fileTest6() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file6.md"))),
                                toTest);
        }

        @Test
        public void fileTest7() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file7.md"))),
                                toTest);
        }

        @Test
        public void fileTest8() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();

                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file8.md"))),
                                toTest);
        }

        @Test
        public void fileTest9() throws IOException {
                ArrayList<String> toTest = new ArrayList<String>();
                toTest.add("xxx.com");
                assertEquals(
                                MarkdownParse.getLinks(Files.readString(
                                                Path.of("test-file9.md"))),
                                toTest);
        }
}
