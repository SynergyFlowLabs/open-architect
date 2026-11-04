package w2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final <T> T a(@NotNull f lock, @NotNull Function0<? extends T> action) {
        int i10;
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            try {
                tInvoke = action.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return tInvoke;
    }
}
