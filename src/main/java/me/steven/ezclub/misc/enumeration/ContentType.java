package me.steven.ezclub.misc.enumeration;

public enum ContentType {

    TEXT(0), IMAGE(1), VIDEO(2);

    private Integer value;

    ContentType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public ContentType whichContentType(Integer value) {
        switch (value) {
            case 1:
                return IMAGE;
            case 2:
                return VIDEO;
            default:
                return TEXT;
        }
    }

}
