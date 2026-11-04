package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.y7;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f306956b = "00000000-0000-0000-0000-000000000000";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f306957c = "0000-0000";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f306955a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Pattern f306958d = Pattern.compile("[\\W_]+");

    private h0() {
    }

    @NotNull
    public static String a(long j10) {
        if (-1000 < j10 && j10 < 1000) {
            return j10 + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j10 > -999950 && j10 < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j10 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j10 /= 1000;
            stringCharacterIterator.next();
        }
    }

    @Nullable
    public static String b(@Nullable String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335249c).digest(str.getBytes(f306955a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                iLogger.a(y7.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                iLogger.c(y7.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    @Nullable
    public static String c(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = f306958d.split(str, -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(d(str2));
        }
        return sb2.toString();
    }

    @Nullable
    public static String d(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = str.substring(0, 1);
            Locale locale = Locale.ROOT;
            sb2.append(strSubstring.toUpperCase(locale));
            sb2.append(str.substring(1).toLowerCase(locale));
            str = sb2.toString();
        }
        return str;
    }

    public static int e(@NotNull String str, char c10) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    @Nullable
    public static String f(@Nullable String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i10 = iLastIndexOf + 1)) ? str : str.substring(i10);
    }

    public static String g(@NotNull CharSequence charSequence, @NotNull Iterable<? extends CharSequence> iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<? extends CharSequence> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
            while (it.hasNext()) {
                sb2.append(charSequence);
                sb2.append(it.next());
            }
        }
        return sb2.toString();
    }

    public static String h(@NotNull String str) {
        if (str.equals(f306957c)) {
            str = f306956b;
        }
        return str;
    }

    @NotNull
    public static String i(@Nullable String str, @NotNull String str2) {
        if (str == null) {
            return "";
        }
        return str.indexOf(str2) == 0 ? str.substring(str2.length()) : str;
    }

    @Nullable
    public static String j(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null && str.startsWith(str2) && str.endsWith(str2)) {
            str = str.substring(str2.length(), str.length() - str2.length());
        }
        return str;
    }

    @NotNull
    public static String k(@Nullable String str, @NotNull String str2) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str;
    }

    @Nullable
    public static String l(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
