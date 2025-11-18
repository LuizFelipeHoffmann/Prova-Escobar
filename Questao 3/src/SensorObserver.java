public abstract class SensorObserver {

    protected Sensor sensor;

    public SensorObserver(Sensor sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }

    public abstract void update();
}