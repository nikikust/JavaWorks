import java.util.Scanner;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> part01 = new Stack<Integer>(), part02 = new Stack<Integer>(), buf1 = new Stack<Integer>(), buf2 = new Stack<Integer>();
        Queue<Integer> part11 = new LinkedList<>(), part12 = new LinkedList<>();
        Deque<Integer> part21 = new ArrayDeque<>(), part22 = new ArrayDeque<>();

        int turn = 0;

        // --- //

        System.out.print("Stack\nВведите колоду 1: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                buf1.push(scanner.nextInt());
            } else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        System.out.print("Введите колоду 2: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                buf2.push(scanner.nextInt());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        if ( part01.empty() )
            while ( !buf1.isEmpty() ) { part01.push(buf1.pop()); }
        if ( part02.empty() )
            while ( !buf2.isEmpty() ) { part02.push(buf2.pop()); }

        while (++turn <= 106 && !part01.isEmpty() && !part02.isEmpty())
        {
            System.out.println(part01.peek() + " " + part02.peek());
            if((part01.peek() < part02.peek() && !(part01.peek() == 0 && part02.peek() == 9)) || (part01.peek() == 9 && part02.peek() == 0))
            {
                buf2.push(part01.pop());
                buf2.push(part02.pop());
            }
            else
            {
                buf1.push(part01.pop());
                buf1.push(part02.pop());
            }

            if ( part01.empty() )
                while ( !buf1.isEmpty() ) { part01.push(buf1.pop()); }
            if ( part02.empty() )
                while ( !buf2.isEmpty() ) { part02.push(buf2.pop()); }
        }

        if(part01.isEmpty())
            System.out.println("Второй игрок выиграл за " + (turn-1) + " ходов");
        else if (part02.isEmpty())
            System.out.println("Первый игрок выиграл за " + (turn-1) + " ходов");
        else
            System.out.println("botva");

        // --- //

        turn = 0;
        System.out.print("\nQueue\nВведите колоду 1: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                part11.add(scanner.nextInt());
            } else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        System.out.print("Введите колоду 2: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                part12.add(scanner.nextInt());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        while(++turn <= 106 && !part11.isEmpty() && !part12.isEmpty())
        {
            System.out.println(part11.peek() + " " + part12.peek());
            if((part11.peek() < part12.peek() && !(part11.peek() == 0 && part12.peek() == 9)) || (part11.peek() == 9 && part12.peek() == 0))
            {
                part12.add(part11.poll());
                part12.add(part12.poll());
            }
            else
            {
                part11.add(part11.poll());
                part11.add(part12.poll());
            }

            if(part11.isEmpty())
                System.out.println("Второй игрок выиграл за " + turn + " ходов");
            else if (part12.isEmpty())
                System.out.println("Первый игрок выиграл за " + turn + " ходов");
        }
        if (turn == 107)
            System.out.println("botva");

        // --- //

        turn = 0;
        System.out.print("\nQueue\nВведите колоду 1: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                part21.offer(scanner.nextInt());
            } else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        System.out.print("Введите колоду 2: ");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                part22.offer(scanner.nextInt());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        while(++turn <= 106 && !part21.isEmpty() && !part22.isEmpty())
        {
            System.out.println(part21.peek() + " " + part22.peek());
            if((part21.peek() < part22.peek() && !(part21.peek() == 0 && part22.peek() == 9)) || (part21.peek() == 9 && part22.peek() == 0))
            {
                part22.offer(part21.poll());
                part22.offer(part22.poll());
            }
            else
            {
                part21.offer(part21.poll());
                part21.offer(part22.poll());
            }

            if(part21.isEmpty())
                System.out.println("Второй игрок выиграл за " + turn + " ходов");
            else if (part22.isEmpty())
                System.out.println("Первый игрок выиграл за " + turn + " ходов");
        }
        if (turn == 107)
            System.out.println("botva");

        // --- //

        scanner.close();
    }
}
