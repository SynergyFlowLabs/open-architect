package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f130247a;

    protected q(r rVar) {
        this.f130247a = rVar;
    }

    public static void c(String str, StringBuilder sb2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(str);
    }

    public static void d(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                c(str, sb2);
            }
        }
    }

    public abstract String a();

    public final r b() {
        return this.f130247a;
    }

    public final String toString() {
        return a();
    }
}
