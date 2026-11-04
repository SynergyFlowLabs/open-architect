package org.msgpack.core;

/* JADX INFO: loaded from: classes14.dex */
public class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IllegalStateException f339302a = new IllegalStateException("Cannot reach here");

    public i() {
    }

    public static UnsupportedOperationException a(String str) {
        return new UnsupportedOperationException(str);
    }

    public i(String str) {
        super(str);
    }

    public i(String str, Throwable th2) {
        super(str, th2);
    }

    public i(Throwable th2) {
        super(th2);
    }
}
