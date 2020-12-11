
package imageviewer.apps.swing;

import imageviewer.control.Command;
import imageviewer.control.NextImageCommand;
import imageviewer.control.PrevImageCommand;
import imageviewer.model.Image;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/12/11 10:54 GMT
 *
 */

public class Main extends JFrame {
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    private List<Image> images;
    private BlockPanel imageDisplay;
    private Map<String, Command> commands = new HashMap<>();
    
    public Main(){
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(imagePanel());
        this.add(toolbar(), BorderLayout.SOUTH);
    }
    
    public void execute(){
        this.images = new FileImageLoader(new File("fotos")).load();
        this.imageDisplay.display(images.get(0));
        this.commands.put("<", new PrevImageCommand(images, imageDisplay));
        this.commands.put(">", new NextImageCommand(images, imageDisplay));
        this.setVisible(true);
    }

    private JPanel imagePanel() {
        BlockPanel blockPanel = new BlockPanel();
        this.imageDisplay = blockPanel;
        return blockPanel;
    }

    private JMenuBar toolbar() {
        JMenuBar toolbar = new JMenuBar();
        toolbar.add(button("<"));
        toolbar.add(button(">"));
        return toolbar;
    }
    
    private JButton button(String name){
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get(name).execute();
            }
        });
        return button;
    }
    
}
