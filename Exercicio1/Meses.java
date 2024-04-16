package Exercicio1;

public enum Meses {
    JANEIRO(1),
    FEVEREIRO(2),
    MARÇO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    private final int numero;

    Meses(int numero) {
        this.numero = numero;
    }

    public int getNumber() {
        return numero;
    }
}