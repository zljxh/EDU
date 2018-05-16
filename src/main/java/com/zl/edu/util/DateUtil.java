package com.zl.edu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String dateToString(Date date, String form) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(form);
            return dateFormat.format(date);
        } catch (Exception e) {
            return "";
        }

    }
}
