public class PainelControleObserver extends SensorObserver {

    public PainelControleObserver(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        System.out.println("[PAINEL] Regiao: " + sensor.getRegiao()
                + " | Temp: " + sensor.getTemperatura()
                + "°C | Umidade: " + sensor.getUmidade()
                + "% | Poluicao: " + sensor.getIndicePoluicao());
    }
}