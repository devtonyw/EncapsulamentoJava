package entidades;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodo construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //metodos getter and setter
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.printf("\nLigado? %b\n", this.getLigado());
        System.out.printf("\nTocando? %b\n", this.getTocando());
        System.out.printf("Volume: %d", this.getVolume());
        for(int i=0; i< this.getVolume();i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.print("\nFechando Menu.\n");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            setTocando(false);
        }
    }



}
