public class RunningTeam {
    private double[] times;

    public RunningTeam(double[] times) {
        this.times = times;
    }


    public double getFastestRun() {
        double fastest = Double.MAX_VALUE;
        for (double time : times) {
            if (time < fastest) {
                fastest = time;
            }
        }
        return fastest;
    }

    public double getSlowestRun() {
        double slowest = Double.MIN_VALUE;
        for (double time : times) {
            if (time > slowest) {
                slowest = time;
            }
        }
        return slowest;
    }

    public double getAverageRun() {
        double sum = 0;
        for (double time : times) {
            sum += time;
        }
        return sum / times.length;
    }

}
