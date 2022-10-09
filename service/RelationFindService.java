package service;
import java.util.Map;

import data.Human;
import data.Relation;

public class RelationFindService {
    public void showRelationsByName(Map<Relation, Human[][]> mapOfData, String relation) {
        for (Map.Entry entry : mapOfData.entrySet()) {
            Human[][] hm = (Human[][]) entry.getValue();
            if(entry.getKey().toString().toUpperCase().equals(relation.toUpperCase())) {
                System.out.println(entry.getKey() + ":");
                for (Human[] humans : hm) {
                    System.out.println(humans[0].getName() + " to " + humans[1].getName());
                }
            }
        } 
    }
}
