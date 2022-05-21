import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseSnippetTest {
    // mark from server
    @Test 
    public void myTest() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("`google.com");
            toTest.add("google.com");
            toTest.add("ucsd.edu");

            assertEquals(toTest,
                            MarkdownParse.getLinks(Files.readString(
                                            Path.of("Snippet_1.md"))));
    }

    @Test 
    public void myTest2() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("a.com");
            toTest.add("a.com(())");
            toTest.add("example.com");

            assertEquals(toTest,
                            MarkdownParse.getLinks(Files.readString(
                                            Path.of("Snippet_2.md"))));
    }

    @Test 
    public void myTest3() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("https://www.twitter.com");
            toTest.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
            toTest.add("https://cse.ucsd.edu/");

            assertEquals(toTest,
                            MarkdownParse.getLinks(Files.readString(
                                            Path.of("Snippet_3.md"))));
    }

    @Test 
    public void reviewedTest1() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("`google.com");
            toTest.add("google.com");
            toTest.add("ucsd.edu");

            assertEquals(toTest,
                MarkdownParseReviewed.getLinks(Files.readString(
                                            Path.of("Snippet_1.md"))));
    }

    @Test 
    public void reviewedTest2() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("a.com");
            toTest.add("a.com(())");
            toTest.add("example.com");

            assertEquals(toTest,
                MarkdownParseReviewed.getLinks(Files.readString(
                                            Path.of("Snippet_2.md"))));
    }

    @Test 
    public void reviewedTest3() throws IOException {
            ArrayList<String> toTest = new ArrayList<String>();
            toTest.add("https://www.twitter.com");
            toTest.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
            toTest.add("https://cse.ucsd.edu/");

            assertEquals(toTest,
                MarkdownParseReviewed.getLinks(Files.readString(
                                            Path.of("Snippet_3.md"))));
    }

}
