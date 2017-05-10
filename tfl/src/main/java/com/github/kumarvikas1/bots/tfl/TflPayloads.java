package com.github.kumarvikas1.bots.tfl;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * Created by vikakumar on 5/7/17.
 */
public enum TflPayloads {

    Tfl_date_today {
        @Override
        public Supplier<String> getDates() {
            return () -> LocalDate.now().toString();
        }
    },
    Tfl_date_tomorrow {
        @Override
        public Supplier<String> getDates() {
            return () -> LocalDate.now().plusDays(1).toString();
        }
    };


    public abstract Supplier<String> getDates();

}
