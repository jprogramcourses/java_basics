package com.juan.formacion.cookbook.readfiles;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Open and read a text file. Then process it line at a time, or get a collection of all the lines
 * 
 * Use Files::lines() - returns a Stream of Strings, use Files.newBufferedReader()
 * 
 * Files.newBufferedReader(), Files.newBufferedWriter(), Files.newInputStream(), Files.newOutputStream()
 * 
 * @author juand
 *
 */
public class ExReadFiles {
	
	/*
	 * Quickest way to process a text file a line at a time, with Files.lines().
	 * Returns a functional Stream<String>.
	 */
	public static void readFile(String path) throws IOException {
		Stream<String> streamLines = Files.lines(Path.of(path));
		System.out.println("Files.readFile()");
		streamLines.forEach(System.out::println);
	}
	
	public static void readFileInString(String path) throws IOException {
		System.out.println("Files.readString()");
		String input = Files.readString(Path.of(path));
		System.out.println(input);
	}
	
	public static void readFileReadAllLines(String path) throws IOException {
		List<String> listLines = Files.readAllLines(Path.of(path));
		System.out.println("Files.readAllLines()");
		listLines.forEach(System.out::println);
	}
	
	public static void readAllBytes(String path) throws IOException {
		byte[] byteLines = Files.readAllBytes(Path.of(path));
		System.out.println("Files.readAllBytes");
//		for(byte b : byteLines) {
//			System.out.println((char)b);
//		}
		Arrays.asList(byteLines).forEach(System.out::println);
	}
	
	public static void readBufferedReader(String path) throws FileNotFoundException {
		System.out.println("BufferedReader");
		new BufferedReader(new FileReader(new File(path))).lines().forEach(System.out::println);
	}
	
	public static void readBufferedReader2(String path) throws IOException {
		System.out.println("BufferedReader, old way");
		BufferedReader bf = new BufferedReader(new FileReader(new File(path)));
		String line;
		while((line = bf.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	public static void readReplaceWrite(String inputPath, String outputPath) throws IOException {
		try(BufferedReader bf = new BufferedReader(new FileReader(new File(inputPath)));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(outputPath)));){
			String line;
			while((line = bf.readLine()) != null) {
				line = doSomeProcessingOn(line);
				bos.write(line.getBytes("UTF-8"));
				bos.write('\n');
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	private static String doSomeProcessingOn(String line) {
		
		String lineReplace = line.replace("i", "í");
		
		return lineReplace;
	}

}
