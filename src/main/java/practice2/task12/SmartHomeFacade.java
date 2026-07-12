package practice2.task12;

public class SmartHomeFacade {

    private Light light;
    private Conditioner conditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        light = new Light();
        conditioner = new Conditioner();
        securitySystem = new SecuritySystem();
    }

    public void turnOnAll() {
        light.on();;
        conditioner.on();
        securitySystem.on();
    }

    public void turnOffAll() {
        light.off();
        conditioner.off();
        securitySystem.off();
    }
}
