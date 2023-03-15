package pl.plonka.marcel.third;

import java.util.PrimitiveIterator;

public class ZadanieSzachy {
    private static String[][] cheesBoard = {
            new String[]{"A8","B8","C8","D8","E8","F8","G8","H8"},
            new String[]{"A7","B7","C7","D7","E7","F7","G7","H7"},
            new String[]{"A6","B6","C6","D6","E6","F6","G6","H6"},
            new String[]{"A5","B5","C5","D5","E5","F5","G5","H5"},
            new String[]{"A4","B4","C4","D4","E4","F4","G4","H4"},
            new String[]{"A3","B3","C3","D3","E3","F3","G3","H3"},
            new String[]{"A2","B2","C2","D2","E2","F2","G2","H2"},
            new String[]{"A1","B1","C1","D1","E1","F1","G1","H1"},
    };
    private final static String król = "K";
    private final static String hetman = "Q";
    private final static String goniec = "B";
    private final static String skoczek = "N";
    private final static String wieża = "R";
    private final static String pionek = "P";

    public static void main(String[] args) {
        displayCheesBoard();
    }

    static void stateOfTheGame() {
        // czarne
        cheesBoard[0][0] = wieża;
        cheesBoard[0][2] = król;
        cheesBoard[0][7] = wieża;
        cheesBoard[1][0] = pionek;
        cheesBoard[1][3] = skoczek;
        cheesBoard[1][4] = goniec;
        cheesBoard[1][6] = pionek;
        cheesBoard[2][2] = goniec;
        cheesBoard[2][7] = pionek;
        cheesBoard[3][1] = pionek;
        cheesBoard[3][3] = skoczek;
        cheesBoard[3][5] = pionek;

        // białe
        cheesBoard[4][2] = pionek;
        cheesBoard[4][3] = pionek;
        cheesBoard[5][3] = hetman;
        cheesBoard[5][5] = skoczek;
        cheesBoard[5][6] = goniec;
        cheesBoard[6][1] = pionek;
        cheesBoard[6][5] = pionek;
        cheesBoard[6][6] = pionek;
        cheesBoard[6][7] = pionek;
        cheesBoard[7][0] = wieża;
        cheesBoard[7][6] = król;
    }

    static void displayCheesBoard() {
        stateOfTheGame();
        for(String[] strings : cheesBoard) {
            System.out.println();
            for(String string : strings) {
                if(string.equals(król) || string.equals(hetman)
                        || string.equals(goniec) || string.equals(skoczek)
                        || string.equals(wieża) || string.equals(pionek)) {
                    System.out.print(string + " ");
                }
                System.out.print("\t");
            }
        }
    }
}
