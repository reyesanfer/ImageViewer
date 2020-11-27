
package imageviewer.control;

import imageviewer.model.Image;
import imageviewer.view.ImageDisplay;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/27 10:51 GMT
 *
 */

public class PrevImageCommand implements Command {
    
    private final  List<Image> imageList;
    private final ImageDisplay imageDisplay;

    public PrevImageCommand(List<Image> imageList, ImageDisplay imageDisplay) {
        this.imageList = imageList;
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute() {
        imageDisplay.display(prev());
    }
    
    private Image prev () {
        int index = imageList.indexOf(imageDisplay.current());
        index = (index - 1 + imageList.size()) % imageList.size();
        return imageList.get(index);
    }

}
