package net.oliversne.volumecalculator.Models;

// Model: It represents the data structure or individual data items
// that your adapter is going to display

public class Shape {
    //Propiedades
    int shapeImg;
    String shapeName;

    //Constructor
    public Shape(int shapeImg, String shapeName) {
        this.shapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    //Getter and Setter
    public int getShapeImg() {
        return shapeImg;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
