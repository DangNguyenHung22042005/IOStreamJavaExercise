package main;

import java.io.File;
import java.util.Scanner;

public class RemoveFile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (deleteFile(file)) {
                System.out.println("Remove Successful!");
            } else {
                System.out.println("Remove Failed!");
            }
        } else {
            System.out.println("File is not exist!");
        }
        scanner.close();
    }
	
    private static boolean deleteFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    deleteFile(subFile);
                }
            }
        }
        return file.delete();
    }
}
