module tela {
    requires javafx.controls;
    requires javafx.fxml;

    opens tela to javafx.fxml;
    exports tela.trocaTela;
}
