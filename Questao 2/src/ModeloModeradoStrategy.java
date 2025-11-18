public class ModeloModeradoStrategy implements RiscoStrategy {

    @Override
    public double calcularRisco(Cliente cliente) {
        double riscoBase = 0.5;
        riscoBase += cliente.getHorizonteAnos() * 0.01;
        riscoBase += cliente.getExperienciaAnos() * 0.005;

        if (cliente.getIdade() > 55) {
            riscoBase -= 0.1;
        }

        return Math.max(0.0, Math.min(1.0, riscoBase));
    }
}