package j0;

import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @NotNull
    public static final Object a(@Nullable Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    @a1
    public static final <R> R c(@NotNull Object obj, @NotNull Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                h0.d(1);
            } catch (Throwable th2) {
                h0.d(1);
                h0.c(1);
                throw th2;
            }
        }
        h0.c(1);
        return rInvoke;
    }
}
