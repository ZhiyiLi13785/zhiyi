package components.TextCharacter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * test the method in TextCharacterKernal.
 */
public class TextCharacterKernalTest {

    /**
     * Test add single character.
     */
    @Test
    public void testAddSpecialCharacters() {
        TextCharacter textCharacter = new TextCharacter1L();

        textCharacter.add(')');
        textCharacter.add('!');
        textCharacter.add(',');

        assertEquals(')', textCharacter.charAt(0));
        assertEquals('!', textCharacter.charAt(1));
        assertEquals(',', textCharacter.charAt(2));
    }

    /**
     * test the empty size.
     */
    @Test
    public void testSizeInitialState() {
        TextCharacter textCharacter = new TextCharacter1L();

        assertEquals(0, textCharacter.size());
    }

    /**
     * test the size for one character.
     */
    @Test
    public void testSizeAfterAddingOneCharacters() {
        TextCharacter textCharacter = new TextCharacter1L();

        textCharacter.add('X');
        assertEquals(1, textCharacter.size());

    }

    /**
     * test the size for many characters.
     */
    @Test
    public void testSizeAfterAddManyCharacters() {
        TextCharacter textCharacter = new TextCharacter1L();

        final int n1 = 3;
        textCharacter.add('A');
        textCharacter.add('B');
        textCharacter.add('C');

        assertEquals(n1, textCharacter.size());

    }

    /**
     * test it is empty and result is true.
     */
    @Test
    public void testIsEmptyT() {
        TextCharacter textCharacter = new TextCharacter1L();

        assertTrue(textCharacter.isEmpty());
    }

    /**
     * test it is empt and the result is false.
     */
    @Test
    public void testIsEmptyF() {
        TextCharacter textCharacter = new TextCharacter1L();

        textCharacter.add('A');
        assertFalse(textCharacter.isEmpty());
    }

    /**
     * test reduce one character.
     */
    @Test
    public void testReduceOne() {
        TextCharacter textCharacter = new TextCharacter1L();

        textCharacter.add('B');
        textCharacter.reduce();
        assertEquals(0, textCharacter.size());
        assertTrue(textCharacter.isEmpty());
    }

    /**
     * test reduce many characters.
     */
    @Test
    public void testReduceMany() {
        TextCharacter textCharacter = new TextCharacter1L();

        textCharacter.add('A');
        textCharacter.add('B');
        textCharacter.add('C');
        textCharacter.reduce();
        assertEquals(2, textCharacter.size());

    }

    /**
     * test SetFromString for a common string.
     */
    @Test
    public void testSetFromStringValidInput() {
        TextCharacter textCharacter = new TextCharacter1L();
        String input = "Hello, World!";

        textCharacter.setFromString(input);

        assertEquals(input, textCharacter.toString());
    }

    /**
     * test SetFromString for empty string.
     */
    @Test
    public void testSetFromStringEmptyString() {
        TextCharacter textCharacter = new TextCharacter1L();
        String input = "";

        textCharacter.setFromString(input);

        assertEquals(input, textCharacter.toString());
        assertEquals(0, textCharacter.size());
    }

    /**
     * test SetFromString for it has origional different value.
     */
    @Test
    public void testSetFromStringOverwritesPreviousState() {
        TextCharacter textCharacter = new TextCharacter1L();
        textCharacter.setFromString("OldState");
        String input = "NewState";

        textCharacter.setFromString(input);

    }
}
