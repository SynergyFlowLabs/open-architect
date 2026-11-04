package t;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,29:1\n26#2:30\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n27#1:30\n*E\n"})
public final class c {
    public static final <T> T a(@NotNull b bVar, @NotNull Function0<? extends T> block) {
        int i10;
        T tInvoke;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (bVar) {
            try {
                tInvoke = block.invoke();
                h0.d(1);
            } finally {
                h0.d(1);
                h0.c(1);
            }
        }
        return tInvoke;
    }
}
