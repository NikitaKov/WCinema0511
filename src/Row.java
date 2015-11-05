import java.util.ArrayList;

/**
 * Created by IIS on 05.11.2015.
 */
public class Row {
    int rowNum;
    ArrayList<Integer> seats;

    public Row(int rowNum, ArrayList<Integer> seats) {
        this.rowNum = rowNum;
        this.seats = seats;
    }

    public int getRowNum() {
        return rowNum;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }
}
