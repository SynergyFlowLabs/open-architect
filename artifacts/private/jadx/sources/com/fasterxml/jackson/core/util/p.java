package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f102856a = Pattern.compile("[-_./;:]");

    protected p() {
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static v b(ClassLoader classLoader, String str, String str2) {
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/maven/" + str.replaceAll("\\.", "/") + "/" + str2 + "/pom.properties");
        if (resourceAsStream != null) {
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                v vVarD = d(properties.getProperty("version"), properties.getProperty("groupId"), properties.getProperty("artifactId"));
                a(resourceAsStream);
                return vVarD;
            } catch (IOException unused) {
                a(resourceAsStream);
            } catch (Throwable th2) {
                a(resourceAsStream);
                throw th2;
            }
        }
        return v.v();
    }

    public static v c(Class<?> cls) {
        v vVarV = null;
        try {
            Class<?> cls2 = Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader());
            try {
                vVarV = ((w) cls2.getDeclaredConstructor(null).newInstance(null)).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + cls2);
            }
        } catch (Exception unused2) {
        }
        if (vVarV == null) {
            vVarV = v.v();
        }
        return vVarV;
    }

    public static v d(String str, String str2, String str3) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                String[] strArrSplit = f102856a.split(strTrim);
                return new v(e(strArrSplit[0]), strArrSplit.length > 1 ? e(strArrSplit[1]) : 0, strArrSplit.length > 2 ? e(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return v.v();
    }

    protected static int e(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
                break;
            }
            i10 = (i10 * 10) + (cCharAt - '0');
        }
        return i10;
    }

    public static final void f() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static v h(Class<?> cls) {
        v vVarC = c(cls);
        return vVarC == null ? v.v() : vVarC;
    }

    @Deprecated
    public v g() {
        return v.v();
    }
}
