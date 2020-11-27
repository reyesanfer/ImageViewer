
package imageviewer.view;

import imageviewer.model.Image;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/27 10:50 GMT
 *
 */

public interface  ImageDisplay {

    void display(Image image);
    Image current();
          
}
