package websites;

import java.util.Arrays;

public class ConsonantWebsite extends Website{

    public ConsonantWebsite(Reporter reporter) {
        this.name = "The Constants";
        this.reporter = reporter;
        reporter.addWebsite(this);
    }

    @Override
    public void update() {
        String m = reporter.getMessage();
        for (int i = 0; i < reporter.getMessage().length(); i++) {
            if (m.charAt(i) != 'a' && m.charAt(i) != 'e' && m.charAt(i) != 'i'
                    && m.charAt(i) != 'o' && m.charAt(i) != 'u') {
                points++;
            }
        }
        m=m.toUpperCase().replaceAll("A", "a").replaceAll("E", "e")
                            .replaceAll("I", "i").replaceAll("O", "o")
                            .replaceAll("U", "u");
            System.out.println(getName() + " " + getPoints() + " informs: " + m);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
