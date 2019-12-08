import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class OversizedPancakeFlipper {

    private static final String FILENAME = "A-small-practice.out";

    public static void main(String[] args) throws IOException {
        String fileName = "A-small-practice.in";

        Stream<String> stream = Files.lines(Paths.get(fileName));

        int count = 0;
        for( String line : (Iterable<String>) stream::iterator ) {
            if(count != 0){
                try{
                    Belt belt = BeltCreator.createBelt(line);
                    int noOfTimesFlipped = Flipper.flip(belt);
                    if(noOfTimesFlipped > -1){
                        System.out.println("Case #" + (count) + ": " + noOfTimesFlipped);
                    } else {
                        System.out.println("Case #" + (count) + ": IMPOSSIBLE");
                    }
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            count++;
        }

    }
}
