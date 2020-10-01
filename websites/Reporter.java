package websites;

import java.util.ArrayList;

public class Reporter {

    ArrayList<Website> websites = new ArrayList<>();
    private String message;

    public void addWebsite(Website website) {
        websites.add(website);
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<Website> getWebsites() {
        return websites;
    }

    public void broadcastMessage(String message) {
            this.message = message;
            notifyAllWebsites();
    }

    public void notifyAllWebsites() {
        for(Website w:websites) {
            w.update();
        }
    }


}
