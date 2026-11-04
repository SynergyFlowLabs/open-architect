package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h4 {
    @Nullable
    public static final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objL;
        CoroutineContext context = dVar.getContext();
        s2.y(context);
        kotlin.coroutines.d dVarE = kotlin.coroutines.intrinsics.b.e(dVar);
        kotlinx.coroutines.internal.m mVar = dVarE instanceof kotlinx.coroutines.internal.m ? (kotlinx.coroutines.internal.m) dVarE : null;
        if (mVar == null) {
            objL = Unit.f312394a;
        } else {
            if (kotlinx.coroutines.internal.n.f(mVar.f315092d, context)) {
                mVar.k(context, Unit.f312394a);
            } else {
                g4 g4Var = new g4();
                CoroutineContext coroutineContextPlus = context.plus(g4Var);
                Unit unit = Unit.f312394a;
                mVar.k(coroutineContextPlus, unit);
                objL = (!g4Var.f315018a || kotlinx.coroutines.internal.n.g(mVar)) ? kotlin.coroutines.intrinsics.b.l() : unit;
            }
            objL = kotlin.coroutines.intrinsics.b.l();
        }
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
    }
}
