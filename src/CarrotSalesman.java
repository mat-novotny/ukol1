import java.time.LocalDate;

public class CarrotSalesman {
    private String name;
    private LocalDate birthDate;
    private int contracts;
    private double carrotTonsSold;
    private boolean senior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getContracts() {
        return contracts;
    }

    public void setContracts(int contracts) {
        this.contracts = contracts;
    }

    public double getCarrotTonsSold() {
        return carrotTonsSold;
    }

    public void setCarrotTonsSold(double carrotTonsSold) {
        this.carrotTonsSold = carrotTonsSold;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
}
