package io.ktor.util;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCoroutinesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,33:1\n1321#2,2:34\n47#3,4:36\n*S KotlinDebug\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n*L\n18#1:34,2\n32#1:36,4\n*E\n"})
public final class a0 {

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n*L\n1#1,49:1\n32#2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements kotlinx.coroutines.o0 {
        public a(kotlinx.coroutines.o0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    @NotNull
    public static final CoroutineContext a(@Nullable p2 p2Var) {
        return q3.a(p2Var).plus(new a(kotlinx.coroutines.o0.L2));
    }

    public static /* synthetic */ CoroutineContext b(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return a(p2Var);
    }

    public static final void c(@NotNull p2 p2Var, int i10) {
        Intrinsics.checkNotNullParameter(p2Var, "<this>");
        System.out.println((Object) (StringsKt.g2(" ", i10) + p2Var));
        Iterator<p2> it = p2Var.r0().iterator();
        while (it.hasNext()) {
            c(it.next(), i10 + 2);
        }
        if (i10 == 0) {
            System.out.println();
        }
    }

    public static /* synthetic */ void d(p2 p2Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        c(p2Var, i10);
    }
}
