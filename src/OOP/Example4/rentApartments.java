package OOP.Example4;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    private double rent;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrNo(balconyOrNo);
        if (balconyOrNo) {
            rent += 200;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        if (roomCount == 0) {
            rent = 1400;
        } else if (roomCount == 1) {
            rent = 1700;
        } else if (roomCount == 2) {
            rent = 2200;
        } else if (roomCount == 3) {
            rent = 2700;
        }
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public double amountOfRent() {
        return this.rent;
    }

    @Override
    public String toString() {
        return name + " " + "rent is " + amountOfRent();
    }
}

