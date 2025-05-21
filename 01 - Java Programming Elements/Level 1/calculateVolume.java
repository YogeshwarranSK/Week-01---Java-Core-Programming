public class calculateVolume {
    public static void main(String[] args){
        int r_km = 6378;
        double volume_km = (double)4/3 * 3.14 * r_km * r_km;
        double r_mile = r_km * 1.6;
        double volume_mile = (double)4/3 * 3.14 * r_mile * r_mile;
        System.out.println("Volume of Earth in km3:" + volume_km);
        System.out.println("Volume of Earth in mile3:" + volume_mile);

    }
}