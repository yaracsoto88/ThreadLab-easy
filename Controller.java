

public class Controller {
    private Model model;

    private View view;

    private Contador contador;

    public Controller() {
        this.contador = new Contador();
        this.model = new Model(contador);
        this.view = new View(this);
    }

    public static void main(String[] args){
        Controller controller = new Controller();

        Thread hilo = new Thread(controller.getView());
        hilo.start();
    }

    public void play(){
        this.contador.setValor(0);

        this.model.play();
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }
}
