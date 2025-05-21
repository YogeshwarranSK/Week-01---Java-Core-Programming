import java.util.Scanner;
public class calculateTotalDistTravelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Starting from City:");
        String fromCity = sc.nextLine();
        System.out.println("Via City:");
        String viaCity = sc.nextLine();
        System.out.println("To city");
        String toCity = sc.nextLine();

        System.out.println("Distance From to Via");
        double distanceFromToVia = sc.nextDouble();
        System.out.println("Time From to Via");
        int timeFromToVia = sc.nextInt();

        System.out.println("Distance Via to Final city");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.println("Time Via to Final city");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " hours");
    }
}

