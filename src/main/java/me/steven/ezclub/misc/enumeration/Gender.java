package me.steven.ezclub.misc.enumeration;

public enum Gender {

    SECRET(0), GAL(1), GUY(2);

    private Integer value;

    Gender(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Gender whichGender(Integer value) {
        switch (value) {
            case 1:
                return GAL;
            case 2:
                return GUY;
            default:
                return SECRET;
        }
    }

}
