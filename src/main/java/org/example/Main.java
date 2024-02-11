package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Цифры;\n2.Кириллица;\n3.Латиница\nВыберите что будете угадывать: ");
        int choice = Integer.parseInt(scanner.nextLine());
        AbstractGame nGame = null;
        switch (choice){
            case (1):
                nGame = new NumberGame();
                break;
            case (2):
                nGame = new RuGame();
                break;
            case (3):
                nGame = new EngGame();
                break;
            default:
                System.err.println("Ошибка ввода!");
                break;
        }

        nGame.start(4, 10);
        while (nGame.getGameStatus().equals(GameStatus.START)){
            System.out.println("Ваш ход: ");
            String value = scanner.nextLine();

            Answer answer = nGame.inputValue(value);
            System.out.println(answer);
        }

        scanner.close();
        System.out.println(nGame.getGameStatus().getDescription());
    }
}