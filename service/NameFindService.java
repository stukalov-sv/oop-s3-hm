package service;
import java.util.Map;

import data.Human;
import data.Relation;

public class NameFindService {
    public void showHumanRelationsByName(Map<Relation, Human[][]> mapOfData, String name) {
        System.out.println(name + " is:");
        for (Map.Entry entry : mapOfData.entrySet()) {
            Human[][] hm = (Human[][]) entry.getValue();
            for (Human[] humans : hm) {
                if (humans[0].getName().equals(name)) {
                    System.out.println(entry.getKey() + " to " + humans[1].getName());
                }
            }
        }
    }
}
