import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import controllers.MainController;
import data.Human;
import data.Relation;
import data.Relative;

public class Main {
    public static void main(String[] args) {
        Relative fr = new Relative();
        MainController mc = new MainController();
        ArrayList<Human> familyList = new ArrayList<>(fr.family);
        Map<Relation, Human[][]> familyRelation = new HashMap<>(fr.familyRelation);

        mc.startButton(familyRelation, familyList);
    }
}
