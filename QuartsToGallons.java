public class QuartsToGallons {
    public static void main(String[] args) {
        int quarts_in_gallon = 4;
        int quarts_needed_for_paint_job = 18;

        System.out.println("You'll need " + quarts_needed_for_paint_job / quarts_in_gallon +
                " gallons for this job plus " + quarts_needed_for_paint_job % quarts_in_gallon + " quarts");
    }
}