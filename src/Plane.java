import java.io.Serializable;

public class Plane implements Serializable {

    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;

    private boolean flaps;
    private boolean landingGear;
    private boolean ejectionSystem;

    private boolean seatOccupation;

    private boolean initialized;

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;
        this.flaps = true;
        this.landingGear = false;
        this.ejectionSystem = false;
        this.seatOccupation = true;
    }

    public void toggleFlaps() {
        flaps = !flaps;
    }

    public void toggleLandingGear() {
        landingGear = !landingGear;
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }

    public void setSeatOccupation(boolean pilotSeated) {
        seatOccupation = pilotSeated;
    }

    public void setInitialized(boolean state) {
        initialized = state;
    }

    public boolean getInitialized() {
        return initialized;
    }

    public boolean getEjectionSystem() {
        return ejectionSystem;
    }

    public String statusFlaps() {
        return flaps ? "Arriba" : "Abajo";
    }

    public String statusLandingGear() {
        return landingGear ? "Arriba" : "Abajo";
    }

    public String statusEjectionSystem() {
        return ejectionSystem ? "Armado" : "Desarmado";
    }

    public String statusSeatOccupation() {
        return seatOccupation ? "Verdadero" : "Falso";
    }

    @Override
    public String toString() {
        return "Plane{" + "\n" +
                "- fuelLevel=" + fuelLevel + "\n" +
                "- pilotCallSign=' " + pilotCallSign + '\'' + "\n" +
                "- squadNumber=' " + squadNumber + '\'' + "\n" +
                "- flaps= " + statusFlaps() + "\n" +
                "- landingGear= " + statusLandingGear() + "\n" +
                "- ejectionSystem= " + statusEjectionSystem() + "\n" +
                "- seatOccupation= " + statusSeatOccupation() + "\n" +
                '}';
    }
}
