package com.example.teamwork.All.login.Dao;

import org.springframework.util.Base64Utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

    public static final String algorithm = "AES";
    public static final String transformation = "AES/CBC/NOPadding";
    public static final String key = "1234567812345678";
    public  String encryptByAES(String original) throws Exception {
        Cipher cipher = Cipher.getInstance(transformation);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
        IvParameterSpec iv = new IvParameterSpec(key.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
        byte[] bytes = cipher.doFinal(original.getBytes());

        return Base64Utils.encodeToString(bytes);
    }

    /**
     * ����
     * @param encrypted ��Ҫ���ܵĲ���
     * @return
     * @throws Exception
     */
    public  String decryptByAES(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance(transformation);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
        IvParameterSpec iv = new IvParameterSpec(key.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, keySpec, iv);
        byte[] bytes = cipher.doFinal(Base64Utils.decodeFromString(encrypted));

        return new String(bytes);
    }
}