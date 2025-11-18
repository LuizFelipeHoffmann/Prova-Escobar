public class ModuloHistoricoObserver extends SensorObserver {

    public ModuloHistoricoObserver(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        System.out.println("[HISTORICO] Registrando leitura da regiao " + sensor.getRegiao()
                + " -> Temp: " + sensor.getTemperatura()
                + "°C, Umidade: " + sensor.getUmidade()
                + "%, Poluicao: " + sensor.getIndicePoluicao());
    }
}