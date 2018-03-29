package pm.hello;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String... args) {
        System.out.println("I'm alive and well");
        if (args.length > 0) {
            System.out.println(Stream.of(args).collect(Collectors.joining("\", \"", "Arguments: \"", "\".")));
        }
    }
}
