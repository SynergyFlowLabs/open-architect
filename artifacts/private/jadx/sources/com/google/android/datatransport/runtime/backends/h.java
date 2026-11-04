package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class h {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static h a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static h d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static h e(long j10) {
        return new b(a.OK, j10);
    }

    public static h f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
