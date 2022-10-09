package controllers;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import data.Human;
import data.Relation;
import service.NameFindService;
import service.RelationFindService;

public class FindInfoController {
    public void infoFinder(Map<Relation, Human[][]> mapOfData, ArrayList<Human> familyList) {
        Scanner iScanner = new Scanner(System.in);
        RelationFindService familyByRelations = new RelationFindService();
        NameFindService familyByName = new NameFindService();

        System.out.println("\nChoose relations find:\n" +
            "1 - find by relation\n" +
            "2 - find by name\n");

        int findType = iScanner.nextInt();
        iScanner.nextLine();

        switch (findType) {
            case 1:
                System.out.println("Relation in base:\n");

                for (Relation item : Relation.values()) {
                    System.out.println(item.getTitle());
                }

                System.out.printf("Enter family relation you want to see: \n");
                String findRelations = iScanner.nextLine();

                if (Relation.contains(findRelations)) {
                    familyByRelations.showRelationsByName(mapOfData, findRelations);
                } else {
                    System.out.println("Incorrect data");
                }

                break;
            case 2:
                
                System.out.println("People in base:\n");

                for (Human item : familyList) {
                    System.out.println(item.getName());
                }

                System.out.println("\nEnter person name relation you want to see: \n");
                String findName = iScanner.nextLine();
                boolean isName = false;

                for (Human item : familyList) {
                    if (item.getName().equals(findName)) {
                        familyByName.showHumanRelationsByName(mapOfData, findName);
                        isName = true;
                    }
                }

                if (!isName) {
                    System.out.println("Incorrect data");
                }

                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        iScanner.close();
    }  
}
