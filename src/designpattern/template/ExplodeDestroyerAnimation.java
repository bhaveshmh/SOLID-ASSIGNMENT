package designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:12:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExplodeDestroyerAnimation implements Animation {
    public void render(Screen screen) {
        screen.show("Destroyer is exploding.");
    }
}
