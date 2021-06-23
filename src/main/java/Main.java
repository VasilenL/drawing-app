import shapes.Point;
import shapes.Rectangle;
import ui.DrawingFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point startPoint = new Point(200, 150);
        Point endPoint = new Point(300, 400);

        Rectangle rectangle = new Rectangle(startPoint, endPoint, -1, -16777216, 5);

        System.out.println(startPoint.toString());
        System.out.println(rectangle.toString());

        DrawingFrame drawingFrame = new DrawingFrame(rectangle);
        drawingFrame.setBackground( new Color(39,174,96));
        drawingFrame.pack();

        // put the frame in the middle of the display
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        drawingFrame.setLocation(dim.width / 2 - drawingFrame.getSize().width / 2, dim.height / 2 - drawingFrame.getSize().height / 2);
        drawingFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        drawingFrame.setVisible(true);
    }
}
