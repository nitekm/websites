package websites;

public class CustomWebsite extends Website{

    public CustomWebsite(Reporter reporter) {
        name = "Custom Feed";
        this.reporter = reporter;
        this.reporter.addWebsite(this);
    }

    @Override
    public void update() {
        String m = reporter.getMessage();
        for (int i = 0; i < reporter.getMessage().length(); i++) {
            if (m.charAt(i) >= 'a' && m.charAt(i) <= 'k') {
                points++;
            }
        }
        System.out.println(getName() + " " + getPoints() + " informs: " + m);
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPoints() {
        return 0;
    }
}
