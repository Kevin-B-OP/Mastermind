package com.opckev.Fonctionnement1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(com.opckev.Main.class);

    public static void main(String... args){
        if (LOG.isDebugEnabled()){
            LOG.debug("This will be printed on debug");
        }
        LOG.info("This will be printed on info");
        LOG.warn("This will be printed on warn");
        LOG.error("This will be printed on error");
        LOG.fatal("This will be printed on fatal");

        LOG.info("Appending string: {}.", "Hello, World");
    }
}