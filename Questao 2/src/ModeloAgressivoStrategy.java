public class ModeloAgressivoStrategy implements RiscoStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        double riscoBase = 0.7;
        riscoBase += cliente.getHorizonteAnos() * 0.02;
        riscoBase += cliente.getExperienciaAnos() * 0.01;

        if (cliente.getIdade() < 30) {
            riscoBase += 0.1;
        }

        return Math.min(1.0, riscoBase);
    }
}