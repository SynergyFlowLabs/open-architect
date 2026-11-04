package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1cSDK {
    @androidx.annotation.p0
    public static byte[] getCurrencyIso4217Code(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e10);
            return null;
        }
    }

    public static long getMediationNetwork(@androidx.annotation.p0 byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
    }

    public static String getMonetizationNetwork(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return getRevenue(messageDigest.digest());
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e10);
            return null;
        }
    }

    private static String getRevenue(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    public static String getRevenue(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return getRevenue(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, true);
            return e10.getMessage();
        }
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFc1pSDK aFc1pSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String strComponent1 = AFc1pSDK.component1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(strComponent1);
        return getRevenue(sb2.toString(), AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork)).equals(str2);
    }
}
