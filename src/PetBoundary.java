import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {
    private Label lblNomePet = new Label("Nome do Pet");
    private TextField txtNomePet = new TextField();
    private Label lblRaca = new Label("Raça");
    private TextField txtRaca = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");
    private Button btnLimpar = new Button("Limpar");
    
    private Label lblNomeDono = new Label("Nome do Dono");
    private TextField txtNomeDono = new TextField();
    private Label lblCor = new Label("Cor");
    private TextField txtCor = new TextField();
    private Label lblIdade = new Label("Idade");
    private TextField txtIdade = new TextField();

    private Pet[] lista = new Pet[100];
    private int indicePet = 0;

    @Override
    public void start(Stage stage) throws Exception {
        GridPane panGrid = new GridPane();
        Scene scn = new Scene(panGrid, 400, 200);

        panGrid.add(lblNomePet, 0, 0);
        panGrid.add(txtNomePet, 1, 0);
        panGrid.add(lblRaca, 0, 1);
        panGrid.add(txtRaca, 1, 1);
        panGrid.add(lblNomeDono, 0,3);
        panGrid.add(txtNomeDono, 1,3);
        panGrid.add(lblCor, 0,4);
        panGrid.add(txtCor, 1,4);
        panGrid.add(lblIdade, 0,5);
        panGrid.add(txtIdade, 1,5);
        panGrid.add(btnAdicionar, 0, 6);
        panGrid.add(btnPesquisar, 1, 6);
        panGrid.add(btnLimpar, 0, 7);

        btnAdicionar.setOnAction( e -> {
            Pet p = new Pet();
            p.setNomePet(txtNomePet.getText());
            p.setRaca(txtRaca.getText());
            
            
            p.setNome_dono(txtNomeDono.getText());
            p.setCor(txtCor.getText());
            p.setIdade(txtIdade.getText());
            
            

            lista[indicePet++] = p;
            txtNomePet.setText("");
            txtRaca.setText("");
            
            txtNomeDono.setText("");
            txtCor.setText("");
            txtIdade.setText("");
        });
        
        btnLimpar.setOnAction( e -> {
            txtNomePet.setText("");
            txtRaca.setText("");
            
            txtNomeDono.setText("");
            txtCor.setText("");
            txtIdade.setText("");
        });

        btnPesquisar.setOnAction( e -> {
            for (int i = 0; i < indicePet; i++) {
                Pet p = lista[i];
                if (p != null && p.getNomePet().contains(txtNomePet.getText())) {
                    txtNomePet.setText(p.getNomePet());
                    txtRaca.setText(p.getRaca());
                    
                    txtNomeDono.setText(p.getNome_dono());
                    txtCor.setText(p.getCor());
                    txtIdade.setText(p.getIdade());
                }
            }
        });

        stage.setScene(scn);
        stage.setTitle("Cadastro de Pets");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(PetBoundary.class, args);
    }
}