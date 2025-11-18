public class ModuloAlertasObserver extends SensorObserver {

    public ModuloAlertasObserver(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void update() {
        boolean alerta = false;

        if (sensor.getIndicePoluicao() > 150) {
            System.out.println("[ALERTA] Poluicao elevada na regiao " + sensor.getRegiao()
                    + " (indice: " + sensor.getIndicePoluicao() + ").");
            alerta = true;
        }

        if (sensor.getTemperatura() > 35) {
            System.out.println("[ALERTA] Temperatura muito alta na regiao " + sensor.getRegiao()
                    + " (" + sensor.getTemperatura() + "°C).");
            alerta = true;
        }

        if (!alerta) {
            System.out.println("[ALERTA] Nenhum alerta critico para a regiao " + sensor.getRegiao() + ".");
        }
    }
}