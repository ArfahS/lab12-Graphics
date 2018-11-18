
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the
     * panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);

        int width = 800;
        int height = 600;

        // TODO: draw a dog:

        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.WHITE, true);

        // Ears:
        RightTriangle ears = new RightTriangle(new Point(20, 40), 20, 40,
                Color.LIGHT_GRAY, true);

        // Eyes:
        Circle eyes = new Circle(new Point(400, 300), 400, Color.GREEN, true);

        // Nose and Whiskers:
        Circle nose = new Circle(new Point(5, 10), 10, Color.BLACK, true);

        // Collar:
        Oval collar = new Oval(new Point(50, 60), 50, 40, Color.RED, true);

        // Square around the dog:
        Square square = new Square(new Point(400, 300), 400, Color.ORANGE,
                true);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();

        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(ears);
        drawPanel.addShape(eyes);
        drawPanel.addShape(nose);
        drawPanel.addShape(collar);
        drawPanel.addShape(square);

        // set background color
        drawPanel.setBackground(Color.YELLOW);

        // add panel to frame
        this.add(drawPanel);

        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Meow :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
