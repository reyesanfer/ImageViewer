
package imageviewer.control;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/27 11:20 GMT
 *
 */

public class ExitCommand implements Command{

    @Override
    public void execute() {
        System.exit(0);
    }

}
