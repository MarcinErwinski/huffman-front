package utp.edu.huffman;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public abstract class AbstractControllerFXML implements Initializable {
    
    private final Desktop desktop = Desktop.getDesktop();
    final FileChooser fileChooser = new FileChooser();
     
    @FXML
    public ChoiceBox choiceBox;
    
    @FXML
    private TextArea textArea;
    
    File file;
    
    private MainController mainController;
    
    public void injectMainController(MainController controller){
        this.mainController = controller;
    }
    
    public void runUpload() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        configureFileChooser(fileChooser);
        file = fileChooser.showOpenDialog(new Stage());
       // file.getAbsolutePath()
       // file.getName()
         
    }
     
     private void configureFileChooser(
        final FileChooser fileChooser) {      
            fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
            );                 
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("BMP", "*.bmp")
            );
    }
    
    public void prepareChoiceBox(){
        List<String> t = new ArrayList<>();
        t.add("Compress");
        t.add("Decompress");
        choiceBox.setItems(FXCollections.observableList(t));
        choiceBox.getSelectionModel().select(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       prepareChoiceBox();
    }  
    
     public void printTextArea(String message){
        textArea.setText(message);
    }
   
}
