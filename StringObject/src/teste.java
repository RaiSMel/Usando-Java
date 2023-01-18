import java.util.ArrayList;
import httpclie

class Novo{
    private double item;

    public Novo(double item){
        this.item = item;
    }

    public double getItem() {
        return item;
    }

    

}

public class teste {
    /**
     * @param args
     */
    public static void main(String[] args)
     {
     new Http(); 
        Object[] novos = new Novo[4];  
        
        novos[0] = new Novo(23);
        
        Novo conta = (Novo) novos[0];

        // ------Casting--------
        //  double numero = 10.1001010;
        //  int numeroInt = (int) numero; 

        //  System.out.println(numeroInt);

        ArrayList lista = new ArrayList();

        // ou para englobar apenas um objeto, torna-lo genérico
        // ArrayList<Object> lista = new ArrayList<Object>();

        lista.add("ika");
        lista.add(3);
        lista.add(conta);
        System.out.println(lista.get(2));

        for(Object l : lista){
            System.out.println(l);
        }

        int numero = Integer.parseInt("1");
    }
    
}
