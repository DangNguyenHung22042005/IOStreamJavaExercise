package main;

import java.io.File;
import java.util.Scanner;

public class SizeOfFile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes * 1024.0;
            double fileSizeInMB = fileSizeInKB * 1024.0;
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("File is not exist!");
        }
        scanner.close();
    }
}
