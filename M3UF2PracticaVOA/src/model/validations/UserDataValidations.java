package model.validations;

import model.exceptions.InvalidIdException;
import model.exceptions.InvalidPostalCodeException;

public class UserDataValidations {

    public static void checkId(String id) throws InvalidIdException {
        if (id == null || id.length() != 9) {
            throw new InvalidIdException("El ID debe tener exactamente 9 caracteres.");
        }

        String posNumber = id.substring(0, 8);
        if (!isNumeric(posNumber)) {
            throw new InvalidIdException("Los primeros 8 caracteres del ID deben ser números.");
        }

        String posLetter = id.substring(8);
        if (!isAlphabetic(posLetter)) {
            throw new InvalidIdException("El último carácter del ID debe ser una letra.");
        }
    }

    public static void checkPostalCode(String zip) throws InvalidPostalCodeException {
        if (zip == null || zip.length() != 5) {
            throw new InvalidPostalCodeException("El código postal debe tener exactamente 5 dígitos.");
        }

        if (!isNumeric(zip)) {
            throw new InvalidPostalCodeException("El código postal solo puede contener números.");
        }
    }

    public static boolean checkFormatDate(String date) {
        boolean dateOk = false;

        if (date == null || date.isEmpty()) {
            return false;
        }

        String[] parts = date.split("/");

        if (parts.length == 3) {
            String day = parts[0];
            String month = parts[1];
            String year = parts[2];

            boolean dayOk = isNumeric(day);
            boolean monthOk = isNumeric(month);
            boolean yearOk = isNumeric(year);

            if (dayOk && monthOk && yearOk) {
                int dayInt = Integer.parseInt(day);
                int monthInt = Integer.parseInt(month);
                int yearInt = Integer.parseInt(year);

                if (dayInt >= 1 && dayInt <= 31 && monthInt >= 1 && monthInt <= 12 && yearInt > 0) {
                    dateOk = true;
                }
            }
        }

        return dateOk;
    }

    public static int calculateAge(String birthDate) {
        int age = -1;

        boolean dateOk = checkFormatDate(birthDate);
        if (dateOk) {
            String[] parts = birthDate.split("/");
            String day = parts[0];
            String month = parts[1];
            String year = parts[2];

            int dayInt = Integer.parseInt(day);
            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);

            java.util.Calendar today = java.util.Calendar.getInstance();
            int currentYear = today.get(java.util.Calendar.YEAR);
            int currentMonth = today.get(java.util.Calendar.MONTH) + 1;
            int currentDay = today.get(java.util.Calendar.DAY_OF_MONTH);

            age = currentYear - yearInt;

            if (currentMonth < monthInt || (currentMonth == monthInt && currentDay < dayInt)) {
                age--;
            }
        }

        return age;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isAlphabetic(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkEmail(String email) {
        return email != null &&
               email.contains("@") &&
               (email.endsWith(".com") || email.endsWith(".es"));
    }

    public static boolean checkName(String name) {
        if (name == null || name.length() <= 1 || name.length() > 30) {
            return false;
        }

        return isAlphabetic(name);
    }
}
