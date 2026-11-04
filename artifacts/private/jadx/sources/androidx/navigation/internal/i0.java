package androidx.navigation.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    public static final <T> T a(@NotNull g0 lock, @NotNull Function0<? extends T> action) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            int i10 = 5 ^ 1;
            try {
                tInvoke = action.invoke();
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        return tInvoke;
    }
}
