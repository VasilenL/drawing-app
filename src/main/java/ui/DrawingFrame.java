package ui;

import shapes.Shape;

import javax.swing.*;
import java.awt.*;


public class DrawingFrame extends JFrame {

    private int paintPanelWidth;
    private int paintPanelHeight;

    private JPanel content;
    private JScrollPane scrollPane;
    private final Color background = Color.GRAY;

    public DrawingFrame(Shape shapeToBeDrawn) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        paintPanelWidth = dim.width - 150;
        paintPanelHeight = dim.height - 160;

        content = new JPanel();
        content.setLayout(null);

        PaintPanel paintPanel = new PaintPanel(shapeToBeDrawn, paintPanelWidth, paintPanelHeight);

        content.add(paintPanel);
        content.setBackground(background);

        this.add(content);
    }

}
