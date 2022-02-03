
   
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import org.junit.*;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTester() throws IOException {
        String contentsTest = Files.readString(Path.of("test-file.md"));
        assertEquals(List.of("fail test", "some-page.html"),
            MarkdownParse.getLinks(contentsTest));
        
        
   }
}