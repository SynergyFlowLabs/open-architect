package androidx.compose.ui.util;

import android.os.Trace;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final <T> T a(@NotNull String str, @NotNull Function0<? extends T> function0) {
        Trace.beginSection(str);
        try {
            T tInvoke = function0.invoke();
            h0.d(1);
            Trace.endSection();
            return tInvoke;
        } finally {
            h0.d(1);
            Trace.endSection();
            h0.c(1);
        }
    }

    public static final void b(@NotNull String str, long j10) {
        Trace.setCounter(str, j10);
    }
}
