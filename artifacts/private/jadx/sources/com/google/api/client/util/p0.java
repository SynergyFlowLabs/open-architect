package com.google.api.client.util;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {
    private p0() {
    }

    public static RuntimeException a(Throwable th2) {
        return com.google.api.client.repackaged.com.google.common.base.x.p(th2);
    }

    public static void b(Throwable th2) {
        if (th2 != null) {
            com.google.api.client.repackaged.com.google.common.base.x.v(th2);
        }
    }

    public static <X extends Throwable> void c(Throwable th2, Class<X> cls) throws Throwable {
        com.google.api.client.repackaged.com.google.common.base.x.s(th2, cls);
    }
}
