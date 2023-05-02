package org.example;

public class MySecondClass {
    private String fiend1;

    public MySecondClass(String fiend1) {
        this.fiend1 = fiend1;
    }

    public String getFiend1() {
        return fiend1;
    }

    public void setFiend1(String fiend1) {
        this.fiend1 = fiend1;
    }

    @Override
    public String toString() {
        return "MySecondClass{" +
                "fiend1='" + fiend1 + '\'' +
                '}';
    }
}
