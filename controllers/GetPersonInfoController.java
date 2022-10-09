package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import data.Human;

public class GetPersonInfoController {
    public void getPersonInfo(ArrayList<Human> familyList) {
        Scanner iScanner = new Scanner(System.in);
        boolean isName = false;
        System.out.println("People in base:\n");

        for (Human item : familyList) {
            System.out.println(item.getName());
        }

        System.out.println("\nEnter person name info you want to see:\n");
        String findName = iScanner.nextLine();

        for (Human item : familyList) {
            if (item.getName().equals(findName)) {
                System.out.println(item.toString());
                isName = true;
            }
        }

        if (!isName) {
            System.out.println("Incorrect data");
        }

        iScanner.close();
    }
}
