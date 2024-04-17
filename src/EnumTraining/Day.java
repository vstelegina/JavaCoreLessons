package EnumTraining;

public enum Day {
    Monday (true, 8),
    Tuesday(true, 8),
    Wednesday(true, 8),
    Thursday(true, 8),
    Friday(true, 6),
    Saturday(false, 0),
    Sunday(false, 0);

    private boolean isWorkingDay;
    private int workingHours;

    Day(boolean isWorkingDay, int workingHours) {
        this.isWorkingDay = isWorkingDay;
        this.workingHours = workingHours;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public static void main(String[] args) {
       // System.out.println(Day.name() + " " + Day.Monday.isWorkingDay() + " " + Day.Monday.getWorkingHours());

    }
}
