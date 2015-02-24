
package inteface.stackadt;

import java.util.ArrayList;
import java.util.Scanner;

public class miSegundoIntento implements InterfaceStackADT {
   
//atributos
    public ArrayList<Object> lista;
    //public int top=0;
    
 //constructor
    public miSegundoIntento(){
        this.lista=new ArrayList();
    }

    
    
    public void push(Object elemento) {
        lista.add(elemento);
        //top++;
    }

   
    public Object pop() {
        return lista.remove(lista.size()-1);
        
    }
    
    public Object peek() {
        return lista.get(lista.size()-1);
    }

    
    public boolean isEmpty() {
       return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }
    
    public String toString(){
        return lista.toString();
    }
    

    
   
    public static void main(String[] args){
    miSegundoIntento pila= new miSegundoIntento();
   String a;
    Scanner lectura= new Scanner(System.in);
    int n;
    
    a="((()))";
    
    //problema parentesis
   
    Character s;
    boolean bien=true;
    for( int i=0; i<a.length();i++){
        s=a.charAt(i);
        if(s=='(')
            pila.push(s);
        else{
            if(s==')'){
                if(pila.isEmpty()){
                   
                    bien=false;
                }
                else{
                    pila.pop();
                }
            }
        }
    }
    System.out.println(bien);
    
}    
    
    
    
    
    
    
}
