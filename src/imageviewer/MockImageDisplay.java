
package imageviewer;

import imageviewer.model.Image;
import imageviewer.view.ImageDisplay;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/27 10:52 GMT
 *
 */

public class MockImageDisplay implements ImageDisplay {

    private Image image;
    
    @Override
    public void display(Image image) {
        this.image = image;
        System.out.println(image.getName());
    }

    @Override
    public Image current() {
        return image;
    }

    
    
    
    
}
