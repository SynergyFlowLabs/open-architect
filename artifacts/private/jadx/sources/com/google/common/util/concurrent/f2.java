package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b(emulated = true)
final class f2 {
    private f2() {
    }

    static boolean a(@fj.a Throwable t10, Class<? extends Throwable> expectedClass) {
        return expectedClass.isInstance(t10);
    }

    static void b(Throwable t10) {
        com.google.common.base.j0.E(t10);
        if (t10 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
