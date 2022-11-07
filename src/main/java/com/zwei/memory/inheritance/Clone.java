package com.zwei.memory.inheritance;

public final class Clone extends Jack {

    public Clone(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Clone() {
        //        super()
        System.out.println("Clone is called");
    }

    public String parentRoString2() {
        return super.toString();
    }

    public String parentRoString3() {
        return super.parentToString();
    }

}
