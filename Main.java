public class Main {
    public static void main(String[] args) {
        Static pilhaEstatica = new Static(5);
        pilhaEstatica.empilhar(10);
        pilhaEstatica.empilhar(20);
        System.out.println("Topo da pilha: " + pilhaEstatica.cima());
        System.out.println("Desempilhando: " + pilhaEstatica.desempilhar());

        Dynamic pilhaDinamica = new Dynamic();
        pilhaDinamica.empilhar(30);
        pilhaDinamica.empilhar(40);
        System.out.println("Topo da pilha dinamica: " + pilhaDinamica.topo());
        System.out.println("Desempilhando: " + pilhaDinamica.desempilhar());
    }
}
