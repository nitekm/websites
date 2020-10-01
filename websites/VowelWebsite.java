package websites;

public class VowelWebsite extends Website{

    public VowelWebsite(Reporter reporter) {
        this.name = "Vowel News";
        this.reporter = reporter;
        reporter.addWebsite(this);
    }



      @Override
    public void update() {
        String m = reporter.getMessage();
        for (int i = 0; i < reporter.getMessage().length(); i++) {
            if (m.charAt(i) == 'a' || m.charAt(i) == 'e' || m.charAt(i) == 'i'
                    || m.charAt(i) == 'o' || m.charAt(i) == 'u') {
                points++;
            }
        }
          m=m.replaceAll("a", "A").replaceAll("e", "E")
                    .replaceAll("i", "I").replaceAll("o", "O")
                    .replaceAll("u", "U");
        System.out.println(getName() + " " + getPoints() + " informs: " + m);
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

}
