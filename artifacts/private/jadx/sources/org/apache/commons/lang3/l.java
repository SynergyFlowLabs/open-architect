package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes14.dex */
public class l {
    public static String a(Class<?> cls, String str) {
        c0.P(cls, "Parameter '%s' must not be null!", "context");
        c0.P(str, "Parameter '%s' must not be null!", "resourceName");
        return b(cls.getPackage(), str);
    }

    public static String b(Package r10, String str) {
        c0.P(r10, "Parameter '%s' must not be null!", "context");
        c0.P(str, "Parameter '%s' must not be null!", "resourceName");
        return r10.getName() + "." + str;
    }

    public static String c(Class<?> cls, String str) {
        c0.P(cls, "Parameter '%s' must not be null!", "context");
        c0.P(str, "Parameter '%s' must not be null!", "resourceName");
        return d(cls.getPackage(), str);
    }

    public static String d(Package r10, String str) {
        c0.P(r10, "Parameter '%s' must not be null!", "context");
        c0.P(str, "Parameter '%s' must not be null!", "resourceName");
        return r10.getName().replace('.', '/') + "/" + str;
    }
}
