import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private String regiao;
    private double temperatura;
    private double umidade;
    private double indicePoluicao;

    private List<SensorObserver> observers = new ArrayList<>();

    public Sensor(String regiao) {
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getIndicePoluicao() {
        return indicePoluicao;
    }

    public void attach(SensorObserver observer) {
        observers.add(observer);
    }

    public void detach(SensorObserver observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        for (SensorObserver observer : observers) {
            observer.update();
        }
    }

    public void atualizarLeituras(double temperatura, double umidade, double indicePoluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.indicePoluicao = indicePoluicao;
        System.out.println("\n[SENSOR - " + regiao + "] Leituras atualizadas.");
        notifyAllObservers();
    }
}