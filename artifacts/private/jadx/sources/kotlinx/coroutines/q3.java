package kotlinx.coroutines;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class q3 {
    @NotNull
    public static final a0 a(@Nullable p2 p2Var) {
        return new p3(p2Var);
    }

    public static /* synthetic */ a0 c(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return a(p2Var);
    }

    public static /* synthetic */ p2 d(p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return a(p2Var);
    }

    @Nullable
    public static final <R> Object e(@NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        o3 o3Var = new o3(dVar.getContext(), dVar);
        Object objD = bk.b.d(o3Var, o3Var, function2);
        if (objD == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objD;
    }
}
