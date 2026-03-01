class Banner {

    // Generate letter O
    public String[] generateO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Generate letter P
    public String[] generateP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Generate letter S
    public String[] generateS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    // Display OOPS banner
    public void displayOOPS() {

        String[] O1 = generateO();
        String[] O2 = generateO();
        String[] P  = generateP();
        String[] S  = generateS();

        String[] banner = {
            String.join("   ", O1[0], O2[0], P[0], S[0]),
            String.join("   ", O1[1], O2[1], P[1], S[1]),
            String.join("   ", O1[2], O2[2], P[2], S[2]),
            String.join("   ", O1[3], O2[3], P[3], S[3]),
            String.join("   ", O1[4], O2[4], P[4], S[4]),
            String.join("   ", O1[5], O2[5], P[5], S[5]),
            String.join("   ", O1[6], O2[6], P[6], S[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        Banner banner = new Banner();   // Object creation
        banner.displayOOPS();           // Method call
    }
}
