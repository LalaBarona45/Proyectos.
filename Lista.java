package com.mycompany.listasdobles;

public class Lista {

    
    Nodo inicio;
 
    Nodo fin;
    
    public Lista (){
        this.inicio = null;
        this.fin = null;
       
   }
    public int Elemento(){
        int cont = 0;
        Nodo aux = this.inicio;
        while(aux != null){
            aux = aux.getSig();
            cont++;
        
        }
        return cont;    
    }
    
    public void crearNodo(int pos, String x){
        if(pos <= Elemento ()+1){
            Nodo nuevo = new Nodo ();
            nuevo.setDato(x);
            if(pos == 1){
                nuevo.setSig(inicio);
                if(inicio != null){
                    inicio.setAnt(nuevo);
                                   
                }
                inicio = nuevo;
            }
            else {
                if(pos == Elemento ()+1){
                    Nodo aux = inicio;
                    while(aux.getSig()!= null){
                        aux = aux.getSig();

                    }
                    aux.setSig(nuevo);
                    nuevo.setAnt(aux);
                    nuevo.setSig(null);
                    
                
                } else{
                    Nodo aux1 = inicio;
                    for(int i=1; i <= pos - 2; i++){
                        aux1 = aux1.getSig();
                        Nodo proximo = aux1.getSig();
                        aux1.setSig(nuevo);
                        nuevo.setAnt(aux1);
                        nuevo.setSig(proximo);
                        proximo.setAnt(nuevo);
                        
                        
                    
                    }
                    
                    
                            
                }
                
                
            
            }
            
            
        
        
        }
    
    
    
    
    }
    
    public void imprimirelementos(){
        Nodo actual = new Nodo();
        actual = inicio;
        if(inicio !=null){
            while(actual != null){
                System.out.println("" + actual.dato);
                actual = actual.sig;
            }
        } else{
            System.out.println("lista vacia");
            
        }
        
        
    
    }
    
    
}         
          
          











  