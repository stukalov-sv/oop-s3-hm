package data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Relative {
    public ArrayList<Human> family = new ArrayList<>();
    public Map<Relation, Human[][]> familyRelation = new HashMap<>();
    
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
        familyRelation.put(Relation.GRANDPARENT, new Human[][]{
                                                            {family.get(0), family.get(4)}, 
                                                            {family.get(0), family.get(5)}, 
                                                            {family.get(1), family.get(4)},
                                                            {family.get(1), family.get(5)}});
        familyRelation.put(Relation.CHILD, new Human[][]{
                                                            {family.get(2), family.get(0)}, 
                                                            {family.get(2), family.get(1)}, 
                                                            {family.get(4), family.get(2)},
                                                            {family.get(4), family.get(3)},
                                                            {family.get(5), family.get(2)},
                                                            {family.get(5), family.get(3)}});
        familyRelation.put(Relation.GRANDCHILD, new Human[][]{
                                                            {family.get(4), family.get(0)}, 
                                                            {family.get(4), family.get(1)}, 
                                                            {family.get(5), family.get(0)},
                                                            {family.get(5), family.get(1)}});
        familyRelation.put(Relation.PARTNER, new Human[][]{
                                                            {family.get(0), family.get(1)}, 
                                                            {family.get(1), family.get(0)}, 
                                                            {family.get(2), family.get(3)},
                                                            {family.get(3), family.get(2)}});                                                    
    }
}
