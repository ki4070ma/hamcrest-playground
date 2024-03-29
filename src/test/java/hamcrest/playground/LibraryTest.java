/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hamcrest.playground;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.MatcherAssert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testSuccessful() {
        assertTrue(true);
    }

    @Test public void testIs() {
        assertThat("hoge", is("hoge"));
    }
}
