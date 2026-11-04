package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b4 {
    @NotNull
    public static final Object a(@Nullable Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
            int i11 = 4 & 0;
        }
        if (obj == null) {
            obj = new Object();
        }
        return obj;
    }

    public static final <R> R c(@NotNull Object obj, @NotNull Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
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
