package websites;

import java.util.ArrayList;

public class WebsitesTest {
    public static void main(String[] args) {

        Reporter reporter = new Reporter();
        Website website1 = new VowelWebsite(reporter);
        Website website2 = new ConsonantWebsite(reporter);
        Website website3 = new CustomWebsite(reporter);

        reporter.broadcastMessage("cows lose their jobs as milk prices drop");
        System.out.println();
        reporter.broadcastMessage("safety meeting ends in accident");

    }
}
