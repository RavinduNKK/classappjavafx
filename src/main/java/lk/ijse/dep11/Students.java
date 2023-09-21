package lk.ijse.dep11;

public class Students {
    private int Number;
    private String Name;
    private int ContactNumber;

    public Students(int number, String name, int contactNumber) {
        Number = number;
        Name = name;
        ContactNumber = contactNumber;
    }

    public int getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }

    public int getContactNumber() {
        return ContactNumber;
    }
}
