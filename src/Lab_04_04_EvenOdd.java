public class Lab_04_04_EvenOdd {
    public static void main(String[] args) {

        int numToExamine = 2;
        int remainder = numToExamine % 2;
        System.out.println("The number to examine is: " + numToExamine);

        if (remainder == 0) {
            System.out.println(numToExamine + " is Even because " + numToExamine + " % 2 = 0");
        } else {
            System.out.println(numToExamine + " is Odd because " + numToExamine + " % 2 = 1");
        }
    }
}
//yay