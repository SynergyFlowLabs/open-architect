package io.sentry.android.core;

import android.os.Debug;
import io.sentry.e4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class z implements io.sentry.d1 {
    @Override // io.sentry.d1
    public void c() {
    }

    @Override // io.sentry.d1
    public void d(@NotNull e4 e4Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        e4Var.f(Long.valueOf(jFreeMemory));
        e4Var.g(Long.valueOf(nativeHeapSize));
    }
}
