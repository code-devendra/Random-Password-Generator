import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args){
        // 1. make sixteen sets of words to choose from.

        String[] wordList1 = {"~","!","^","*","?"};
        String[] wordList2 = {"a","b","c","d","e","f","g","h","i","j","k","l","m"};
        String[] wordList3 = {"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] wordList4 = {"1","3","5","7","9"};
        String[] wordList5 = {"n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] wordList6 = {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        String[] wordList7 = {"@","#","$","%","&"};
        String[] wordList8 = {"0","2","4","6","8"};
        String[] wordList9 = {"~","!","$","?"};
        String[] wordList10 = {"a","b","c","d","e","f","g","i","j","k","l","n"};
        String[] wordList11 = {"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] wordList12 = {"1","3","5","7","9"};
        String[] wordList13 = {"m","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] wordList14 = {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        String[] wordList15= {"@","#","*","%","&"};
        String[] wordList16 = {"0","2","4","6","8"};

        // 2. find out how many words are in each list.

        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordList3.length;
        int fourLength = wordList4.length;
        int fiveLength = wordList5.length;
        int sixLength = wordList6.length;
        int sevenLength = wordList7.length;
        int eightLength = wordList8.length;
        int nineLength = wordList9.length;
        int tenLength = wordList10.length;
        int elevenLength = wordList11.length;
        int twelveLength = wordList12.length;
        int thirteenLength = wordList13.length;
        int fourteenLength = wordList14.length;
        int fifteenLength = wordList15.length;
        int sixteenLength = wordList16.length;


        // 3. generate sixteen random numbers.

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);
        int rand5 = (int) (Math.random() * fiveLength);
        int rand6 = (int) (Math.random() * sixLength);
        int rand7 = (int) (Math.random() * sevenLength);
        int rand8 = (int) (Math.random() * eightLength);
        int rand9 = (int) (Math.random() * nineLength);
        int rand10 = (int) (Math.random() * tenLength);
        int rand11 = (int) (Math.random() * elevenLength);
        int rand12 = (int) (Math.random() * twelveLength);
        int rand13 = (int) (Math.random() * thirteenLength);
        int rand14 = (int) (Math.random() * fourteenLength);
        int rand15 = (int) (Math.random() * fifteenLength);
        int rand16 = (int) (Math.random() * sixteenLength);


        // 4. now take no. of digits from user
        int digits;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of digit you want in your password (in between - 6 to 16) :");
        digits = sc.nextInt();

        // 5. now print password for no. of digits enter by the user
        String password;
        switch (digits) {
            case 6 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList8[rand8];
                System.out.println("Your Random Password is -> " + password);
            }
            case 7 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList8[rand8];
                System.out.println("Your Random Password is -> " + password);
            }
            case 8 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8];
                System.out.println("Your Random Password is -> " + password);
            }
            case 9 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9];
                System.out.println("Your Random Password is -> " + password);
            }
            case 10 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10];
                System.out.println("Your Random Password is -> " + password);
            }
            case 11 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11];
                System.out.println("Your Random Password is -> " + password);
            }
            case 12 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11] + "" + wordList12[rand12];
                System.out.println("Your Random Password is -> " + password);
            }
            case 13 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11] + "" + wordList12[rand12] + "" + wordList13[rand13];
                System.out.println("Your Random Password is -> " + password);
            }
            case 14 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11] + "" + wordList12[rand12] + "" + wordList13[rand13] + "" + wordList14[rand14];
                System.out.println("Your Random Password is -> " + password);
            }
            case 15 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11] + "" + wordList12[rand12] + "" + wordList13[rand13] + "" + wordList14[rand14] + "" + wordList15[rand15];
                System.out.println("Your Random Password is -> " + password);
            }
            case 16 -> {
                password = wordList1[rand1] + "" + wordList2[rand2] + "" + wordList3[rand3] + "" + wordList4[rand4] + "" + wordList5[rand5] + "" + wordList6[rand6] + "" + wordList7[rand7] + "" + wordList8[rand8] + "" + wordList9[rand9] + "" + wordList10[rand10] + "" + wordList11[rand11] + "" + wordList12[rand12] + "" + wordList13[rand13] + "" + wordList14[rand14] + "" + wordList15[rand15] + "" + wordList16[rand16];
                System.out.println("Your Random Password is -> " + password);
            }
            default -> System.out.println("Incorrect digit!");
        }

    }
}
