import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Relative {
    ArrayList<Human> family = new ArrayList<>();
    Map<Relation, Human[][]> familyRelation = new HashMap<>();
    
    public Relative() {
        family.add(new Human("Grandfather", "Smith", "70", "male"));
        family.add(new Human("Grandmother", "Smith", "70", "female"));
        family.add(new Human("Father", "Smith", "50", "male"));
        family.add(new Human("Mother", "Smith", "50", "female"));
        family.add(new Human("Son", "Smith", "30", "male"));
        family.add(new Human("Daughter", "Smith", "30", "female"));
        familyRelation.put(Relation.PARENT, new Human[][]{
                                                            {family.get(0), family.get(2)}, 
                                                            {family.get(1), family.get(2)}, 
                                                            {family.get(2), family.get(4)},
                                                            {family.get(3), family.get(4)}, 
                                                            {family.get(2), family.get(5)},
                                                            {family.get(3), family.get(5)}});
    }

    public void getInfo(Map<Relation, Human[][]> mapOfdata) {
        for (Map.Entry entry : mapOfdata.entrySet()) {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue().toString());
        }
    }
}
