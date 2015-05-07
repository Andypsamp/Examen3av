
package superficies;
/**
 * En esta clase es donde crearemos el objeto.
 * @author ANDY PEÑA SAMPEDRO
 */
public class Modelo {
    /**
    *Aki es donde ponemos los atributos q usaremos.
    * */
    private String shapeType;
     private float squareArea;
    private float sideLength;
    private float sideHeight;
    private float rectangleArea;
    private float baseLength;
    private float height;
    private float triangleArea;
    private float radius;
    private float circleArea;
/**
 * Constructor por defecto
 */
        
    public Modelo() {
        
    }

 
/**
 * Constructor con parametros.
 * @param shapeType
 * @param squareArea
 * @param sideLength
 * @param sideHeight
 * @param rectangleArea
 * @param baseLength
 * @param height
 * @param triangleArea
 * @param radius
 * @param circleArea 
 */
    public Modelo(String shapeType,float squareArea, float sideLength, float sideHeight, float rectangleArea, float baseLength, float height, float triangleArea, float radius, float circleArea) {
        this.squareArea = squareArea;
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.height = height;
        this.triangleArea = triangleArea;
        this.radius = radius;
        this.circleArea = circleArea;
          this.shapeType = shapeType;
    }
       public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public float getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    public float getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getTriangleArea() {
        return triangleArea;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public String toString() {
        return "Modelo{" +"shapeType="+shapeType+ "squareArea=" + squareArea + ", sideLength=" + sideLength + ", sideHeight=" + sideHeight + ", rectangleArea=" + rectangleArea + ", baseLength=" + baseLength + ", height=" + height + ", triangleArea=" + triangleArea + ", radius=" + radius + ", circleArea=" + circleArea + '}';
    }
    

}

