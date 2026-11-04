package androidx.compose.runtime.internal;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final <T> T a(@NotNull String str, @NotNull Function0<? extends T> function0) {
        b1 b1Var = b1.f35891a;
        Object objA = b1Var.a(str);
        try {
            T tInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            b1Var.b(objA);
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            b1.f35891a.b(objA);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
