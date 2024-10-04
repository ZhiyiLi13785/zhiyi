import components.binarytree.BinaryTree1;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class textCharacter {

    private String DEFAULT_LEGAL_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!()"

    private legalCharacter;

    public textCharacter() {
        //initialize
        this.legalCharacter = this.DEFAULT_LEGAL_CHARACTERS;
    }

    /**
     * No argument constructor--private to prevent instantiation.
     */
    public textCharacter(String legalCharacter) {
        //initialize
        this.legalCharacter = legalCharacter;
    }

    private boolean isTextCharacter(char check) {
        return this.DEFAULT_LEGAL_CHARACTERS.contains(check);
    }

private static void add(String input){
    for(int i=0;i<input.lenghth(),i++){
        char check = input.charAt(i);
        if(this.isTextCharacter(check)){
            this.legalCharacter.add(check);
        }
    }
}

    private static void reduce() {
        if (!this.legalCharacter.isEmpty()) {
            this.legalCharacter = this.legalCharacter.substring(0,
                    this.legalCharacter.length() - 1);

        }
    }

    private static boolean empty() {
        return !this.legalCharacter.isEmpty();
    }

    private static int size() {
        return !this.legalCharacter.length();
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
        this.tree = new BinaryTree1<>();

        TextCharacter useA = new TextCharacter();
        char test = 'a';
        out.println("Is '" + test + "' a legal character? "
                + useA.isTextCharacter(testChar));
        useA.add("xyz");
        out.println("Added 'xyz'. Legal characters size: " + useA.size());
        useA.reduce();
        out.println("the size for useA is" + useA.size());
        out.print("whether useA is empty：" + useA.empty());

        in.close();
        out.close();
    }
}