public class Jun11AN {

    public static void main(String[] args) {

        int marks = 67;
        printGrade(marks);

        int amount = 40000;
        System.out.println("Amount with Interest = " + calInterest(amount));

        int unit = 150;
        System.out.println("Unit Bill = " + calBills(unit));

        int runs = 100;
        int balls = 38;
        System.out.println("Strike Rate Category = " + strikeRateFinder(runs, balls));

        int n = 5000;
        int x = 300;
        int y = 100;
        System.out.println("Tank Filling Hours = " + tankHours(n, x, y));
    }

    public static void printGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else if (marks >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Fail");
        }
    }

    public static int calInterest(int amount) {
        if (amount > 50000) {
            return amount + (amount * 3) / 100;
        } else if (amount > 30000) {
            return amount + (amount * 6) / 100;
        } else if (amount > 20000) {
            return amount + (amount * 8) / 100;
        } else if (amount > 10000) {
            return amount + (amount * 10) / 100;
        }

        return amount;
    }

    public static int calBills(int unit) {
        int bill;

        if (unit > 300) {
            bill = 100 * 5 + 100 * 6 + 100 * 7 + (unit - 300) * 8;
        } else if (unit > 200) {
            bill = 100 * 5 + 100 * 6 + (unit - 200) * 7;
        } else if (unit > 100) {
            bill = 100 * 5 + (unit - 100) * 6;
        } else {
            bill = unit * 5;
        }

        return bill;
    }

    public static String strikeRateFinder(int runs, int balls) {
        int strikeRate = (runs * 100) / balls;

        if (strikeRate > 150) {
            return "Explosive";
        } else if (strikeRate > 100) {
            return "Good";
        } else {
            return "Slow";
        }
    }

    public static int tankHours(int n, int x, int y) {
        return n / (x - y);
    }
}