public class MaxSalt {
    public static void main(String args[]) {

    }
    public String maxAmountOfSalt(String gender, int age) {
        String msg = "";
        if (gender.equals("M")) {
            if (age < 0 || age > 18) {
                msg = "Invalid Input";
            } else if (age <= 2) {
                msg = "3 grams";
            } else if (age <= 5) {
                msg = "4 grams";
            } else if (age <= 7) {
                msg = "5 grams";
            } else if (age <= 11) {
                msg = "6.5 grams";
            } else {
                msg = "8 grams";
            }
        } else {
            if (age < 0 || age > 18) {
                msg = "Invalid Input";
            } else if (age <= 2) {
                msg = "3.5 grams";
            } else if (age <= 5) {
                msg = "4.5 grams";
            } else if (age <= 7) {
                msg = "5.5 grams";
            } else {
                msg = "7 grams";
            }
        }
        return msg;
    }
}
