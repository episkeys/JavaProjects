public class overloadedChallenge {
    public static double convertToCentimeters(int heightInInches) {

        double centimeters = (heightInInches * 2.54);
        return centimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {

        return convertToCentimeters(heightInFeet * 12 + heightInInches);
    }


    public static void main(String[] args) {
double output = convertToCentimeters(5, 10);
        System.out.println(output);
    }
}
