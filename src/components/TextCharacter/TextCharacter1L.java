package components.TextCharacter;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Enhanced interface for managing a specific English letter string with common
 * punctuation and spaces, adding advanced text processing methods.
 */

/**
 * Convention: - The `legalCharacter` string must only contain characters from
 * the set: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!()", it is
 * fixed! - The `legalCharacter` string must not contain duplicate characters. -
 * The order is not important, contain is ok, they do not contain number.
 *
 * Correspondence: - The abstract value of this component is a set of
 * characters. - Each character in the set corresponds to one and only one
 * occurrence in the `legalCharacter` string. - The order is not important,
 * includes most of character needed is ok.
 */

public class TextCharacter1L extends TextCharacterSecondary {

    // TODO: implement only kernel methods

    private String DEFAULT_LEGAL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!()#";

    private String legalCharacter;

    public TextCharacter1L() {
        //initialize
        this.legalCharacter = "";
    }

    @Override
    public TextCharacter newInstance() {
        return new TextCharacter1L();
    }

    /**
     * No argument constructor--private to prevent instantiation.
     */
    public TextCharacter1L(String legalCharacter) {
        //initialize
        this.legalCharacter = legalCharacter;
    }

    private boolean isTextCharacter(char check) {
        boolean decide = false;
        for (int i = 0; i < this.DEFAULT_LEGAL_CHARACTERS.length(); i++) {
            if (this.DEFAULT_LEGAL_CHARACTERS.charAt(i) == check) {
                decide = true;
            }
        }
        return decide;
    }

    @Override
    public void add(char k) {
        if (this.isTextCharacter(k)) {
            this.legalCharacter += k;
        }
    }

    @Override
    public char charAt(int n1) {
        if (n1 < 0 || n1 >= this.size()) {
            throw new IndexOutOfBoundsException(
                    n1 + " is out of range of 0 and " + (this.size() - 1));
        }
        // Access the character at the specified index directly from legalCharacter
        return this.legalCharacter.charAt(n1);
    }

    @Override
    public boolean isEmpty() {
        boolean decide = false;
        if (this.legalCharacter.length() == 0) {
            decide = true;
        }
        return decide;
    }

    @Override
    public void reduce() {
        if (!this.legalCharacter.isEmpty()) {
            // Remove the last character from the string
            this.legalCharacter = this.legalCharacter.substring(0,
                    this.legalCharacter.length() - 1);
        } else {
            throw new IllegalStateException("Cannot reduce an empty text.");
        }
    }

    @Override
    public int size() {
        int n = this.legalCharacter.length();
        return n;
    }

    @Override
    public void clear() {
        this.legalCharacter = "";

    }

    @Override
    public void transferFrom(TextCharacter source) {
        if (source instanceof TextCharacter1L) {
            TextCharacter1L src = (TextCharacter1L) source;
            this.legalCharacter = src.legalCharacter;
            src.clear();
        }
    }

    @Override
    public void setFromString(String text) {
        this.legalCharacter = text;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        // Create an instance of TextCharacter1L
        TextCharacter1L useA = new TextCharacter1L();

        // Test isEmpty
        out.println("Initial isEmpty: " + useA.isEmpty());

        // Test adding characters
        useA.add('x');
        useA.add('y');
        useA.add('z');
        out.println("After adding 'xyz': " + useA);

        // Test size
        out.println("Size: " + useA.size());

        // Test reduce
        useA.reduce();
        out.println("After reducing: " + useA);

        // Test clear
        useA.clear();
        out.println("After clearing: " + useA.isEmpty());

        in.close();
        out.close();
    }

}
