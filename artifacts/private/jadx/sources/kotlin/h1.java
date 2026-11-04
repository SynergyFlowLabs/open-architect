package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class h1 extends g1 {
    @kotlin.internal.f
    private static final <R> R l(Object lock, Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        return rInvoke;
    }
}
