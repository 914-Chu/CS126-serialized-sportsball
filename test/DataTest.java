import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    @Test
    public void canReadFileFromFolder() throws Exception {
        String testFileContents = Data.getFileContents("test_resources", "test_file_contents.txt");
        assertEquals("Gone, reduced to atoms", testFileContents);
    }

    @Test
    public void name() {
    }
}
