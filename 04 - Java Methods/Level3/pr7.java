package Day4.Level3;
import java.util.HashSet;
public class pr7 {
    public static void main(String[] args) {
        int[] otpNumbers = new int[10];
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }
        boolean isUnique = areOTPsUnique(otpNumbers);
        if (isUnique) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("Some OTP numbers are not unique.");
        }
    }
    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }
    public static boolean areOTPsUnique(int[] otpNumbers) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpNumbers) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}
