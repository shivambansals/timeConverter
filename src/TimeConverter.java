import java.util.Scanner;

public class TimeConverter {
    private double seconds;

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public TimeConverter(double seconds) {
        this.seconds = seconds;
    }

    public void secondsToHour() {
        int hour = (int) seconds / 60 / 60;
        int minutes = (int) seconds / 60 % 60;
        int second = (int) seconds % 60;
        if (hour>1) System.out.printf(hour + " hours, ");
        else System.out.printf(hour + " hour, ");
        if (minutes>1) System.out.printf(minutes + " minutes and ");
        else System.out.printf(minutes + " minute and ");
        if (second>1) System.out.printf(second + " seconds");
        else System.out.printf(second + " seconds");

    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s;
        System.out.println("Enter the seconds-");
        s = scanner.nextInt();
        TimeConverter timeConverter = new TimeConverter(s);
        System.out.println("Seconds enter" + s);
        timeConverter.secondsToHour();

    }


}

