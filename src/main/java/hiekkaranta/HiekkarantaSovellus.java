package hiekkaranta;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HiekkarantaSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        Canvas alusta = new Canvas(200, 200);
        GraphicsContext piirturi = alusta.getGraphicsContext2D();
        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(0, 0, 200, 200);
        asettelu.setCenter(alusta);
        
        VBox valinnat = new VBox();
        RadioButton metalli = new RadioButton("Metalli");
        RadioButton hiekka = new RadioButton("Hiekka");
        RadioButton vesi = new RadioButton("Vesi");
        valinnat.getChildren().addAll(metalli, hiekka, vesi);
        
        asettelu.setRight(valinnat);
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    


    public static void main(String[] args) {
        launch(HiekkarantaSovellus.class);
        System.out.println("Hello world!");
    }

    public static int toteutetutOsat() {
        // muokkaa täällä olevaa arvoa siten, että se kertoo 
        // tekemiesi osan määrän
        return 1;
    }
}
