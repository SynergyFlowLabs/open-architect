package androidx.savedstate.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final <T> T a(@NotNull e lock, @NotNull Function0<? extends T> action) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            try {
                tInvoke = action.invoke();
                h0.d(1);
            } catch (Throwable th2) {
                h0.d(1);
                h0.c(1);
                throw th2;
            }
        }
        h0.c(1);
        return tInvoke;
    }
}
