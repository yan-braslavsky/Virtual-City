package framework.core.camera;


import javafx.geometry.Rectangle2D;

/**
 * Created with IntelliJ IDEA.
 * User: Yan
 * Date: 05/09/13
 * Time: 17:46
 * To change this template use File | Settings | File Templates.
 */
public interface OrthographicCamera extends Camera{

    public Rectangle2D getVisibleArea();
    public void panRight(double panDistance);
    public void panLeft(double panDistance);
    public void panUp(double panDistance);
    public void panDown(double panDistance);
}
