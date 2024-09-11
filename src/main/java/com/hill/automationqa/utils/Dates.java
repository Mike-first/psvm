package com.hill.automationqa.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Dates {

    private LocalDateTime localDateTime;

    private static final String DEFAULT_PATTERN = "_yyyy.MM.dd_HH.mm.ss";

    private Dates(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public static Dates now() {
        return new Dates(LocalDateTime.now());
    }

    public String timeStamp() {
        return timeStamp(DEFAULT_PATTERN);
    }

    public String timeStamp(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(Timestamp.valueOf(localDateTime));
    }
}
