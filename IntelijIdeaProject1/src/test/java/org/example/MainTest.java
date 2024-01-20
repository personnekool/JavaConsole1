package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.*;
import static org.junit.jupiter.api.Assertions.*;

@ClassPreamble(
        author = "Mauricio Bedoya",
        date = "01/01/2024",
        currentRevision = 3,
        lastModified = "17/01/2024",
        lastModifiedBy = "Mauricio Bedoya"
)
public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final static PrintStream originalOut = System.out;
    private final String msgInputNotNumeric = "Program terminates due to incorrect input from user !!\n";
    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outContent));
    }
    @AfterAll
    public static void restore1(){
        System.setOut(originalOut);
    }
    @Test
    void firstInputNonNumeric() throws Exception {
        withTextFromSystemIn("a").execute(()->Main.main(null));
        String expected = "Type number1: "+msgInputNotNumeric;
        assertEquals(expected, outContent.toString());
    }
    @Test
    void secondInputNonNumeric() throws Exception{
        withTextFromSystemIn("1","a").execute(()->Main.main(null));
        String expected = "Type number1: Type number2: "+ msgInputNotNumeric;
        assertEquals(expected, outContent.toString());
    }
    @Test
    void bothInputNumbers() throws Exception{
        withTextFromSystemIn("1","2").execute(()->Main.main(null));
        String expected = """
Type number1: Type number2: 1.0 + 2.0 = 3.0
1.0 - 2.0 = -1.0
1.0 * 2.0 = 2.0
1.0 / 2.0 = 0.5
                """;
        assertEquals(expected, outContent.toString());
    }

}
