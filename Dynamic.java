class Dynamic {
    private Em cima;

    private class Em {
        int dado;
        Em proximo;

        Em(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public Dynamic() {
        this.cima = null;
    }

    public boolean estaVazia() {
        return cima == null;
    }

    public void empilhar(int elemento) {
        Em novoEm = new Em(elemento);
        novoEm.proximo = cima;
        cima = novoEm;
    }

    public int desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        } else {
            int valor = cima.dado;
            cima = cima.proximo;
            return valor;
        }
    }

    public int topo() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        } else {
            return cima.dado;
        }
    }
}
