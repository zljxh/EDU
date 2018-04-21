package com.zl.edu.util;

import java.util.Random;

/**
 * Created by user on 2018/3/1.
 */
public class KeyUtil {
    public static long getItemId() {
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end2 = random.nextInt(99);
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }
}
