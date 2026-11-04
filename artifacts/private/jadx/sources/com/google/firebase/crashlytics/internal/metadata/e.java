package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f121273a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121275c;

    public e(int i10, int i11) {
        this.f121274b = i10;
        this.f121275c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f121275c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    @NonNull
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f121273a));
    }

    public synchronized boolean d(String str, String str2) {
        try {
            String strB = b(str);
            if (this.f121273a.size() >= this.f121274b && !this.f121273a.containsKey(strB)) {
                com.google.firebase.crashlytics.internal.g.f().m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f121274b);
                return false;
            }
            String strC = c(str2, this.f121275c);
            if (com.google.firebase.crashlytics.internal.common.i.B(this.f121273a.get(strB), strC)) {
                return false;
            }
            Map<String, String> map = this.f121273a;
            if (str2 == null) {
                strC = "";
            }
            map.put(strB, strC);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strB = b(entry.getKey());
                if (this.f121273a.size() < this.f121274b || this.f121273a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f121273a.put(strB, value == null ? "" : c(value, this.f121275c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                com.google.firebase.crashlytics.internal.g.f().m("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f121274b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
