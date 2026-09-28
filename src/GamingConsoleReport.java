
public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2D
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        // 1D
        int[] totals = new int[cities.length];

        // Calculate totals
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                totals[i] += sales[i][j];
            }
        }

        // Find city
        int maxIndex = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }

        // Display report
        System.out.println("----------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i].toUpperCase());
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i].toUpperCase(), totals[i]);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex].toUpperCase());
        System.out.println("----------------------------------------------------");
    }
}