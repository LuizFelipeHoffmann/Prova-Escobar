public class Cliente {
    private String nome;
    private int idade;
    private double patrimonio;
    private int horizonteAnos;
    private int experienciaAnos;

    public Cliente(String nome, int idade, double patrimonio,
                   int horizonteAnos, int experienciaAnos) {
        this.nome = nome;
        this.idade = idade;
        this.patrimonio = patrimonio;
        this.horizonteAnos = horizonteAnos;
        this.experienciaAnos = experienciaAnos;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getPatrimonio() { return patrimonio; }
    public int getHorizonteAnos() { return horizonteAnos; }
    public int getExperienciaAnos() { return experienciaAnos; }
}