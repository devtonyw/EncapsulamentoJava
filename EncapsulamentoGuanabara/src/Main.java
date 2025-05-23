import entidades.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        ControleRemoto ct = new ControleRemoto();
        ct.ligar();
        ct.maisVolume();
        ct.play();
        //ct.ligarMudo();
        ct.abrirMenu();
        }
    }