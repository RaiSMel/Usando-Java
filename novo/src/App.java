import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.omg.CORBA.SystemException;

public class App {
    public static void main(String[] args){
        
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");


        Comparator<String> comparador = new ComparadorPorTamanho();
        // Collections.sort(palavras, comparador); 
        
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        palavras.sort(comparador);
        System.out.println(palavras);

        palavras.sort((s1, s2) -> 
            Integer.compare(s1.length(), s2.length())
        );


        
        palavras.forEach( new descricao() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        } );

        palavras.forEach(s -> {
            System.out.println(s);
        });
    }
}

class descricao implements Consumer<String>{
    @Override
    public void accept(String t) {
        System.out.println(t);        
    }
} 

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()){
            return -1;
        }
        if(s1.length() > s2.length()){
            return 1;
        }
        return 0;
    }
}
