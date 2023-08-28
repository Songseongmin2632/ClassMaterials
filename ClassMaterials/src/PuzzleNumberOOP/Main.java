package PuzzleNumberOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		Player player = new Player();
		
		puzzle.setPlayer(player);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��¥�� ���� ���ⷡ? n * n");
		int count = scanner.nextInt();
		
		puzzle.setPuzzle(count, count);
		puzzle.print();
		
		while(true) {
			if(puzzle.getIsEnd()) break;
			System.out.println("p�� �Űܼ� 1 ~ "+(count * count - 1)+"������ �����.");
			System.out.println("8 : �� / 2 : �� / 4 : �� / 6 : �� / 0 : ���� / 5 : ����");
			int direction = scanner.nextInt();
			if(direction == 0) break;
			if(direction == 5) puzzle.shuffle();
			else puzzle.movePlayer(direction);
			puzzle.print();
		}
		System.out.println("��!");
	}
}
