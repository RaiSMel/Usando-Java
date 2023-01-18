import javax.swing.event.SwingPropertyChangeSupport;

public class ExecutarApp{

    public static void main(String[] args){
    
        Gerente gerente = new Gerente("Rai", 5000, "2000" , "1234");
        System.out.println(gerente.getBonificacao());

    }

}