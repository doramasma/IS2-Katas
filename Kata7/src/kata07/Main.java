package kata07;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Doramas Báez Bernal
 */
public class Main extends JFrame{

    public static void main(String[] args) throws IOException{
        new Main().launch();
        
    }
    
    public Main() throws IOException {
        Watch watch = new Watch();
        WatchDisplay watchDisplay = new WatchDisplay(background());
        WatchPresenter watchPresenter = new WatchPresenter(watch, watchDisplay);
        this.init();
        this.add(watchDisplay);
    }
    
    private void launch(){
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Watch");
        this.setSize(320,320);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private Image background() throws IOException {
        return ImageIO.read(new File("background.jpg"));
    }
}
