package androidx.navigation.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/navigation/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvmCommon.kt\nandroidx/navigation/internal/SynchronizedObject_jvmCommonKt\n*L\n1#1,58:1\n24#2:59\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/navigation/internal/SynchronizedObjectKt\n*L\n38#1:59\n*E\n"})
public final class h0 {
    public static final <T> T a(@NotNull g0 lock, @NotNull Function0<? extends T> action) {
        int i10;
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            try {
                tInvoke = action.invoke();
                kotlin.jvm.internal.h0.d(1);
            } finally {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
            }
        }
        return tInvoke;
    }
}
