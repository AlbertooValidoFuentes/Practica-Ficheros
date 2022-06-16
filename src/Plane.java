public class Plane {

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

    @Override
    public String toString() {
        return "Plane{" +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + flaps +
                ", landingGear=" + landingGear +
                ", ejectionSystem=" + ejectionSystem +
                ", seatOccupation=" + seatOccupation +
                '}';
    }
}
