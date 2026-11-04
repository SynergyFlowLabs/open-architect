package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f130873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f130874b;

    static {
        f130873a = System.getProperty("surefire.test.class.path") != null;
        f130874b = new StackTraceElement[0];
    }

    q() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    q(Throwable th2) {
        super(th2);
    }
}
