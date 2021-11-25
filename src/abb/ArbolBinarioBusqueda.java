package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    public ArbolBinarioBusqueda(){
        raiz=null;
    }
    /*
    arbol esta vacio o no
    * */
    public boolean estaVacia(){
        return raiz==null;
    }

    /**Metod recurcibo para insertar un nodo a nuestro abb*/
    private void insertar(Nodo padre,Nodo hijo,int dato){
        if(hijo==null){//caso base
            Nodo nuevo= new Nodo(null,dato,null);
            if (dato>=padre.getDato()){
                padre.setDerecho(nuevo);
            }else {
                padre.setIzquierdo(nuevo);
            }
        }else {//llama recursiva
            if (dato>=padre.getDato()){
                insertar(hijo,hijo.getDerecho(),dato);
            }else {
                insertar(hijo,hijo.getIzquierdo(),dato);
            }

        }
    }

    /**Metodo auxiliar para insertaR NUEVO NODO AL ABB*/
    public void insertar(int dato){
        if(estaVacia()){
            Nodo nuevo=new Nodo(null,dato,null);
            raiz=nuevo;
        }else {
            if (dato>=raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else {
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }

    /**Metodo recursivo para rrecorrer /mostrar el arbol inOrden*/
    private void mostrarInOrden(Nodo nodo){
        if (nodo==null){//caso base

        }else {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    /**Metod auxiliar para mostrar el arbol inOrden*/
    public void mostrarInOrden(){
        Nodo temp= raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
