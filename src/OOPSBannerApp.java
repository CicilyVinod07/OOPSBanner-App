import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp {

    private Map<Character, CharacterPattern> patternMap = new HashMap<>();

    public OOPSBannerApp() {
        initializePatterns();
    }

    public static void main(String[] args) {
        OOPSBannerApp app = new OOPSBannerApp();
        app.displayWord("OOPS");
    }

    // Initialize stored character-pattern mappings
    private void initializePatterns() {

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));
    }

    // Display any word using stored mappings
    public void displayWord(String word) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = patternMap.get(ch);

                if (cp != null) {
                    System.out.print(cp.getPattern()[row] + "   ");
                }
            }

            System.out.println();
        }
    }
}