package org.java2.maciej.swiderski.zadanie009ogolne.zadanie6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FoldersChecker {

    public void checkFolders(BufferedWriter bufferedWriter, File folder, int num) throws IOException {

        File[] myFileList = folder.listFiles();

        for (File name : myFileList) {
            if (num > 0) {
                if (name.isDirectory()) {
                    System.out.println("Folder name: " + name.getName() + " size is: " + name.length());
                    bufferedWriter.write("Folder name: " + name.getName() + " size is: " + name.length());
                    bufferedWriter.newLine();
                    checkFolders(bufferedWriter, name, --num);
                } else {
                    System.out.println("File name: " + name.getName() + " size is: " + name.length());
                    bufferedWriter.write("File name: " + name.getName() + " size is: " + name.length());
                    bufferedWriter.newLine();
                }
            }
        }
    }
    public String createAFile(String destinationFileName) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to create a text file in order to write the acquired information? Type Y/N");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Provide a name of txt file you want to create in order to write folders/files" +
                    " information for example: fileToKeepInfo.txt");
            destinationFileName += "/" + scanner.nextLine();
            Path pathFile = Paths.get(destinationFileName);

            try {
                System.out.println("You have just created a file: " + destinationFileName);
                Files.createFile(pathFile);
                return destinationFileName;
            } catch (FileAlreadyExistsException e) {
                System.out.println("File allready exists");
            } catch (IOException e) {
                System.out.println("Sorry you did not manage to create a file - something went wrong");
            }
        } else System.out.println("Catch you later");
        return answer;
    }
}

