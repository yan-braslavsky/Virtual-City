package framework.interfaces;

import framework.classes.MouseInputProcessor;
import org.lwjgl.util.Point;

/**
 * Created with IntelliJ IDEA.
 * User: Yan
 * Date: 05/07/13
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
public interface MouseInputProcessorListener {
    void onMouseButtonDown(MouseInputProcessor.MouseButton mouseButton, Point point);
    void onMouseButtonUp(MouseInputProcessor.MouseButton mouseButton, Point point);
}
