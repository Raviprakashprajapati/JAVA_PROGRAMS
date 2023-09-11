package myPackage.myShape;

public class ShapeValue {
    public int value1;
    public int value2;

    public ShapeValue(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1(){ return this.value1; }
    public int getValue2(){ return this.value2; }

    public void setValue1(int value1) { this.value1 = value1;}
    public void setValue2(int value2) { this.value2 = value2;}
} 