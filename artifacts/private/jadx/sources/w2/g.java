package w2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,58:1\n23#2:59\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n38#1:59\n*E\n"})
public final class g {
    public static final <T> T a(@NotNull f lock, @NotNull Function0<? extends T> action) {
        int i10;
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            try {
                tInvoke = action.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return tInvoke;
    }
}
