public class equalDistributionofPens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int equally_divisible = pens / students;
        int remainder = pens % students;
        System.out.println("Number of pens equally divisible by students: " + equally_divisible);
        System.out.println("Number of pens not equally divisible by students: " + remainder);
    }
}