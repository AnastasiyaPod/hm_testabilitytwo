public class BodyMassIndex {
    public long calculate (long massKg, double heightM) {
        long square = 2;
        double bodyMassIndex = (massKg / Math.pow(heightM, square));
        return (long) bodyMassIndex;
    }
}