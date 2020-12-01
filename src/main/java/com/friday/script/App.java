package com.friday.script;

import java.time.LocalDate;
import java.util.logging.Logger;

public class App {

    private static Logger log = Logger.getLogger(App.class.getName());


    public static void main(String[] args){


        LocalDate loc = LocalDate.now();
        log.info(loc.toString());




    }
}
