public class SistemaMonitoramento {

    public static void main(String[] args) {

        Sensor sensorCentro = new Sensor("Centro");

        new PainelControleObserver(sensorCentro);
        new ModuloAlertasObserver(sensorCentro);
        new ModuloHistoricoObserver(sensorCentro);

        sensorCentro.atualizarLeituras(25.3, 60.0, 80.0);
        sensorCentro.atualizarLeituras(37.8, 45.0, 120.0);
        sensorCentro.atualizarLeituras(30.0, 70.0, 200.0);
    }
}