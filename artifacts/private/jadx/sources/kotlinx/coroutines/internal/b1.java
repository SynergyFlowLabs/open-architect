package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,31:1\n16#2:32\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n29#1:32\n*E\n"})
public final class b1 {
    @k2
    public static final <T> T a(@NotNull Object obj, @NotNull Function0<? extends T> function0) {
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
