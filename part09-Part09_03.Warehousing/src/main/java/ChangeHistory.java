import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }

    public double maxValue() {
        double maxValue = changeHistory.get(0);

        for (Double change: changeHistory) {
            if (maxValue <= change) {
                maxValue = change;
            }
        }

        return  maxValue;
    }

    public double minValue() {
        double minValue = changeHistory.get(0);

        for (Double change: changeHistory) {
            if (minValue >= change) {
                minValue = change;
            }
        }

        return minValue;
    }

    public double average() {
        double sum = 0;

        for (Double change: changeHistory) {
            sum += change;
        }

        return sum / changeHistory.size();
    }
}
