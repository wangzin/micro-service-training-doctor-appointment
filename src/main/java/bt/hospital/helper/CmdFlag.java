package netgloo.helper;

public enum CmdFlag {

    CREATE('C', "Create"),
    MODIFY('M', "Modify"),
    DELETE('D', "Delete");

    private final Character value;
    private final String text;

    CmdFlag(Character value, String text) {
        this.value = value;
        this.text = text;
    }

    public Character getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
