

import org.apache.logging.log4j.*;

public class myTimerLoggings {
    static Logger logger = LogManager.getLogger(myTimerLoggings.class);
    public static void main(String[] args) {

        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.error("This is an ERROR message");
    }
}