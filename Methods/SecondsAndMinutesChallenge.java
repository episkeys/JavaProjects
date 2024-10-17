public class SecondsAndMinutesChallenge {
    public static void getDurationString(int seconds) {
            if(seconds < 0){
                System.out.println("Seconds cannot be negative");
                return;
            }
        System.out.println(seconds /3600 + " Hours " + (seconds % 3600) / 60 + " Minutes " + (seconds % 3600 % 60) + " Seconds");
    }

    public static void main(String[] args) {
getDurationString(68769);
    }
}
