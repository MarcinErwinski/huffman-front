package utp.edu.huffman;


import java.awt.image.BufferedImage;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;


public class FileControllerFXML extends AbstractControllerFXML implements Initializable {
    
    @FXML
    ImageView previevImage;
    
    @FXML
    public void loadPreview() throws IOException{
       BufferedImage image = ImageIO.read(file); 
       previevImage.setImage(SwingFXUtils.toFXImage(image,null));
    }
    
    @FXML
    public void uploadFile() throws IOException {
        runUpload();
        loadPreview();
    }
    
     public void runProcess(){
        if(file != null){
            if(choiceBox.getValue().equals("Compress")){
                compressFile();
            }
            else{
                decompressFile();
            }
        }

        //TODO dodaj coś ładnego xdd
        printTextArea("elo mordo");
    }
    
    private void compressFile(){
        
    }
    
    private void decompressFile(){
        
    }
}
