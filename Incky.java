public class Inky {
    public Inky(String x) {
        System.out.println(x);
    }

    public Inky(String pinky, String blincky, String rincky) {
        System.out.println(blincky + " " + pinky);
        System.out.println(pinky + " " + rincky);
        System.out.println(blincky + " " + pinky + " " + rincky);
    }

    public static void main(String args[]) {
        String pincky = "Doncky";
        Inky poncky = new Inky(pincky);
        String blincky = "pincky";
        String rincky = "moncky";

        Inky poncky2 = new Inky(pincky, blincky, rincky);
    }
}