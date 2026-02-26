public class OopsBannerApp {

    public static void main(String[] args) {

        // Store all banner rows inside an array
        String[] bannerLines = {

            String.join("", " *****  ", "   ", " *****  ", "   ", " ****** ", "   ", " *****  "),
            String.join("", "*     * ", "   ", "*     * ", "   ", "*     * ", "   ", "*     * "),
            String.join("", "*     * ", "   ", "*     * ", "   ", "*     * ", "   ", "*       "),
            String.join("", "*     * ", "   ", "*     * ", "   ", "******  ", "   ", " *****  "),
            String.join("", "*     * ", "   ", "*     * ", "   ", "*       ", "   ", "      * "),
            String.join("", "*     * ", "   ", "*     * ", "   ", "*       ", "   ", "*     * "),
            String.join("", " *****  ", "   ", " *****  ", "   ", "*       ", "   ", " *****  ")
        };

        // Loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}