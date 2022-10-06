import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Relative familyTree = new Relative();
        Map<Relation, Human[][]> familyRelation = new HashMap<>(familyTree.familyRelation);
        familyTree.getInfo(familyRelation);
    }
}
