package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Printer {
    private static final Logger logger = LoggerFactory.getLogger(Printer.class);

    void print(String message) {
        logger.info(message);
    }
}

class Report {
    private static final Logger logger = LoggerFactory.getLogger(Report.class);
    void generate() {
        logger.info("Generating report...");
    }
}
