package scheduler;

public class Floor {
    private int id;
    private int floorNo;

    public Floor() {
        // Default constructor
    }

    public Floor(int id, int floorNo) {
        this.id = id;
        this.floorNo = floorNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
}