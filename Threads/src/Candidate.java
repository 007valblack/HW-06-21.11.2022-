import static java.lang.Thread.sleep;

public class Candidate extends Thread {
        private String[] names;
    public Candidate(String... names) {
           this.names=names;}

    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Выявлен кандидат №" + i + ": " +names[i]);
            try {
                sleep(100);
            } catch (Exception e) {};
        }
    }

}

