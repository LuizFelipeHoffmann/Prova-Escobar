public class AnalisadorRisco {

    private RiscoStrategy strategy;

    public AnalisadorRisco(RiscoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RiscoStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularRiscoPara(Cliente cliente) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia configurada.");
        }
        return strategy.calcularRisco(cliente);
    }
}