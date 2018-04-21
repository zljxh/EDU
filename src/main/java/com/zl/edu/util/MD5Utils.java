package com.zl.edu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: JonnyPan
 * Date: 13-12-2
 * Time: 上午11:19
 * To change this template use File | Settings | File Templates.
 */
public class MD5Utils {

    private static MessageDigest md5 = null;

    private static MessageDigest getInstance() {
        if (md5 == null) {
            try {
                // 获得MD5摘要算法的 MessageDigest 对象
                md5 = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return md5;
    }

    public static String ecode(String orgString) {
        try {
            byte[] cipher = getInstance().digest(orgString.getBytes());
            StringBuilder builder = new StringBuilder();
            for (byte b : cipher) {
                byte b1 = (byte) ((b & 0xf0) >> 4);
                byte b2 = (byte) (b & 0x0f);
                builder.append((b1 < 10 ? (char) ('0' + b1) :
                        (char) ('a' + (b1 - 10))));
                builder.append((b2 < 10 ? (char) ('0' + b2) :
                        (char) ('a' + (b2 - 10))));
            }
            return builder.toString();
        } catch (Exception nsae) {
            return orgString;
        }
    }

    public static byte[] getMD5(byte[] in) {
        // 使用指定的字节更新摘要
        getInstance().update(in);
        // 获得密文
        byte[] md = getInstance().digest();
        return md;
    }
}
