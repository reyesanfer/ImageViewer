
package imageviewer.control;

import imageviewer.model.Image;
import imageviewer.view.ImageDisplay;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/12/11 12:41 GMT
 *
 */

public class InitCommand implements Command{
    
    private final Map<String, Command> commands = new HashMap<>();
    private final List<Image> images;
    private final ImageDisplay imageDisplay;

    public InitCommand(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute() {
        imageDisplay.display(images.get(0));
        commands.put("N", new NextImageCommand(images, imageDisplay));
        commands.put("P", new PrevImageCommand(images, imageDisplay));
        commands.put("E", new ExitCommand());
    }

    public Map<String, Command> getCommands() {
        return commands;
    }
    
}
