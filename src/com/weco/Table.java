package com.weco;

public class Table {
	/* * int tab[] / int[] tab int tab[] = {1, 2, 3} int tab[] = new int [3] int tab[] = new int[]{1, 2, 3} */

	public Table() {}

	public int aTable;

	void printTab(int[] t) {
		for (int element : t)
			System.out.println(element);
	}

	void showTable() {
		System.out.println("Tableau à 1 dimension");
		int[] tab = { 1, 2, 3 };
		System.out.println("Form 1");
		System.out.println("-------");

		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);

		System.out.println("Form 2");
		System.out.println("-------");

		for (int number : tab)
			System.out.println(number);
	}

	void showTable2() {
		System.out.println("Tableau à 2 dimension");
		int[][] tab = { { 1, 2, 3 }, { 11, 11, 13 } };
		System.out.println("Form 1");
		System.out.println("-------");

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)
				System.out.println(tab[i][j]);
		}

		System.out.println("Form 2");
		System.out.println("-------");

		for (int[] k : tab)
			for (int number : k)
				System.out.println(number);
	}

}