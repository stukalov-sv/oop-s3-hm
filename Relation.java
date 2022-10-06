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

    @Override
    public String toString() {
       return title;
    }
}
