package me.steven.ezclub.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * util for md5 encryption
 */
public class MD5Util {

    private final static Logger log = LoggerFactory.getLogger(MD5Util.class);

    public static String encrypt(String str) {
        if (str != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(str.getBytes());
                StringBuilder resultStr = new StringBuilder();
                for (byte result : results) {
                    resultStr.append(String.format("%02x", result));
                }
                return resultStr.toString().toUpperCase();
            } catch (Exception e) {
                log.error("MD5 加密失败");
                e.printStackTrace();
            }
        }
        return null;
    }

}
