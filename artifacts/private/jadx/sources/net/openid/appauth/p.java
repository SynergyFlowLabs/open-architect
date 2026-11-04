package net.openid.appauth;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f333109a = 43;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f333110b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f333111c = 64;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f333112d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f333113e = 96;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f333114f = 11;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f333115g = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    private p() {
        throw new IllegalStateException("This type is not intended to be instantiated");
    }

    public static void a(String str) {
        t.b(43 <= str.length(), "codeVerifier length is shorter than allowed by the PKCE specification");
        t.b(str.length() <= 128, "codeVerifier length is longer than allowed by the PKCE specification");
        t.b(f333115g.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
            messageDigest.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e10) {
            net.openid.appauth.internal.a.c("ISO-8859-1 encoding not supported on this device!", e10);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e10);
        } catch (NoSuchAlgorithmException e11) {
            net.openid.appauth.internal.a.l("SHA-256 is not supported on this device! Using plain challenge", e11);
            return str;
        }
    }

    public static String c() {
        return d(new SecureRandom(), 64);
    }

    public static String d(SecureRandom secureRandom, int i10) {
        t.g(secureRandom, "entropySource cannot be null");
        t.b(32 <= i10, "entropyBytes is less than the minimum permitted");
        t.b(i10 <= 96, "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[i10];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String e() {
        try {
            MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
            return f.f332949o;
        } catch (NoSuchAlgorithmException unused) {
            return f.f332950p;
        }
    }
}
