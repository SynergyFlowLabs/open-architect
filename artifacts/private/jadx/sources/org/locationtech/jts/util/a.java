package org.locationtech.jts.util;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static void a(Object obj, Object obj2) {
        b(obj, obj2, null);
    }

    public static void b(Object obj, Object obj2, String str) {
        String str2;
        if (obj2.equals(obj)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(obj);
        sb2.append(" but encountered ");
        sb2.append(obj2);
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        throw new b(sb2.toString());
    }

    public static void c(boolean z10) {
        d(z10, null);
    }

    public static void d(boolean z10, String str) {
        if (z10) {
            return;
        }
        if (str != null) {
            throw new b(str);
        }
        throw new b();
    }

    public static void e() {
        f(null);
    }

    public static void f(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Should never reach here");
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        throw new b(sb2.toString());
    }
}
