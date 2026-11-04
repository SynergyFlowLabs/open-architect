package androidx.savedstate.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/savedstate/internal/SynchronizedObject_jvmKt\n*L\n1#1,61:1\n23#2:62\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/savedstate/internal/SynchronizedObjectKt\n*L\n41#1:62\n*E\n"})
public final class f {
    public static final <T> T a(@NotNull e lock, @NotNull Function0<? extends T> action) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (lock) {
            try {
                tInvoke = action.invoke();
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
