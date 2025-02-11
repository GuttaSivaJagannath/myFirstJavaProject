package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanner2 {

	public static void main(String[] args) throws IOException {

		// if we want to serach the entire directory, you want to do recursively, in
		// this type of situations we can go for walk, that which walk through the
		// current directory.

		Path dir = Paths.get(".");// created a local variable.

		// Files.list(dir).forEach(System.out::println);

		System.out.println("By using the walk directory : ");
		Files.walk(dir, 2).forEach(System.out::println);
		// here walk(variable,level), we can increase the level for go for more deeper.

		// now we are going to filter that to know only the java files present here

		Predicate<? super Path> predicate = element -> String.valueOf(element).contains(".java");

		System.out.println();
		System.out.println("By using walk directory with filter : ");

		Files.walk(dir, 2).filter(predicate).forEach(System.out::println);

		// there is an another method to search through - find
		// 'find' method gives much more better filters, we can filter based on the name
		// of the file and certian characteristics
		System.out.println();
		System.out.println("By using find : ");

		BiPredicate<Path, BasicFileAttributes> pathMatcher = (path, attributes) -> String.valueOf(path)
				.contains(".java");
		Files.find(dir, 2, pathMatcher).forEach(System.out::println);

		// if you want to print only the directories
		System.out.println();
		System.out.println("Printing only directories by find method : ");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(dir, 2, directoryMatcher).forEach(System.out::println);

	}

}
