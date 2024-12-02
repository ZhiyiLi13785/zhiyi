package components.TextCharacter;

import components.standard.Standard;

/**
 * Kernel interface for managing numerical operations.
 */
public interface TextCharacterKernel extends Standard<TextCharacter> {

    /**
     * Returns the number of characters (letters, operators, and spaces) in this
     * text character component.
     *
     * @return the number of characters in the text character component
     * @ensures size = [the total number of characters in this]
     */
    int size();

    /**
     * Reports whether this text character component is empty.
     *
     * @return true if the text character component is empty, false otherwise
     * @ensures isEmpty = (this.size() == 0)
     */
    boolean isEmpty();

    /**
     * Adds the specified character to this text character component.
     *
     * @param k
     *            the character to add
     * @replaces this
     * @ensures this = #this with {@code k} appended
     * @updates this
     */
    void add(char k);

    /**
     * Removes the last character from this text character component.
     *
     * @throws IllegalStateException
     *             if the text character component is empty
     * @requires this.size() > 0
     * @ensures this = #this with the last character removed
     * @updates this
     */
    void reduce();

}
