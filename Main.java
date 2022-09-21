package pro4;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application
{ 
	


	public static void main(String[] args) 
	{ 
		launch(args);
		

	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
        root.setStyle("-fx-background-color: pink");
        Group gr = new Group();
        Group gro = new Group();

      
        

		Button Run = new Button ("New Game");
		Run.setTranslateX(0);
		Run.setTranslateY(0);
		Run.setPrefSize(100,20);
		gr.getChildren().add(Run);
		Run.setTextFill(Color.CYAN);
		Run.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(5), Insets.EMPTY)));

		Button ShowTable = new Button ("Show solution");
		ShowTable.setTranslateX(200);
		ShowTable.setTranslateY(0);
		ShowTable.setPrefSize(100,20);
		gro.getChildren().add(ShowTable);
		ShowTable.setTextFill(Color.CYAN);
		ShowTable.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(5), Insets.EMPTY)));

	/*	Button fileImport1 = new Button("Choose a file ");
		fileImport1.setTranslateX(10);
		fileImport1.setTranslateY(50);
		fileImport1.setPrefSize(300, 20);
		root.getChildren().add(fileImport1);
		fileImport1.setTextFill(Color.CYAN);
		fileImport1.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(5), Insets.EMPTY)));*/


		Label resultLabel = new Label();
		resultLabel.setTranslateX(10);
	    resultLabel.setTranslateY(130);
	    resultLabel.setPrefWidth(300);
        resultLabel.setWrapText(true);
     //   root.getChildren().add(resultLabel);
        resultLabel.setTextFill(Color.BLACK);
        resultLabel.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
       // resultLabel.setPadding(new Insets(10));



		Label rl = new Label();
		rl.setTranslateX(10);
		rl.setTranslateY(160);
		rl.setPrefWidth(300);
		rl.setWrapText(true);
      //  root.getChildren().add(rl);
        rl.setTextFill(Color.BLACK);
        rl.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
       // rl.setPadding(new Insets(10));

        

		Label r = new Label();
		r.setTranslateX(10);
		r.setTranslateY(190);
		r.setPrefWidth(300);
		r.setWrapText(true);
        //root.getChildren().add(r);
        r.setTextFill(Color.BLACK);
        r.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
      //  r.setPadding(new Insets(10));
        

		Label rlable = new Label();
		rlable.setTranslateX(10);
		rlable.setTranslateY(220);
		rlable.setPrefWidth(300);
		rlable.setWrapText(true);
       // root.getChildren().add(rlable);
        rlable.setTextFill(Color.BLACK);
        rlable.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
     //   rlable.setPadding(new Insets(10));
        
      /*  GridPane gp = new GridPane();
        Games g=new Games();
        TextField[][] textfield=new TextField[9][9];
        int [][]array=null;
        
        array=g.getG1();
        int [][]array1=array;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            	TextField tf=null;
            	
            	if(array1[i][j] != 0) {
            		tf= new TextField(String.valueOf(array1[i][j]));
            		gp.add(tf,j,i);
            		tf.setEditable(false);
            		tf.setAlignment(Pos.CENTER);
                	tf.setPrefHeight(45);
                	tf.setPrefWidth(45);
            	}
            	else {
            		tf=new TextField("");
            		gp.add(tf,j,i);

            		tf.setStyle("-fx-control-inner-background:\"-fx-control-inner-background: #");
            	tf.setAlignment(Pos.CENTER);
            	tf.setPrefHeight(45);
            	tf.setPrefWidth(45);
            	
            	
            	}
            	
            	
       		// root.getChildren().add(tf);

            	
            }
            
        }
        */
            
     //  root.getChildren().add(gp);
     //  root.getChildren().add(gr);
       
        
		BorderPane p = new BorderPane();
		p.setCenter(root);
		p.setTop(gr);
		p.setBottom(gro);
		p.setStyle("-fx-background-color: cadetblue");
		

		Scene scene = new Scene(p,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ShowTable.setOnAction((ActionEvent e) ->{
	
		});
		
		Run.setOnAction((ActionEvent e) ->{
		
		
		});
		
	/*	fileImport1.setOnAction(e -> {

			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Load File");

			file = fileChooser.showOpenDialog(null);
			filePath = file.getPath();
		//	l.setText("");

		});*/
		
		
		
		

		
	}



	public void textfeild() {
		GridPane gp = new GridPane();
        Games g=new Games();
        TextField[][] textfield=new TextField[9][9];
        int [][]array=null;
        
        array=g.getG1();
        int [][]array1=array;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            	TextField tf=null;
            	
            	if(array1[i][j] != 0) {
            		tf= new TextField(String.valueOf(array1[i][j]));
            		gp.add(tf,j,i);
            		tf.setEditable(false);
            		tf.setAlignment(Pos.CENTER);
                	tf.setPrefHeight(45);
                	tf.setPrefWidth(45);
            	}
            	else {
            		tf=new TextField("");
            		gp.add(tf,j,i);

            		tf.setStyle("-fx-control-inner-background:\"-fx-control-inner-background: #");
            	tf.setAlignment(Pos.CENTER);
            	tf.setPrefHeight(45);
            	tf.setPrefWidth(45);
            	
            	
            	}
            	
            	
       		// root.getChildren().add(tf);

            	
            }
            
        }
		
	}

} 



