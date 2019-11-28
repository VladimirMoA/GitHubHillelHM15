import java.util.Scanner;

public class Draw {

    public static int[] convert(int number) {
        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        } return newGuess;
    }

    public static void draw(int[] array) {
        for (int i = 0;i < array.length; i++) {
            switch (array[i]) {
                case 0:
                case 2:
                case 3:
                case 6:
                case 8:
                case 9:
                    System.out.print(" @@@@  ");
                    break;
                case 1:
                    System.out.print("  @@   ");
                    break;
                case 4:
                    System.out.print("@@  @@ ");
                    break;
                case 5:
                case 7:
                    System.out.print("@@@@@@ ");
                    break;
            }
        }
        System.out.println();
        for (int i = 0;i < array.length; i++) {
            switch (array[i]) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 8:
                case 9:
                    System.out.print("@@  @@ ");
                    break;
                case 1:
                    System.out.print(" @@@   ");
                    break;
                case 5:
                case 6:
                    System.out.print("@@     ");
                    break;
                case 7:
                    System.out.print("   @@  ");
                    break;
            }
        }
        System.out.println();
        for (int i = 0;i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    System.out.print("@@  @@ ");
                    break;
                case 1:
                    System.out.print("@ @@   ");
                    break;
                case 2:
                case 3:
                    System.out.print("   @@  ");
                    break;
                case 4:
                    System.out.print("@@@@@@ ");
                    break;
                case 5:
                case 6:
                    System.out.print("@@@@@  ");
                    break;
                case 7:
                    System.out.print("  @@   ");
                    break;
                case 8:
                    System.out.print(" @@@@  ");
                    break;
                case 9:
                    System.out.print(" @@@@@ ");
                    break;
            }
        }
        System.out.println();
        for (int i = 0;i < array.length; i++) {
            switch (array[i]) {
                case 0:
                case 3:
                case 6:
                case 8:
                    System.out.print("@@  @@ ");
                    break;
                case 1:
                    System.out.print("  @@   ");
                    break;
                case 2:
                case 7:
                    System.out.print(" @@    ");
                    break;
                case 4:
                case 5:
                case 9:
                    System.out.print("    @@ ");
                    break;
            }
        }
        System.out.println();
        for (int i = 0;i < array.length; i++) {
            switch (array[i]) {
                case 0:
                case 3:
                case 6:
                case 8:
                case 9:
                    System.out.print(" @@@@  ");
                    break;
                case 1:
                case 2:
                    System.out.print("@@@@@@ ");
                    break;
                case 4:
                    System.out.print("    @@ ");
                    break;
                case 5:
                    System.out.print("@@@@@  ");
                    break;
                case 7:
                    System.out.print("@@     ");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            draw(convert(number));
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

}
