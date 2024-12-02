package components.TextCharacter;

public abstract class TextCharacterSecondary implements TextCharacter {

    @Override
    public abstract int size();

    protected abstract void setFromString(String text);

    private String DEFAULT_LEGAL_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!()";

    @Override
    public boolean contains(char k) {
        boolean decide = false;
        for (int i = 0; i < this.DEFAULT_LEGAL_CHARACTERS.length(); i++) {
            if (this.charAt(i) == k) {
                decide = true;
            }
        }
        return decide;
    };

    @Override
    public boolean contains(String k) {
        if (k == null || k.isEmpty()) {
            throw new IllegalArgumentException(
                    "String k must not be null or empty.");
        }
        for (int i = 0; i <= this.size() - k.length(); i++) {
            boolean match = true;
            for (int j = 0; j < k.length(); j++) {
                if (this.charAt(i + j) != k.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void reduceCharacter(char k) {
        StringBuilder updatedText = new StringBuilder();
        if (this.contains(k)) {
            for (int i = 0; i < this.size(); i++) {
                char current = this.charAt(i);
                if (current != k) {
                    updatedText.append(current);
                }
            }
        }
        this.setFromString(updatedText.toString());
    };

    @Override
    public char charAt(int n1) {
        if (n1 < 0 || n1 >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + n1);
        }
        return this.toString().charAt(n1); // Assuming toString gives the correct sequence
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            result.append(this.charAt(i));
        }
        return result.toString();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        TextCharacter other = (TextCharacter) obj;

        if (this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (this.charAt(i) != other.charAt(i)) {
                return false;
            }
        }

        return true;
    }

};
