package controllers;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import data.Human;
import data.Relation;

public class MainController {
    public void startButton(Map<Relation, Human[][]> mapOfData, ArrayList<Human> familyList) {
        Scanner iScanner = new Scanner(System.in);
        FindInfoController fic = new FindInfoController();
        GetPersonInfoController gpic = new GetPersonInfoController();
        System.out.println("\nChoose action:\n" +
            "1 - find relation in base\n" +
            "2 - get person info\n");

        int action = iScanner.nextInt();

        switch (action) {
            case 1:
                fic.infoFinder(mapOfData, familyList);
                break;
            case 2:
                gpic.getPersonInfo(familyList);
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        iScanner.close();
    }
}
