import java.awt.Color;
import java.awt.Point;

/**
 * @author Arfah
 *
 */
public abstract class Shape implements Drawable
{
    protected Point[] location;
    private Color color;
    private boolean filled;

    public Shape(Color color, boolean filled)
    {
    }

    public Color getColor()
    {
        return null;
    }

    public boolean isFilled()
    {
        return true;
    }

    public Point[] getLocation()
    {
        return null;
    }

}
