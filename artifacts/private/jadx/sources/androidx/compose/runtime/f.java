package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOldSynchronization.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldSynchronization.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronization_jvmKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,32:1\n33#2:33\n*S KotlinDebug\n*F\n+ 1 OldSynchronization.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronization_jvmKt\n*L\n31#1:33\n*E\n"})
final /* synthetic */ class f {
    @kotlin.l(level = kotlin.n.HIDDEN, message = "not expected to be referenced directly as the old version had to be inlined")
    @kotlin.a1
    @oj.i(name = "synchronized")
    public static final /* synthetic */ <R> R a(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        return rInvoke;
    }
}
