package components.TextCharacter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * test the method in TextCharacter.
 */
public class TextCharacterTest {

    /**
     * Test contain a string correctly.
     */
    @Test
    public void testContainsStringT() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('H');
        textCharacter.add('e');
        textCharacter.add('l');
        textCharacter.add('l');
        textCharacter.add('o');

        assertTrue(textCharacter.contains("Hello"));
    }

    /**
     * Test contain a string incorrectly.
     */
    @Test
    public void testContainsStringF() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('A');
        textCharacter.add('P');
        textCharacter.add('P');

        assertFalse(textCharacter.contains("Hello"));
    }

    /**
     * Test contain a string correctly, is empty.
     */
    @Test
    public void testContainsStringEmpty() {
        TextCharacter textCharacter = new TextCharacter1L();
        assertFalse(textCharacter.contains("Hello"));
    }

    /**
     * Test contain a character correctly.
     */
    @Test
    public void testContainsCharOneT() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('A');

        assertTrue(textCharacter.contains('A'));
    }

    /**
     * Test contain many characters correctly.
     */
    @Test
    public void testContainsCharManyT() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('A');
        textCharacter.add('e');
        textCharacter.add('l');
        textCharacter.add('l');
        textCharacter.add('o');

        assertTrue(textCharacter.contains('A'));
    }

    /**
     * Test contain many characters incorrectly.
     */
    @Test
    public void testContainsCharManyF() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('e');
        textCharacter.add('l');
        textCharacter.add('o');

        assertFalse(textCharacter.contains('A'));
    }

    /**
     * Test contain a character, it is empty, incorrectly.
     */
    @Test
    public void testContainsCharEmptyF() {
        TextCharacter textCharacter = new TextCharacter1L();
        assertFalse(textCharacter.contains('A'));
    }

    /**
     * Test reduce a character correctly.
     */
    @Test
    public void testReduceCharacterT() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('A');
        textCharacter.add('B');
        textCharacter.add('C');

        textCharacter.reduceCharacter('B');
        assertFalse(textCharacter.contains('B'));
    }

    /**
     * Test contain many character, the result is false.
     */
    @Test
    public void testReduceCharacterF() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('A');
        textCharacter.add('B');
        textCharacter.add('C');
        textCharacter.reduceCharacter('A');
        textCharacter.reduceCharacter('B');
        assertFalse(textCharacter.contains('A'));
        assertFalse(textCharacter.contains('B'));
        assertTrue(textCharacter.contains('C'));
    }

    /**
     * Test charAt a character correctly.
     */
    @Test
    public void testCharAtT() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.add('X');
        textCharacter.add('Y');
        textCharacter.add('Z');

        assertEquals('Y', textCharacter.charAt(1));
        assertEquals('X', textCharacter.charAt(0));
    }

}
