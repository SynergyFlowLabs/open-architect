package androidx.core.os;

import android.os.Trace;
import kotlin.b1;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {
    @kotlin.l(message = "Use androidx.tracing.Trace instead", replaceWith = @b1(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@NotNull String str, @NotNull Function0<? extends T> function0) {
        Trace.beginSection(str);
        try {
            T tInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            Trace.endSection();
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            Trace.endSection();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
