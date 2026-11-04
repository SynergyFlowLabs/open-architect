package androidx.compose.ui.text.platform;

import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "Synchronization_jvmKt")
public final class b0 {
    @NotNull
    public static final c0 a(@Nullable Object obj) {
        return new c0();
    }

    public static /* synthetic */ c0 b(Object obj, int i10, Object obj2) {
        return new c0();
    }

    @a1
    public static final <R> R c(@NotNull c0 c0Var, @NotNull Function0<? extends R> function0) {
        R rInvoke;
        synchronized (c0Var) {
            try {
                rInvoke = function0.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return rInvoke;
    }
}
