package androidx.datastore.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    @kj.f
    public static final <R> R a(@NotNull kotlinx.coroutines.sync.a aVar, @Nullable Object obj, @NotNull Function1<? super Boolean, ? extends R> block) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zB = aVar.b(obj);
        try {
            R rInvoke = block.invoke(Boolean.valueOf(zB));
            kotlin.jvm.internal.h0.d(1);
            if (zB) {
            }
            return rInvoke;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            if (zB) {
                aVar.i(obj);
            }
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public static /* synthetic */ Object b(kotlinx.coroutines.sync.a aVar, Object obj, Function1 block, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zB = aVar.b(obj);
        try {
            Object objInvoke = block.invoke(Boolean.valueOf(zB));
            kotlin.jvm.internal.h0.d(1);
            if (zB) {
                aVar.i(obj);
            }
            kotlin.jvm.internal.h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            if (zB) {
                aVar.i(obj);
            }
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
