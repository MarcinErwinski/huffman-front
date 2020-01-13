package utp.edu.huffman;

import java.util.Map;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

public class TextControllerFXML extends AbstractControllerFXML implements Initializable {
    
    @FXML
    private TextField textField;
    
    @FXML
    private BarChart barChart;
    
    public void uploadFile() {
        runUpload();   
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
        else {
            if(choiceBox.getValue().equals("Compress")){
                compressString(textField.getText());
            }
            else{
                decompressString(textField.getText());
            }
        
        } 
        sendDataToChart(file.getName(), null);
        //TODO dodaj coś ładnego xdd
        printTextArea("elo mordo");
    }
    
    private void compressFile(){
        
    }
    
    private void decompressFile(){
        
    }
    
    private void compressString(String text){
        
    }
    
    private void decompressString(String text){
        
    }
    public void sendDataToChart(String nameDataSeries, Map<String, Integer> data){
        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName(nameDataSeries);

        dataSeries.getData().add(new XYChart.Data("Desktop", 178));
        dataSeries.getData().add(new XYChart.Data("Phone"  , 65));
        dataSeries.getData().add(new XYChart.Data("Tablet"  , 23));
        if(data != null){
            for (Map.Entry<String, Integer> entry : data.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                dataSeries.getData().add(new XYChart.Data(key,value));
            
            }
        }
        barChart.getData().add(dataSeries);
        
    }
       
}
