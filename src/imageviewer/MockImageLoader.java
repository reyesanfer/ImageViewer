package imageviewer;

import imageviewer.model.Image;
import imageviewer.view.ImageLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/27 10:58 GMT
 *
 */

public class MockImageLoader implements ImageLoader {

    @Override
    public List<Image> load() {
        List<Image> list = new ArrayList<>();
        list.add(new Image("hola"));
        list.add(new Image("mundo"));
        list.add(new Image("bienvenido"));
        return list;
    }
    
    
}


