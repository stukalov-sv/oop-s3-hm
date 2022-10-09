package data;
public enum Relation {
    PARENT ("Parent"),
    GRANDPARENT ("Grandparent"),
    CHILD ("Child"),
    GRANDCHILD ("Grandchild"),
    PARTNER ("Partner");

    private String title;

    Relation(String title) {
       this.title = title;
    }

    public String getTitle() {
       return title;
    }
    
    public static boolean contains(String testString) {
        for(Relation item: values()) {
            if (item.name().equals(testString.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
       return title;
    }
}
