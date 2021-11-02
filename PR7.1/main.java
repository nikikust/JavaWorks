import java.util.Scanner;
import java.util.Stack;


public class main {
    public static void cls()
    {
        for (int i = 0; i < 50; i++) { System.out.println(); }
    }

    public static void play() {
        Scanner scanner2 = new Scanner(System.in);
        Stack<Integer> part01 = new Stack<Integer>(), part02 = new Stack<Integer>(), buf1 = new Stack<Integer>(), buf2 = new Stack<Integer>();

        int turn = 0;

        // --- //

        System.out.print("Stack\nВведите колоду 1: ");
        for (int i = 0; i < 5; i++) {
            if (scanner2.hasNextInt()) {
                buf1.push(scanner2.nextInt());
            } else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        System.out.print("Введите колоду 2: ");
        for (int i = 0; i < 5; i++) {
            if (scanner2.hasNextInt()) {
                buf2.push(scanner2.nextInt());
            } else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        if (part01.empty())
            while (!buf1.isEmpty()) {
                part01.push(buf1.pop());
            }
        if (part02.empty())
            while (!buf2.isEmpty()) {
                part02.push(buf2.pop());
            }

        while (++turn <= 106 && !part01.isEmpty() && !part02.isEmpty()) {
            System.out.println(part01.peek() + " " + part02.peek());
            if ((part01.peek() < part02.peek() && !(part01.peek() == 0 && part02.peek() == 9)) || (part01.peek() == 9 && part02.peek() == 0)) {
                buf2.push(part01.pop());
                buf2.push(part02.pop());
            } else {
                buf1.push(part01.pop());
                buf1.push(part02.pop());
            }

            if (part01.empty())
                while (!buf1.isEmpty()) {
                    part01.push(buf1.pop());
                }
            if (part02.empty())
                while (!buf2.isEmpty()) {
                    part02.push(buf2.pop());
                }
        }

        if (part01.isEmpty())
            System.out.println("Второй игрок выиграл за " + (turn - 1) + " ходов");
        else if (part02.isEmpty())
            System.out.println("Первый игрок выиграл за " + (turn - 1) + " ходов");
        else
            System.out.println("botva");

        System.out.print("\n\n");
        // --- //

        scanner2.close();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean work = true;

        while(work) {
            System.out.print("Welcome to the game!\n1 - Start\n2 - Exit\n> ");

            while(!scanner.hasNextInt()) {}

            switch (scanner.nextInt()) {
                case 1:
                    cls();
                    play();
                    break;
                case 2:
                    work = false;
                    break;
                default:
                    System.out.println("Wrong operation\n\n");
            }
        }
    }
}
