public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        long massKg = 98;
        double hightM = 1.87;
        long bmi = service.calculate(massKg,hightM);
        System.out.println(bmi);
    }
}