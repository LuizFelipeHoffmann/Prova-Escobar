public class ModeloConservadorStrategy implements RiscoStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        double riscoBase = 0.3;

        if (cliente.getPatrimonio() > 1_000_000) {
            riscoBase -= 0.05;
        }
        if (cliente.getIdade() > 60) {
            riscoBase -= 0.1;
        }
        if (cliente.getHorizonteAnos() <= 2) {
            riscoBase -= 0.05;
        }

        return Math.max(0.0, riscoBase);
    }
}