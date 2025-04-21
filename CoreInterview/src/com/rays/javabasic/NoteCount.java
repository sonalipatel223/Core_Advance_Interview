package com.rays.javabasic;

public class NoteCount {

	public static void main(String[] args) {

		int[] notes = { 500, 200, 100, 50, 20, 10 };

		int rupee = 1880;
		int count = 0;

		for (int i = 0; i < notes.length; i++) {

			count = rupee / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + "=" + count);
			}

			rupee = rupee % notes[i];
		}
	}

}

