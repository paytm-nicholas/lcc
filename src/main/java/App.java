import com.lcc.TimeRange;
import com.lcc.TimeRangeCollection;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
      TimeRangeCollection include = new TimeRangeCollection(new LinkedList(Arrays.asList(
          new TimeRange(LocalTime.of(9, 0), LocalTime.of(9, 30)),
          new TimeRange(LocalTime.of(10,0), LocalTime.of(10, 30))
      )));
      TimeRangeCollection exclude = new TimeRangeCollection(new LinkedList(Arrays.asList(
          new TimeRange(LocalTime.of(9, 15), LocalTime.of(10, 15))
      )));
      include.substract(exclude);
      include.print();
    }
}