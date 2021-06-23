package ui;

import shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PaintPanel extends JPanel {

    BufferedImage canvas;
    Graphics2D graphics2D;
    private int paintPanelWidth;
    private int paintPanelHeight;
    private Shape shapeToBeDrawn;

    public PaintPanel(Shape shapeToBeDrawn, int paintPanelWidth, int paintPanelHeight) {
        this.paintPanelWidth = paintPanelWidth;
        this.paintPanelHeight = paintPanelHeight;
        this.shapeToBeDrawn = shapeToBeDrawn;

        this.setSize(paintPanelWidth - 3, paintPanelHeight - 3);
        this.setPreferredSize(new Dimension(paintPanelWidth - 3, paintPanelHeight - 3));
        this.setLayout(null);

        setDoubleBuffered(true);
        setFocusable(true);
        setLocation(10, 10);
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        if (canvas == null) {
            canvas = new BufferedImage(paintPanelWidth, paintPanelHeight, BufferedImage.TYPE_INT_ARGB);
            graphics2D = canvas.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        g.drawImage(canvas, 0, 0, null);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke basicStroke = new BasicStroke((float) shapeToBeDrawn.getBorderSize());

        g2.setColor(new Color(shapeToBeDrawn.getBorderColor()));
        g2.setStroke(basicStroke);

        int width = Math.abs(shapeToBeDrawn.getStartPoint().getX() - shapeToBeDrawn.getEndPoint().getX());
        int height = Math.abs(shapeToBeDrawn.getStartPoint().getY() - shapeToBeDrawn.getEndPoint().getY());

        g2.drawRect(
                shapeToBeDrawn.getStartPoint().getX(),
                shapeToBeDrawn.getStartPoint().getY(),
                width,
                height
        );

        g2.setColor(new Color(shapeToBeDrawn.getFillColor()));
        g2.fillRect(shapeToBeDrawn.getStartPoint().getX(), shapeToBeDrawn.getStartPoint().getY(), width, height);

        g2.setColor(new Color(shapeToBeDrawn.getBorderColor()));
        g2.drawLine(shapeToBeDrawn.getStartPoint().getX(), shapeToBeDrawn.getStartPoint().getY(), shapeToBeDrawn.getEndPoint().getX(), shapeToBeDrawn.getEndPoint().getY());
        g2.drawLine(shapeToBeDrawn.getEndPoint().getX(), shapeToBeDrawn.getStartPoint().getY(), shapeToBeDrawn.getStartPoint().getX(), shapeToBeDrawn.getEndPoint().getY());

    }

}
