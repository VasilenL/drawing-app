package shapes;

public abstract class Shape {
    Point startPoint;
    Point endPoint;
    int fillColor;
    int borderColor;
    int borderSize;
    boolean isTransparent;

    public Shape(Point startPoint, Point endPoint, int fillColor, int borderColor, int borderSize) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.borderSize = borderSize;
        this.isTransparent = false;
    }

    public Shape(Point startPoint, Point endPoint, int fillColor, int borderColor, int borderSize, boolean isTransparent) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.borderSize = borderSize;
        this.isTransparent = isTransparent;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public int getFillColor() {
        return fillColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public int getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(int borderColor) {
        this.borderColor = borderColor;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    public boolean isTransparent() {
        return isTransparent;
    }

    public void setTransparent(boolean transparent) {
        isTransparent = transparent;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                ", fillColor=" + fillColor +
                ", borderColor=" + borderColor +
                ", borderSize=" + borderSize +
                ", isTransparent=" + isTransparent +
                '}';
    }
}
