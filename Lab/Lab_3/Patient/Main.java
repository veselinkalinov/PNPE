public class Main {
    public static void main(String[] args) {
        SickPatient patient = new SickPatient();

        patient.input();
        patient.cure();
        patient.output();

        System.out.println();

        SickPatient patient2 = new SickPatient(
                "Ivan", "Sofia", "0123456789",
                "Grip", "bolen", 50);

        patient2.cure("Paracetamol", 500);
        patient2.output();
    }
}
