package io.ktor.utils.io.pool;

import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,189:1\n182#1,5:190\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n173#1:190,5\n*E\n"})
public final class i {
    @l(message = "Use useInstance instead", replaceWith = @b1(expression = "useInstance(block)", imports = {}))
    public static final <T, R> R a(@NotNull h<T> hVar, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T tJc = hVar.Jc();
        try {
            return block.invoke(tJc);
        } finally {
            h0.d(1);
            hVar.h8(tJc);
            h0.c(1);
        }
    }

    public static final <T, R> R b(@NotNull h<T> hVar, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T tJc = hVar.Jc();
        try {
            R rInvoke = block.invoke(tJc);
            h0.d(1);
            return rInvoke;
        } finally {
            h0.d(1);
            hVar.h8(tJc);
            h0.c(1);
        }
    }
}
