package modelo;

import java.util.Comparator;

public class OrdenaNomeVertice implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Vertice a1 = (Vertice) t;
        Vertice a2 = (Vertice)t1;
        
          if(a1.getDescricao().charAt(0)== a2.getDescricao().charAt(0)){
            return 0;
        }
        if(a1.getDescricao().charAt(0)<a2.getDescricao().charAt(0)){
        return -1;
    }else return 1;
             
    }
    
    
}
