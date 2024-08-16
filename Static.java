class Static {
    private Integer[] pilha;
    private int cima;

    public Static(int tamanho) {
        this.pilha = new Integer[tamanho];
        this.cima = 0;
    }

    public boolean estaVazia() {
        return cima == 0;
    }

    public boolean estaCheia() {
        return cima == pilha.length;
    }

    public void empilhar(int elemento) {
        if (estaCheia()) {
            throw new StackOverflowError("Pilha cheia");
        } else {
            pilha[cima++] = elemento;
        }
    }

    public Integer desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        } else {
            return pilha[--cima];
        }
    }

    public Integer cima() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        } else {
            return pilha[cima - 1];
        }
    }
}
