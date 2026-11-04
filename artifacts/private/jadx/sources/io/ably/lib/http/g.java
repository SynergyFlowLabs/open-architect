package io.ably.lib.http;

import androidx.media3.exoplayer.audio.s0;
import io.ably.lib.types.r;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f287310k = "0123456789abcdef";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static MessageDigest f287311l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f287312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f287313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f287314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f287315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f287316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f287317f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f287318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f287319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f287320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f287321j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f287322a;

        static {
            int[] iArr = new int[b.values().length];
            f287322a = iArr;
            try {
                iArr[b.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287322a[b.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        BASIC,
        DIGEST,
        X_ABLY_TOKEN;

        static b l(String str) {
            String strReplace = str.toUpperCase(Locale.ROOT).replace(org.apache.commons.codec.language.l.f335457d, '_');
            try {
                return valueOf(strReplace);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Failed to parse conformed form '" + strReplace + "' of raw value '" + str + "'.", e10);
            }
        }
    }

    static {
        try {
            f287311l = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    g(String str, String str2, b bVar) {
        this.f287319h = str;
        this.f287320i = str2;
        this.f287321j = bVar;
    }

    private static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(f287310k.charAt((bArr[i10] & 240) >> 4));
            sb2.append(f287310k.charAt(bArr[i10] & com.google.common.base.c.f116464q));
        }
        return sb2.toString();
    }

    private static String b(byte[] bArr) {
        f287311l.reset();
        f287311l.update(bArr);
        return a(f287311l.digest());
    }

    private static String c(String str) {
        try {
            return b(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String e() {
        return c(new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date()) + Integer.valueOf(new Random(s0.f63372z).nextInt()).toString()).substring(0, 8);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[LOOP:0: B:5:0x000c->B:14:0x0034, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0030 A[SYNTHETIC] */
    private String f(String str, String str2, byte[] bArr) throws io.ably.lib.types.a {
        String str3;
        String strC;
        String strE;
        String[] strArr = this.f287314c;
        String str4 = null;
        if (strArr == null) {
            str3 = null;
            break;
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str3 = null;
                break;
            }
            String str5 = strArr[i10];
            if (bArr != null) {
                str3 = "auth-int";
                if (str5.trim().equals("auth-int")) {
                    break;
                }
                if (str5.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i10++;
            } else {
                if (str5.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i10++;
            }
        }
        if (str3 == null) {
            strC = c(this.f287318g + AbstractJsonLexerKt.COLON + this.f287313b + AbstractJsonLexerKt.COLON + c(str + AbstractJsonLexerKt.COLON + str2));
            strE = null;
        } else if (str3.equals("auth")) {
            int i11 = this.f287317f;
            this.f287317f = i11 + 1;
            str4 = String.format("%08X", Integer.valueOf(i11));
            strE = e();
            strC = c(this.f287318g + AbstractJsonLexerKt.COLON + this.f287313b + AbstractJsonLexerKt.COLON + str4 + AbstractJsonLexerKt.COLON + strE + AbstractJsonLexerKt.COLON + str3 + AbstractJsonLexerKt.COLON + c(str + AbstractJsonLexerKt.COLON + str2));
        } else {
            int i12 = this.f287317f;
            this.f287317f = i12 + 1;
            str4 = String.format("%08X", Integer.valueOf(i12));
            String strE2 = e();
            strC = c(this.f287318g + AbstractJsonLexerKt.COLON + this.f287313b + AbstractJsonLexerKt.COLON + str4 + AbstractJsonLexerKt.COLON + strE2 + AbstractJsonLexerKt.COLON + str3 + AbstractJsonLexerKt.COLON + c(str + AbstractJsonLexerKt.COLON + str2 + AbstractJsonLexerKt.COLON + b(bArr)));
            strE = strE2;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Digest ");
        sb2.append("username");
        sb2.append("=\"");
        sb2.append(this.f287319h);
        sb2.append("\",");
        sb2.append(hi.c.C1916c.f285813b);
        sb2.append("=\"");
        sb2.append(this.f287312a);
        sb2.append("\",");
        sb2.append("nonce");
        sb2.append("=\"");
        sb2.append(this.f287313b);
        sb2.append("\",");
        sb2.append("uri");
        sb2.append("=\"");
        sb2.append(str2);
        sb2.append("\",");
        sb2.append("algorithm");
        sb2.append("=\"");
        sb2.append("MD5");
        sb2.append("\",");
        if (str3 != null) {
            sb2.append("qop");
            sb2.append("=\"");
            sb2.append(str3);
            sb2.append("\",");
            sb2.append("nc");
            sb2.append("=");
            sb2.append(str4);
            sb2.append(",");
            sb2.append("cnonce");
            sb2.append("=\"");
            sb2.append(strE);
            sb2.append("\",");
        }
        if (this.f287315d != null) {
            sb2.append(io.sentry.protocol.n.f306405g);
            sb2.append("=\"");
            sb2.append(strC);
            sb2.append("\",");
            sb2.append("opaque");
            sb2.append("=\"");
            sb2.append(this.f287315d);
            sb2.append("\"");
        } else {
            sb2.append(io.sentry.protocol.n.f306405g);
            sb2.append("=\"");
            sb2.append(strC);
            sb2.append("\"");
        }
        return sb2.toString();
    }

    private synchronized void i(String str) throws io.ably.lib.types.a {
        try {
            HashMap<String, String> mapK = k(str);
            this.f287312a = mapK.get(hi.c.C1916c.f285813b);
            this.f287313b = mapK.get("nonce");
            this.f287315d = mapK.get("opaque");
            this.f287318g = c(this.f287319h + AbstractJsonLexerKt.COLON + this.f287312a + AbstractJsonLexerKt.COLON + this.f287320i);
            String str2 = mapK.get("qop");
            if (str2 != null) {
                this.f287314c = str2.split(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Map<b, String> j(Collection<String> collection) throws io.ably.lib.types.a {
        HashMap map = new HashMap();
        for (String str : collection) {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw io.ably.lib.types.a.a(new r("Invalid authenticate header (no delimiter)", 40000, 400));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            map.put(b.l(strTrim), str.substring(iIndexOf + 1).trim());
        }
        return map;
    }

    private static HashMap<String, String> k(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(",")) {
            if (str2.contains("=")) {
                map.put(str2.substring(0, str2.indexOf("=")).trim(), str2.substring(str2.indexOf("=") + 1).replaceAll("\"", "").trim());
            }
        }
        return map;
    }

    public String d(String str, String str2, byte[] bArr) throws io.ably.lib.types.a {
        int i10 = a.f287322a[this.f287316e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return f(str, str2, bArr);
        }
        return "Basic " + io.ably.lib.util.b.k(this.f287319h + AbstractJsonLexerKt.COLON + this.f287320i);
    }

    boolean g() {
        return this.f287316e != null;
    }

    public void h(Map<b, String> map) throws io.ably.lib.types.a {
        b bVar = this.f287321j;
        this.f287316e = bVar;
        String value = map.get(bVar);
        if (value == null) {
            Map.Entry<b, String> next = map.entrySet().iterator().next();
            if (next == null) {
                throw io.ably.lib.types.a.a(new r("Invalid authenticate header (no entries)", 40000, 400));
            }
            this.f287316e = next.getKey();
            value = next.getValue();
        }
        if (this.f287316e == b.DIGEST) {
            i(value);
        }
    }
}
