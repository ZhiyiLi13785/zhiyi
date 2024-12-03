package components.TextCharacter;

/**
 * finish the method in TextCharacter.
 */
public abstract class TextCharacterSecondary implements TextCharacter {

    private String DEFAULT_LEGAL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,!()#";

    @Override
    public boolean contains(char k) {
        // Check if the character is legal first
        if (this.DEFAULT_LEGAL_CHARACTERS.indexOf(k) == -1) {
            return false; // k is not a legal character, so it cannot be in legalCharacter
        }

        // Check if the character exists in the current text
        for (int i = 0; i < this.size(); i++) {
            if (this.charAt(i) == k) {
                return true;
            }
        }
        return false;
    }

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
