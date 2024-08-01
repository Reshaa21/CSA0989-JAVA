import java.util.*;

class TrafficSignal {
    String id;
    int greenTime;
    int yellowTime;
    int redTime;
    int currentTime;

    TrafficSignal(String id, int green, int yellow, int red) {
        this.id = id;
        this.greenTime = green;
        this.yellowTime = yellow;
        this.redTime = red;
        this.currentTime = 0;
    }

    void updateSignal() {
        currentTime++;
        if (currentTime % (greenTime + yellowTime + redTime) < greenTime) {
            System.out.println(id + " Green");
        } else if (currentTime % (greenTime + yellowTime + redTime) < greenTime + yellowTime) {
            System.out.println(id + " Yellow");
        } else {
            System.out.println(id + " Red");
        }
    }
}

class TrafficData {
    int vehicleCount;
    int speed;

    TrafficData(int count, int speed) {
        this.vehicleCount = count;
        this.speed = speed;
    }
}

class TrafficOptimizer {
    List<TrafficSignal> signals;

    TrafficOptimizer(List<TrafficSignal> signals) {
        this.signals = signals;
    }

    void optimizeSignals(TrafficData data) {
        for (TrafficSignal signal : signals) {
            if (data.vehicleCount > 50) {
                signal.greenTime = 60;
                signal.redTime = 30;
            } else {
                signal.greenTime = 30;
                signal.redTime = 60;
            }
            signal.updateSignal();
        }
    }
}

public class TrafficManagementSystem {
    public static void main(String[] args) {
        List<TrafficSignal> signals = new ArrayList<>();
        signals.add(new TrafficSignal("Intersection1", 30, 5, 60));
        signals.add(new TrafficSignal("Intersection2", 30, 5, 60));

        TrafficOptimizer optimizer = new TrafficOptimizer(signals);

        TrafficData data = new TrafficData(55, 40);
        optimizer.optimizeSignals(data);

        TrafficData data2 = new TrafficData(30, 30);
        optimizer.optimizeSignals(data2);
    }
}
