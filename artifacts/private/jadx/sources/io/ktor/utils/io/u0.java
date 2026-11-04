package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u0 {
    @Nullable
    public static final Object a(@NotNull h hVar, @NotNull Function2<? super w0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objInvoke = function2.invoke(new w0(hVar), dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }

    @Nullable
    public static final Object b(@NotNull h hVar, @NotNull Function2<? super w0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objInvoke = function2.invoke(new w0(hVar), dVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
    }
}
