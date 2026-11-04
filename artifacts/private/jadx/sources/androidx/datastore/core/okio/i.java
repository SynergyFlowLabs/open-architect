package androidx.datastore.core.okio;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public final <T> T a(@NotNull Function0<? extends T> block) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            try {
                tInvoke = block.invoke();
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
