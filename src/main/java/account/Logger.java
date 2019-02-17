package account;

import java.util.Map;

public class Logger {

    public Logger() {
    }

    private static Logger instance;

    private static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) return new Logger();
            }
        }
        return new Logger();
    }


    public void log(String log) {

        System.out.println(log);
    }
}
