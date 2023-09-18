package scheduler;

public class Timing {
    private int timingId;
    private String start;
    private String end;

    public Timing() {
        // Default constructor
    }

    public Timing(int timingId, String start, String end) {
        this.timingId = timingId;
        this.start = start;
        this.end = end;
    }

    public int getTimingId() {
        return timingId;
    }

    public void setTimingId(int timingId) {
        this.timingId = timingId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}