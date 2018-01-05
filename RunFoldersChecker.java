package org.java2.maciej.swiderski.zadanie009ogolne.zadanie6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunFoldersChecker {

    public static void main(String[] args) throws IOException {

        String name = "C:\\Users\\Maciej\\Desktop";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide any name of folder from the desktop");
        String nameOfFolder = scanner.nextLine();
        System.out.println("Provide how many folders you want to see within it? ");
        int howManyWithin = scanner.nextInt();

        FoldersChecker foldersChecker = new FoldersChecker();
        File currentFolder = new File(name + "/" + nameOfFolder);
        String aFile = foldersChecker.createAFile(name);
        File file = new File(aFile);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        foldersChecker.checkFolders(bufferedWriter, currentFolder, howManyWithin);
        bufferedWriter.close();
    }
}

