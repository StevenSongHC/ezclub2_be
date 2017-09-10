package me.steven.ezclub.misc.enumeration;

public enum Status {

    DELETED(-1), NORMAL(0), RESTRICTED(1), UNCHECKED(2);

    private Integer value;

    Status(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Status whichStatus(Integer value) {
        switch (value) {
            case -1:
                return DELETED;
            case 1:
                return RESTRICTED;
            case 2:
                return UNCHECKED;
            default:
                return NORMAL;
        }
    }

}
