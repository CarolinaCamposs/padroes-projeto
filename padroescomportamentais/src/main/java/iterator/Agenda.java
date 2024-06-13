package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Agenda implements Iterable<Contato>{

    private List<Contato> contatos = new ArrayList<>();

   public Agenda(Contato... contatos) {
       this.contatos = Arrays.asList(contatos);
   }

   @Override
    public Iterator<Contato> iterator() {
       return contatos.iterator();
   }
}
