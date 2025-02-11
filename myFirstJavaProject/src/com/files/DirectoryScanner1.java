package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryScanner1 {

// here we are going to do take one drectory and listing all content to the specific directory

	public static void main(String[] args) throws IOException {

		// what were present in the current directory
		// here we using functional programming concepts to scan through the files, scan
		// through the directories.
		// I would like to find the path to the specific directory.
		// paths help us to get on to the specific directory

		// Paths.get(".");

		// there is a class called Files which having method called list that which
		// accept the path that returns the stream back.
		// here list is not recursive, in the scense it returns what is present in the
		// current directory.

		Files.list(Paths.get(".")).forEach(System.out::println);
	}

}
