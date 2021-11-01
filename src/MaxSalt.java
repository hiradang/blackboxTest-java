public class MaxSalt {
    public static void main(String args[]) {

    }
    public String maxAmountOfSalt(String gender, int age) {
        String message = "";
        String invalidInputMessage = "Invalid Input";
        if (gender.equals("M")) {
            if (age < 0) {
                message = invalidInputMessage;
            } else if (age <= 2) {
                message += "3 grams";
            } else if (age <= 5) {
                message += "4 grams";
            } else if (age <= 7) {
                message += "5 grams";
            } else if (age <= 11) {
                message += "6.5 grams";
            } else if (age <= 18) {
                message += "8 grams";
            } else {
                message = invalidInputMessage;
            }
        } else {
            if (age < 0) {
                message = invalidInputMessage;
            } else if (age <= 2) {
                message += "3.5 grams";
            } else if (age <= 5) {
                message += "4.5 grams";
            } else if (age <= 7) {
                message += "5.5 grams";
            } else if (age <= 18) {
                message += "7 grams";
            } else {
                message = invalidInputMessage;
            }
        }
        return message;
    }
}
