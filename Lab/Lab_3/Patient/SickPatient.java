public class SickPatient extends Patient {
    private String epicrisis;
    private String status;
    private int illnessDay;

    public SickPatient() {
    }

    public SickPatient(String name, String address, String egn,
            String epicrisis, String status, int illnessDay) {
        super(name, address, egn);
        this.epicrisis = epicrisis;
        this.status = status;
        this.illnessDay = illnessDay;
    }

    @Override
    public void input() {
        super.input();

        System.out.print("Epikriza (bolest): ");
        epicrisis = scanner.nextLine();

        System.out.print("Status (bolen/zdrav): ");
        status = scanner.nextLine();

        do {
            System.out.print("Den na zabolyavane (1-366): ");
            illnessDay = Integer.parseInt(scanner.nextLine());
        } while (illnessDay < 1 || illnessDay > 366);
    }

    @Override
    public void output() {
        super.output();

        System.out.println("Epikriza: " + epicrisis);
        System.out.println("Status: " + status);
        System.out.println("Den na zabolyavane: " + illnessDay);
    }

    @Override
    public void cure() {
        System.out.print("Ime na lekarstvo: ");
        String medicine = scanner.nextLine();

        System.out.print("Doza: ");
        double dose = Double.parseDouble(scanner.nextLine());

        cure(medicine, dose);
    }

    public void cure(String medicine, double dose) {
        epicrisis += "\nPrieto lekarstvo: " + medicine + ", doza: " + dose;
    }
}
