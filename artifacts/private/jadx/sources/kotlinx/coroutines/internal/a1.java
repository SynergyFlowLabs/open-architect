package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 {
    @k2
    public static /* synthetic */ void a() {
    }

    @k2
    public static final <T> T b(@NotNull Object obj, @NotNull Function0<? extends T> function0) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
            } finally {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
            }
        }
        return tInvoke;
    }
}
