package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f120098a = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private h2() {
    }

    public static Runnable a() {
        return f120098a;
    }
}
