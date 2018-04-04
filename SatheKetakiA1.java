public class SatheKetakiA1 {

    public static void main(String args[]) {
        //According to JCS, variable name should start with lowerCase, hence I have named it marks instead of Marks
        int marks = 56;

        System.out.println((marks >= 40) ? printPass() : printFail());
        System.out.println("Program Completed");
    }

    private static String printPass() {
        return "Pass" + "\n" + "Congratulations!!";
    }

    private static String printFail() {
        return "Fail" + "\n" + "Better Luck Next Time!";
    }

}

